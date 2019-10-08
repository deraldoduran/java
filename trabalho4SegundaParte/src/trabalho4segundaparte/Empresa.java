/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho4segundaparte;

import java.util.ArrayList;

/**
 *
 * @author duran
 */
public class Empresa {
    ArrayList<Empregado> empresa;
    
    public Empresa(){
        empresa=new ArrayList();
    }
    public void tamanhoDaEmpresa(Empregado i){
        if(empresa.size()<10){
            empresa.add(i);
        }
    }
/*public void print(){    
    for(Empregado i: empresa){
        
    }
}
*/
    @Override
    public String toString() {
        String print="";
        for(Empregado i: empresa){
        print=print+i;
    }
        return "Empresa{" + "empresa=" + print + '}';
    }
    
}
