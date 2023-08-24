/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author JesusNjo
 */
public class EnterosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EnterosSQRT enteros = new EnterosSQRT();
       
        System.out.println(enteros.numeroPP(3) * 2);
        System.out.println(enteros.numeroPP(3) * 3);
        System.out.println(enteros.numeroPP(Math.sqrt(3)));
    }
    
}
