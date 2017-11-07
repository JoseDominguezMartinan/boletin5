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
public class Figuras
{
    double superficie;
    
    Scanner sc=new Scanner(System.in);
    
    public void calcular(int opcion)
    {
        
        
        switch (opcion) 
        {
             case 1:
                 System.out.println("inserte a base");
                 double base=sc.nextDouble();
                 System.out.println("inserte a altura");
                 double altura=sc.nextDouble();
                superficie = base*altura;
                System.out.println("a superficie é "+superficie);
             break;
             case 2:
                 System.out.println("inserte a base");
                 double base1=sc.nextDouble();
                 System.out.println("inserte a altura");
                 double altura1=sc.nextDouble();
                 superficie=base1*altura1/2;
                 System.out.println("a superficie é "+superficie);
                 
             break;
             case 3:
                 System.out.println("inserte o radio");
                 double radio=sc.nextDouble();
                 superficie= Math.PI*Math.pow(radio,2);
              
             default: System.out.println("non existe esa opción");
                 
                 
                 
        
    }
    
    }
}
