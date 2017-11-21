/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Numero
        
{
    int numero1,numero2,numero3,maior=0;
    public void comparaNumeros()
    {
    Scanner sc = new Scanner(System.in);
        System.out.println("inserta o primeiro dos numeros");
        numero1 = sc.nextInt();
        System.out.println("inserta o segundo dos numeros");
        numero2 =  sc.nextInt();
        System.out.println("inserta o terceiro dos numeros");
        numero3 = sc.nextInt();
        
        if (numero1 > maior) 
        {
            maior = numero1;

       if (numero2 > maior) 
        {
            maior = numero2;
        }
      if (numero3 > maior) 
        {
            maior = numero3;
        }
        System.out.println("o número maior dos tres é "+maior);
    }
    
}
}
