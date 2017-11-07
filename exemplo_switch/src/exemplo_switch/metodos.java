package exemplo_switch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdominguezmartinan
 */
public class metodos 
{
   public void comparar(int op)
   {
       switch (op)
       {
           case 1: System.out.println("Luns");
           break;
           case 2: System.out.println("Martes");
           break;
           case 3: System.out.println("Mercores");
           break;
           case 4: System.out.println("Xoves");
           break;
           case 5: System.out.println("Vernes");
           break;
           case 6: System.out.println("Sabado");
           break;
           case 7: System.out.println("Domingo");
           default: System.out.println("Opción non valida");
       }
   }
    
}
