/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner op=new Scanner(System.in);
        Figuras figura=new Figuras();
        System.out.println("1.Cadrado\n 2.Triangulo\n 3.Circulo\n escolla unha opción");
        int opcion=op.nextInt();
        figura.calcular(opcion);
        
    }
    
}
