/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho4;

/**
 *
 * @author duran
 */
public class Cavalo extends Animal {
    
  //  String locomocao;

    @Override
    public void EmitirSom(String emitirSom){
         this.emitirSom=emitirSom;
           // System.out.println("Cavalo"+" "+this.emitirSom);
    }
    @Override
    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
     @Override
    public String toString() {
        return "Cavalo" + this.getNome() + "{" + "locomocao=" +" "+ locomocao + "nome =>" + " " + this.getNome()  + "som" + " " + this.getEmitirSom()+ "}";
    }
        @Override
    public  String getEmitirSom(){
        return this.emitirSom;
    }

}
