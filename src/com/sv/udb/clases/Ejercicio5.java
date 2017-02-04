/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author bernardo
 */
public class Ejercicio5 {
    private double numero1;
    private double numero2;
    private String ingresado;

    public String getIngresado() {
        return ingresado;
    }

    public void setIngresado(String ingresado) {
        this.ingresado = ingresado;
    }
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
    public double Operar(char operador) {
        double resp = 0;        
        try{
            switch(operador) {
                case '+':
                    resp = numero1 + numero2;
                    break;
                case '-':
                    resp = numero1 - numero2;
                    break;
                case 'x':
                    resp = numero1 * numero2;
                    break;
                case '/':
                    resp = numero1 / numero2;
                    break;
                default:
                    resp = 0;
                    break;
            }
        } catch(Exception ex){ JOptionPane.showMessageDialog(null, "No se pudo realizar la operación");}
        return resp;
    }
}
