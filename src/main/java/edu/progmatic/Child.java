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
public interface Child {
    Step step(int[] positions);
    void setMyIdx(int idx);
    void finished(int[] positions);
}
