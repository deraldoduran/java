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
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.estadoAtual();
        p1.abrirConta("CC");
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono("Crreuza");
        p2.estadoAtual();
        p2.abrirConta("CP");
        p2.estadoAtual();
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
