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
public class Porta {
    boolean aberta=true;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    public void show(){
        System.out.println("a porta e da cor" + " " + getCor()+ " " + "e esta aberta" + " "+ isAberta());
    }
    public void pinta(String cor){
        this.setCor(cor);
    }
    
public boolean fecha(){
   
        return aberta=false;
    
}
public boolean abre(){
    return this.aberta=true;
}

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
            
    
}
