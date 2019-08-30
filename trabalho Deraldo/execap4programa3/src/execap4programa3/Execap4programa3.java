/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execap4programa3;

/**
 *
 * @author Deraldo Paula Leite Duran 
 */
public class Execap4programa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Casa c= new Casa();
        c.show();
        c.pintar("roxo");
        c.fecharPorta1(false);
        c.fecharPorta3(false);
        c.abrirPorta2(true);
        c.show();
    }
    
}
