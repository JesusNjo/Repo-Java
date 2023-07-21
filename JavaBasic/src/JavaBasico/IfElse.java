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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        
        int n2 = leer.nextInt();
        
        
        if(n1>25 && n2>25){
            System.out.println("Ambos son mayor a 25");
        }
        if(n1>25){
            System.out.println("Su numero es mayor a 25: "+ n1);
        }else{
            System.out.println("Su numero es menor a 25:" +n1);
        }
        if(n2>25){
            System.out.println("Su numero es mayor a 25: "+ n2);
        }else{
            System.out.println("Su numero es menor a 25: "+ n2);
        }
        
    }
    
}
