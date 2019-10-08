/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho4segundaparte;

/**
 *
 * @author duran
 */
public class Empregado extends Pessoa{
    private int codigoFuncional;
    private String localDeEnsino;
    private double salario;
    private String nivel;
    
    public void Salario(String nivel){
        if(nivel.equals("basico")){
            this.salario=(this.getRendaBasica())*1.1 ;
        }
        else if(nivel.equals("medio")){
            this.salario=(this.getRendaBasica()*1.1)*1.5 ;
        }
        else if(nivel.equals("superior")){
            this.salario=(((this.getRendaBasica())*1.1)*1.5)*2 ;
        }
        else{
            this.salario=this.getRendaBasica();
        }
    }
      public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public String getLocalDeEnsino() {
        return localDeEnsino;
    }

    public void setLocalDeEnsino(String localDeEnsino) {
        if(!localDeEnsino.equals("nao") ){
        this.localDeEnsino = localDeEnsino;
        }
        else{
            this.localDeEnsino=null;
        }
    }

    public Empregado(int codigoFuncional, String localDeEnsino, String nivel,String nome) {
        this.codigoFuncional = codigoFuncional;
        this.localDeEnsino = localDeEnsino;
        this.nivel = nivel;
        this.setNome(nome);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
