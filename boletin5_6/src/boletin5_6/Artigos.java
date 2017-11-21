/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

/**
 *
 * @author jdominguezmartinan
 */
public class Artigos {
    String nome;
    float vendas;

    public Artigos(String nome, float vendas) {
        this.nome = nome;
        this.vendas = vendas;
    }
    
    public void vendas(){
        if (vendas<=100)
            System.out.println("Artigo de baixo consumo");
        else if (vendas>100 && vendas<=500)
            System.out.println("Artígo de medio consumo.");
        else if (vendas>500 && vendas<=1000)
            System.out.println("Artígo de alto consumo");
        else
            System.out.println("Artículo de primeira necesidade");
    }
    
}
