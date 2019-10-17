/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author duran
 */
public abstract class Funcionarios {
    private String nome;
    private String id;
     private String funcao;
     private String loja;

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }
    public Funcionarios(String nome, String id, String funcao,String loja) {
        this.nome = nome;
        this.id = id;
        this.funcao = funcao;
        this.loja= loja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    
    //public abstract void Funcao();

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
