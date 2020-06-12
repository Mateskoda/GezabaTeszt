/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.progmatic;

/**
 *
 * @author peti
 */
public class ChildWithPos {
    private Child child;
    private int pos;
    private int nrOfWins;

    public ChildWithPos(Child child) {
        this.child = child;
        this.pos = 0;
        this.nrOfWins = 0;
    }

    public ChildWithPos(Child child, int pos) {
        this.child = child;
        this.pos = pos;
        this.nrOfWins = 0;
    }
    
    

    public Child getChild() {
        return child;
    }

    public int getPos() {
        return pos;
    }

    public int getNrOfWins() {
        return nrOfWins;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    
    public void won(){
        nrOfWins++;
    }
    
}
