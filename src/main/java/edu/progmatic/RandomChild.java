/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;

import edu.progmatic.Child;
import edu.progmatic.Step;
import java.util.Random;

/**
 *
 * @author peti
 */
public class RandomChild implements Child{
    Random r = new Random();

    @Override
    public Step step(int[] positions) {
        int nextInt = r.nextInt(3);
        if(nextInt == 0){
            return Step.BACK;
        }
        else if(nextInt == 1){
            return Step.STAY;
        }
        return Step.FORWARD;
    }

    @Override
    public void setMyIdx(int idx) {
    }

    @Override
    public void finished(int[] positions) {
    }
}
