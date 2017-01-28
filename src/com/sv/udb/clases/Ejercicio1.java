/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author bernardo
 */
public class Ejercicio1 {
    private int numeroBase;
    private int numeroPote;

    public int getNumeroBase() {
        return numeroBase;
    }

    public void setNumeroBase(int numeroBase) {
        this.numeroBase = numeroBase;
    }

    public int getNumeroPote() {
        return numeroPote;
    }

    public void setNumeroPote(int numeroPote) {
        this.numeroPote = numeroPote;
    }

    
    public int getResultado() {
        int resp = 1;
        try {
            if (numeroPote == 0){
                return 1;
            }
            for (int i = 1; i <= numeroPote; i++) {
                resp = this.multiplicar(resp, numeroBase);
            }
        } catch (Exception e) {
            System.err.println("Error en el Ejercicio1: " + e.getMessage());
        }
        return resp;
    }
    
    private int multiplicar(int num1, int num2) {
        int resp = 0;
        for (int i = 0; i < num1; i++)
        {
            resp += num2;
        }
        return resp;
    }
    
}
