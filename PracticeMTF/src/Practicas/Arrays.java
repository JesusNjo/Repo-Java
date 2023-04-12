/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        //String apellido1 = "Naranjo";
        System.out.println("Ingrese la cantidad de apellidos que va a ingresar");
        int n = input.nextInt();
        String[] apellidos = new String[n];
        System.out.println("Ingrese los apellidos");
        for(int i =0; i<apellidos.length;i++){
            apellidos[i] = input.next();
        }
        for(int i=0; i<apellidos.length;i++){
            System.out.print("["+apellidos[i]+"]  ");
            
        }
        //Arrays.setAll(apellidos,(a) ->apellidos[a] = "a","b");
    }
    
}
