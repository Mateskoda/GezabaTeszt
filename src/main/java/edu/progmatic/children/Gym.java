package edu.progmatic.children;

import edu.progmatic.Child;
import edu.progmatic.ChildWithPos;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private List<ChildWithPos> children=new ArrayList<>();

    public void addChild(Child c) {
        ChildWithPos cp = new ChildWithPos(c);
        children.add(cp);


    }

    public List<ChildWithPos> getChildren() {
        return children;
    }

    public void simulate() {

//        gb.startGame();
//        for (int i = 0; i < 10000; i++) {
//            gb.playGame();
//        }
//        gb.printResults();
    }
}
