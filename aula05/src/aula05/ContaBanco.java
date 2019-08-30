/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author eu
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t=="CC"){
            this.setSaldo(50);
            
        }else if(t=="CP"){
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada pois tem" + getsaldo());
        }else if (this.getSaldo() < 0){
            System.out.println("Conta nao pode ser fechada pois tem" + getsaldo());
        }else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
        
    }
    
    public void depositar(double d){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+d);
            
        }
        
    }
    
    public void sacar(double s){
        if (this.isStatus()){
            if (this.getSaldo()>= s){
            this.setSaldo(this.getSaldo()-s);
            System.out.println("______________________________________________" );
            System.out.println("saque no valor de" + s + "realizado");
            System.out.println("______________________________________________" );
        }else{
                System.out.println("______________________________________________" );
                System.out.println("saldo insuficiente" + getSaldo());
            }
        
    }else{
            System.out.println("______________________________________________" );
            System.out.println("conta inativa");
                    
        }
    }
    
    public void pagarMensalidade(){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else if(this.getTipo().equals("CC")){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("______________________________________________" );
            System.out.println(v + "mensalidade paga com sucesso!" + " "+"Saldo atual" + this.getSaldo());
        }else{
            System.out.println("______________________________________________" );
            System.out.println("impossivel pagar a conta esta fechada!");
        }
        
    }
    
    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void estadoAtual(){
        System.out.println("______________________________________________" );
        System.out.println("Conta"+" " + getNumConta());
        System.out.println("Dono"+ " " + getDono());
        System.out.println("Tipo"+ " " + getTipo());
        System.out.println("Saldo"+" " + getSaldo());
        System.out.println("Status" +" "+ isStatus());
        System.out.println("______________________________________________" );
    }
    
}
