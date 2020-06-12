/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic.children;


import edu.progmatic.Child;
import edu.progmatic.Step;

/**
 *
 * @author peti
 */
public class DullChild implements Child {

    @Override
    public Step step(int[] positions) {
        return Step.FORWARD;
    }

    @Override
    public void setMyIdx(int idx) {
    }

    @Override
    public void finished(int[] positions) {
    }

    
}
