/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.sv.udb.clases;

import java.util.Random;
/**
 *
 * @author bernardo
 */
public class Ejercicio4 {
    private int Pin;
    private int numI;
    private Random rnd;

    public Ejercicio4() {
        this.numI = 0;
        this.rnd = new Random();
        this.Pin = (int)(this.rnd.nextDouble() * 10000);
        
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    public int getNumI() {
        return numI;
    }

    public void setNumI(int numI) {
        this.numI = numI;
    }
    
}
