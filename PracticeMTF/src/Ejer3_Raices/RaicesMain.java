/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3_Raices;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RaicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        RaiceService raizS = new RaiceService();
        RaicesClass raices = raizS.asignarValores();
        
        System.out.print("Ingrese el valor de a: ");
        raices.setA(input.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        raices.setB(input.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        raices.setC(input.nextDouble());

        
        raizS.calcular(raices);
    }
    
}
