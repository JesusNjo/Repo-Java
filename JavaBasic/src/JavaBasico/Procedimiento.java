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
public class Procedimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Ingrese el primer digito");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo digito");
        num2 = leer.nextInt();
        
        Esmultiplo(num1,num2);
    }
    
    public static void Esmultiplo(int n1, int n2){
        
        
        
        if(n1%n2==0 || n2%n1==0){
            System.out.println("Son multiplos " + n1 + " y " + n2);
        }else{
            System.out.println(n1+" no es multiplo de "+n2);
        }
        
    }
}
