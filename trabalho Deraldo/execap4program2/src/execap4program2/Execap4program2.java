/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execap4program2;

/**
 *
 * @author Deraldo Paula Leite Duran
 */
public class Execap4program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porta p=new Porta("verde",2.0,3.5,4.8);
        p.show();
        p.abre();
        p.pinta("azul");
        p.show();
        p.fecha();
        p.pinta("vermelho");
        p.show();
    }
    
}
