package edu.progmatic;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestSpringConfig.class)
public class GezaBaTest {
    @Autowired
    ApplicationContext context;


    @org.junit.jupiter.api.Test
    void playGame() {
    }


    @org.junit.jupiter.api.Test
    void startGame() {
        GezaBa gb = context.getBean("gezaBaWithOneRandom", GezaBa.class);
        assertEquals(1, gb.getChildren().size());
//    gb.startGame();
//    Map<String,Integer> mapOfWinners =new HashMap<>();
//        for (int i = 0; i <100 ; i++) {
//            gb.playGame();
//        }
//        gb.printResults();

        GezaBa gb2 = context.getBean("gezaBaWithNoOne", GezaBa.class);
        assertEquals(true, gb2.getChildren().isEmpty());
//        gb2.startGame();
//    Map<String,Integer> mapOfWinners =new HashMap<>();
//        for (int i = 0; i <1 ; i++) {
//            gb2.playGame();
//        }
//        gb2.printResults();
        GezaBa gb3 = context.getBean("gezaBaWithThreeRandom", GezaBa.class);
        assertEquals(3, gb3.getChildren().size());

    }


    @org.junit.jupiter.api.Test
    void printResults() {
        GezaBa gb = context.getBean("gezaBaWithOneRandom", GezaBa.class);
        Map<String, Integer> mapOfWinners = new HashMap<>();
        for (ChildWithPos cp : gb.getChildren()) {
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
      assertEquals(100,mapOfWinners.get("edu.progmatic.children.RandomChild"));
    }
}
