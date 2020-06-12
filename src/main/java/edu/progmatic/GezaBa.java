/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;

import java.util.*;

/**
 *
 * @author peti
 */
public class GezaBa {

    private List<ChildWithPos> children = new ArrayList<>();
    private final int lengthOfGym = 10;
    private final int maxClaps = 100;
    private int clapNr = 0;
    private static final int DOING_PULLUP = -1;

    public void playGame() {
        while (!isFinished()) {
            clap();
        }
    }

    private void clap() {
        clapNr++;
        int[] pos = positions();
        for (ChildWithPos cp : children) {
            Step step = cp.getChild().step(copy(pos));
            if (cp.getPos() != DOING_PULLUP) {
                switch (step) {
                    case BACK:
                        cp.setPos(Math.max(0, cp.getPos() - 1));
                        break;
                    case FORWARD:
                        cp.setPos(cp.getPos() + 1);
                        break;
                    default:
                        break;
                }
            }
        }
        for (ChildWithPos cp : children) {
            Logger.log(cp.getChild().getClass().getName() + ": is at " + cp.getPos());
        }
    }

    public void addChild(Child ch) {
        ChildWithPos cp = new ChildWithPos(ch);
        children.add(cp);
    }

    public void startGame() {
        for (int i = 0; i < children.size(); i++) {
            ChildWithPos cp = children.get(i);
            cp.getChild().setMyIdx(i);
        }
    }

    private boolean isFinished() {
        boolean finished;
        int childrenAtGoalLine = 0;
        for (ChildWithPos childWithPos : children) {
            if (childWithPos.getPos() == lengthOfGym) {
                childrenAtGoalLine++;
            }
        }
        if (childrenAtGoalLine == 1) {
            finished = true;
            noteWinner();
        } else {
            if (childrenAtGoalLine > 1) {
                sendThemToPullUp();
            }
            finished = (everyOnePullsUp() || clapNr == maxClaps);
        }
        if (finished) {
            tellChildrenItFinished();
            restart();
            Logger.log("One round is finished");
        }
        return finished;
    }

    public void printResults() {
        Map<String, Integer> mapOfWinners = new HashMap<>();
        for (ChildWithPos cp : children) {
            final String name = cp.getChild().getClass().getName();
            System.out.println("Child " + name + " won " + cp.getNrOfWins() + " times");
            if (cp.getNrOfWins() > 0) {
                mapOfWinners.putIfAbsent(name, 0);
                mapOfWinners.put(name, mapOfWinners.get(name) + cp.getNrOfWins());

            }
        }
        System.out.println("\nSUMMARY");
        Set<Map.Entry<String, Integer>> entrySet = mapOfWinners.entrySet();
        List<Map.Entry<String, Integer>> l = new ArrayList<>();
        l.addAll(entrySet);
        l.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        }.reversed());
        for (Map.Entry<String, Integer> entry : l) {
            System.out.println(entry.getKey() + " won " + entry.getValue() + " times");
        }
    }

    private int[] positions() {
        int[] pos = new int[children.size()];
        int i = 0;
        for (ChildWithPos childWithPos : children) {
            pos[i] = childWithPos.getPos();
            i++;
        }
        return pos;
    }

    private int[] copy(int[] pos) {
        return Arrays.copyOf(pos, pos.length);

    }

    private void tellChildrenItFinished() {
        int[] positions = positions();
        for (ChildWithPos childWithPos : children) {
            childWithPos.getChild().finished(copy(positions));
        }
    }

    private void restart() {
        for (ChildWithPos cp : children) {
            cp.setPos(0);
        }
        clapNr = 0;
    }

    private void sendThemToPullUp() {
        for (ChildWithPos childWithPos : children) {
            if (childWithPos.getPos() == lengthOfGym) {
                childWithPos.setPos(DOING_PULLUP);
            }
        }
    }

    private void noteWinner() {
        for (ChildWithPos childWithPos : children) {
            if (childWithPos.getPos() == lengthOfGym) {
                childWithPos.won();
            }
        }
    }

    private boolean everyOnePullsUp() {
        for (ChildWithPos cp : children) {
            if(cp.getPos() != DOING_PULLUP){
                return false;
            }
        }
        return true;
    }
}
