/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import javax.swing.JTextField;

/**
 *
 * @author duran
 */
public class Clientes {
    private String nome;
    private String idade;
    private String sexo;
    private String local;

    Clientes(JTextField no, JTextField idade, JTextField sexo, JTextField loj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Clientes(String nome, String idade, String sexo, String local) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.local = local;
    }
    
    
}
