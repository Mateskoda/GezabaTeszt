/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;

import edu.progmatic.Logger;
import edu.progmatic.Step;
import edu.progmatic.children.PositionAwareChild;

import java.util.Random;

/**
 *
 * @author peti
 */
public class SmartRandomChild extends PositionAwareChild {
    
    Random r = new Random();

    @Override
    public Step doStep() {
        Logger.log("I am currently at: " + myPos);
        if(myPos < 9){
            Logger.log("I will go fwd (myPs < 9)");
            return Step.FORWARD;
        }
        int nextInt = r.nextInt(3);
        if(nextInt == 0){
            Logger.log("I will go back");
            return Step.BACK;
        }
        else if(nextInt == 1){
            Logger.log("I will stay");
            return Step.STAY;
        }
        Logger.log("I will go fwd");
        return Step.FORWARD;
    }
    
}
