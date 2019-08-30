/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc04.pkg12;

/**
 *
 * @author eu
 */
public class Funcionario {
    double salario;
    String nome;
    String departamento;
     Data DataEntrada;
     String rg;
     boolean presenca=false;

    public Funcionario(double salario, String nome, String departamento, String rg) {
        this.salario = salario;
        this.nome = nome;
        this.departamento = departamento;
        
        this.rg = rg;
    }
    public void aumentarSalario(double a){
         this.setSalario(this.getSalario()+a);
         System.out.println("o novo salario eh"+ " "+ getSalario());
    }
    
    public boolean registrarPresenca(){
        return  this.setPresenca(true);
    }
    
    public boolean registrarAusencia(){
        return  this.setPresenca(false);
    }
     
     public void mostra(){
         System.out.println("___________________________________");
         System.out.println("Nome funcionario" + getNome());
         System.out.println("Departamento" + getDepartamento());
         System.out.println("entrou em:" + getDataEntrada());
         System.out.println("Portador do RG:" + getRg());
         System.out.println("está na empresa no momento?" + isPresenca());
         System.out.println("-------------------------------------");
     }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Data getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(Data DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public boolean setPresenca(boolean presenca) {
        return this.presenca = presenca;
    }

    void registrarPresenca(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
