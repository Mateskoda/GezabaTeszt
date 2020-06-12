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
public abstract class PositionAwareChild implements Child {

    protected int myPos = 0;
    protected int[] positions;
    protected int myIdx;

    @Override
    public Step step(int[] positions) {
        this.positions = positions;
        Step myStep = doStep();
        if (myStep == Step.FORWARD) {
            myPos++;
        } else if (myStep == Step.BACK) {
            myPos--;
        }
        return myStep;
    }

    public abstract Step doStep();

    @Override
    public void setMyIdx(int idx) {
        myIdx = idx;
    }

    @Override
    public void finished(int[] positions) {
        this.positions = positions;
        myPos = 0;
        doFinished();
    }

    protected void doFinished() {

    }

}
