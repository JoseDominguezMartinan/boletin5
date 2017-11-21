/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scan=new Scanner(System.in);
        Persoas obxPersoas=new Persoas();
        int peso1, peso2;
        System.out.println("introduce o peso das persoas a comparar");
        peso1=scan.nextInt();
        peso2=scan.nextInt();
        
        Persoas.compara(peso1, peso2);
    }
    }
    

