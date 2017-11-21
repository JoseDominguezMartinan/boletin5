/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan= new Scanner(System.in);
        String nome;
        float vendas;
        
        System.out.println("Introduzca no nome do artigo:");
        nome=scan.next();
        System.out.println("Introduzca o numero de vendas do artigo:");
        vendas=scan.nextFloat();
        Artigos obxArtigos=new Artigos(nome,vendas);
        obxArtigos.vendas();
    }
    
}
