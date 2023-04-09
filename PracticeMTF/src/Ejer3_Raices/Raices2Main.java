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
public class Raices2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices2Class raices = new Raices2Class();
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