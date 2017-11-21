/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author jdominguezmartinan
 */
public class Persoas {
         public static void compara(int persoa1, int persoa2){
        if (persoa1>persoa2){
            System.out.println("Persona 1 pesa más");
            System.out.println("Diferencia: "+(persoa1-persoa2));
        }
        else if(persoa1<persoa2){
            System.out.println("Persona 2 pesa más");
            System.out.println("Diferencia: "+(persoa2-persoa1));
        }
        else System.out.println("Ambas personas pesan lo mismo.");
    }
    
}
