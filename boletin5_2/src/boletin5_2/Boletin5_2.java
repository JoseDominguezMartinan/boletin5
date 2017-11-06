/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        short numero1,numero2;
        Scanner sc = new Scanner(System.in);
        numero1=sc.nextShort();
        numero2=sc.nextShort();
        if(numero1>=numero2)
            {
                System.out.println(numero1-numero2);
            }
        else
            {
                System.out.println(numero1+numero2);
             }
    }
    
}
