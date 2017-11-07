/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_switch;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Exemplo_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        
        Scanner res=new Scanner(System.in);
        metodos obx = new metodos();
        System.out.println("****MENÚ****\n 1-LUNS\n 2-MARTES\n 3-MERCORES\n 4-XOVES\n 5-VERNES\n 6-SABADO\n 7-DOMINGO\n PREME UNHA OPCIÓN");
        int op=res.nextInt();
        obx.comparar(op);
                
    }
    
}
