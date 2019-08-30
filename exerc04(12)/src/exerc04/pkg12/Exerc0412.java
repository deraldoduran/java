/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.ArrayList;
//package exerc04.pkg12;

/**
 *
 * @author eu
 */
public class Exerc0412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f;
        f = new Funcionario(1000.24,"Joilson","VASP","0001"
                 );
        f.registrarPresenca();
        f.mostra();
        f.registrarAusencia();
        f.mostra();
        Data data= new Data();
        Funcionario f1=new Funcionario(2,"Irineu","VASP","0002");
       // f1.DataEntrada=data;
       f.aumentarSalario(820);
       f.mostra();
       
      // Funcionario[] colaboradores= new Funcionario[20];
      // colaboradores[0]= new Funcionario(1000.24,"Joilson","VASP","0001");
    }
    
}
