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
public abstract class Animal {
    String nome;
    int idade;
    String emitirSom;
    String locomocao;
   
    public void EmitirSom(String emitirSom){
         this.emitirSom=emitirSom;
            System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public abstract String getLocomocao();
    public abstract String getEmitirSom();
}