/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        Scanner sc = new Scanner(System.in);
        numero=sc.nextInt();
        if (numero>0)
        {
           System.out.println("+");
           
        }
        else if (numero<0)
        {
            System.out.println("-");
        }
        else
        {
            System.out.println("0");
        }
        
    }
    
}
