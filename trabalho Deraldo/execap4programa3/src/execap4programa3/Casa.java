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
public class Casa {
    String cor;
    boolean porta1=true;
    boolean porta2=true;
    boolean porta3=true;
    
    public void pintar(String cor){
        this.setCor(cor);
    }
    public void show(){
        int n=0;
        System.out.println("a cor eh" + " " + getCor());
        if(this.porta1==false){
            n++;
        }if (this.porta2==false){
            n++;
        }if (this.porta3==false){
            n++;
        }
        System.out.println("sao"+ " "+ n+" "+ "portas abertas");
    }
    public void fecharPorta1(boolean porta){
        this.setPorta1(porta);
    }
    public void fecharPorta2(boolean porta){
        this.setPorta2(porta);
    }
    public void fecharPorta3(boolean porta){
        this.setPorta3(porta);
    }
    public void abrirPorta1(boolean porta){
        this.setPorta1(porta);
    }
    public void abrirPorta2(boolean porta){
        this.setPorta2(porta);
    }
    public void abrirPorta3(boolean porta){
        this.setPorta3(porta);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }
    
}
