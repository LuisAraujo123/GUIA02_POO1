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
public class Notas {
    private String titu;
    private String desc;
    private String fech;

    public Notas(String titu, String desc, String fech) {
        this.titu = titu;
        this.desc = desc;
        this.fech = fech;
    }
    
    public Notas()
    {}

    public String getTitu() {
        return titu;
    }

    public void setTitu(String titu) {
        this.titu = titu;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
}
    
}
