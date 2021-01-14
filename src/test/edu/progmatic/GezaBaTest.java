package edu.progmatic;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.Map;

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
    void addChild() {
    }

    @org.junit.jupiter.api.Test
    void startGame() {
        GezaBa gb = context.getBean("gezaBaWithOneRandom",GezaBa.class);
//    gb.startGame();
//    Map<String,Integer> mapOfWinners =new HashMap<>();
//        for (int i = 0; i <100 ; i++) {
//            gb.playGame();
//        }
//        gb.printResults();
        assertEquals(1,gb.getChildren().size());

        GezaBa gb2 = context.getBean("gezaBaWithNoOne",GezaBa.class);
//        gb2.startGame();
//    Map<String,Integer> mapOfWinners =new HashMap<>();
//        for (int i = 0; i <1 ; i++) {
//            gb2.playGame();
//        }
//        gb2.printResults();
        assertEquals(true,gb2.getChildren().isEmpty());

    }


    @org.junit.jupiter.api.Test
    void printResults() {
//        GezaBa gb = context.getBean("gezaBaWithOneRandom",GezaBa.class);
//    gb.startGame();
//    Map<String,Integer> mapOfWinners =new HashMap<>();
//        for (int i = 0; i <1 ; i++) {
//            gb.playGame();
//        }
//        gb.printResults();
//        Map<String, Integer> mapOfWinners = new HashMap<>();
//        for (ChildWithPos cp : children) {
//            final String name = cp.getChild().getClass().getName();
//            System.out.println("Child " + name + " won " + cp.getNrOfWins() + " times");
//            if (cp.getNrOfWins() > 0) {
//                mapOfWinners.putIfAbsent(name, 0);
//                mapOfWinners.put(name, mapOfWinners.get(name) + cp.getNrOfWins());

            }
    }
