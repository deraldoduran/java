/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author eu
 */
public class Pessoa {
    String nome;
    int idade;
    public int aniversario(){
        this.idade= ++idade;
        return idade;
    }
    public void novaIdade(){
        System.out.print("a idade depois do aniversario" + " " + getIdade());
                
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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
    
}
