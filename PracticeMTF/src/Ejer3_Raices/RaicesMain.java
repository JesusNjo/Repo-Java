/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3_Raices;

import Ejer3_Raices.RaicesClass;
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
        RaicesClass raices = new RaicesClass();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el valor de a: ");
        raices.setA(input.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        raices.setB(input.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        raices.setC(input.nextDouble());
        raices.calcular();
    }

}
