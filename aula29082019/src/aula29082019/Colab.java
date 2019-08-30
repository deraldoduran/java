/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula29082019;

/**
 *
 * @author eu
 */
public class Colab {
    private String nome;
    private int salario;
    private String função;

    public Colab(String nome, int salario, String função) {
        this.nome = nome;
        this.salario = salario;
        this.função = função;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }
    
    
}
