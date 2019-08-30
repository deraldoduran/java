/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author eu
 */
public class Caneta {
     public String modelo;
    private double ponta;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo=m;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    public void status(){
        System.out.println("modelo" + this.modelo);
        System.out.println("ponta" + this.ponta);
    }
    
}


