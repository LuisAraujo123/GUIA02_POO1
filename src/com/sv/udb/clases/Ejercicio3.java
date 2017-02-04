/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author bernardo
 */
public class Ejercicio3 extends javax.swing.JPanel { 
    private int numero;
    private String text;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String[] cicloFinal() {
        String[] ciclo = new String[10];
        long[] ant = new long[10];
        for (int i = 0; i < 10; i++){
            ciclo[i] = "";
            for(int i2 = 0; i2 < i+1; i2++) {
                ciclo[i] = ciclo[i]+1;
            }
            ant[i] = Long.valueOf(ciclo[i]) * Long.valueOf(ciclo[i]);
            ciclo[i] = String.valueOf(ant[i]);
            //JOptionPane.showMessageDialog(this, ant[i]);
        }
        ciclo[9] = ciclo[9].substring(0, 9) + ciclo[9].substring(10);
        for (int x = 0; x < 10; x++){
            String txt = "";
            for(int y = 0; y < ciclo[x].length(); y++){
                //JOptionPane.showMessageDialog(this, String.valueOf(ciclo[x].charAt(y)));
                int val = Integer.parseInt(String.valueOf(ciclo[x].charAt(y))) + x;
                if (val >= 10) {
                    val = val - 10;
                }
                txt = txt + val;
            }
            ciclo[x] = txt;
        }
        return ciclo;
    }
    
    public void regre() {
        
    }
    
}
    
/*public Ejercicio3(){
this.setSize(250, 280); //se selecciona el tamaño del panel
}
//Se crea un método cuyo parámetro debe ser un objeto Graphics
public void paint(Graphics grafico) {
Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

ImageIcon Img = new ImageIcon(getClass().getResource("/com/sv/udb/images/fondo.png")); 

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, this);

setOpaque(false);
super.paintComponent(grafico);
}
}
    
*/