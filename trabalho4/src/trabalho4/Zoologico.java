/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho4;

import java.util.ArrayList;

/**
 *
 * @author duran
 */
public class Zoologico {
   // private String jaula;
    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<Animal>();
    }
    public void jaula(Animal a){
        //for(Animal i:animais){
        if (animais.size()<10){
        animais.add(a);
        }
        }

    @Override
    public String toString() {
        return "Zoologico{" + "animais=" + animais + '}';
    }
    
    
}
