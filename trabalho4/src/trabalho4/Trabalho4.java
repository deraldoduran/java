/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho4;

/**
 *
 * @author duran
 */
public class Trabalho4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cachorro c=new Cachorro();
       c.setNome("juk");
       c.setIdade(2);
       c.setLocomocao("corre 4 patas");
       c.EmitirSom("Auau");
        System.out.println(c.toString());
        Preguica p = new Preguica();
        Cavalo K = new Cavalo();
        p.EmitirSom("fufu");
        p.setNome("joilso");
        p.setIdade(19);
        p.setLocomocao("sobe em árvores");
        System.out.println(p.toString());
        
        K.EmitirSom("rilinch");
        K.setLocomocao("corre 4 patas");
        K.setIdade(12);
        K.setNome("pintch");
        System.out.println(K.toString());
        
        Veterinario v = new Veterinario();
        v.examinar(K);
        v.examinar(c);
        v.examinar(p);
        //Zoologico[] z=new Zoologico[10];
        //z[0].jaula(K);
        
        Zoologico z=new Zoologico();
        z.jaula(K);
        System.out.println(z.toString());
        
        
        
        
    }
    
}
