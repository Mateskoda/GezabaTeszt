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
public class Logger {

    public static boolean doLog = false;

    public static void log(String s) {
        if (doLog) {
            System.out.println(s);

        }
    }
}
