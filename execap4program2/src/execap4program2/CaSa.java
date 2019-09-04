/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execap4program2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author eu
 */
public class CaSa {
    String cor;
    ArrayList<Porta> portas= new ArrayList<Porta>();
    
    

    public CaSa(String cor) {
        this.cor = cor;
    }
    
    public void contaportaaberta() {
        int cont=0;
        for(Porta i: portas){
            if(i.isAberta()){
                cont ++;
            }
        }
         System.out.println("A quantidade de portas abertas na casa"+" "+cont); 
    }
    
    public void adicionarPorta(){
        System.out.println("digite uma cor");
        String corporta;
        Scanner s=new Scanner(System.in); 
        corporta=s.next();
        Porta b=new Porta(corporta);
        this.portas.add(b);
        
    }
}
