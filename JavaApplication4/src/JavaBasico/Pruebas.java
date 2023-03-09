/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int n1;
        int n2;
        float res;
        
        System.out.println("Ingrese un numero");
        n1= leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        n2= leer.nextInt();
        
        res = n1 + n2;
        System.out.println(res);
        
        
    }
    
}
