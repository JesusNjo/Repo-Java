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
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0;
        int n1,n2,n3,n4;
       
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer dígito");
            n1 = leer.nextInt();
        System.out.println("Ingrese el segundo dígito");
            n2 = leer.nextInt();
        System.out.println("Ingrese el tercer dígito");
            n3 = leer.nextInt();
        System.out.println("Ingrese el cuarto dígito");
            n4 = leer.nextInt();
            
            
           
           if(i<n1){
               System.out.print(n1);
               for(int j =1; j<=n1;j++){
                  System.out.print("*"); 
               }System.out.println(); }
           
           
           
           
           if(i<n2){
               System.out.print(n2);
               for(int j =1; j<=n2;j++){
                  System.out.print("*");
               }System.out.println();}
           
           
           
           if(i<n3){
               System.out.print(n3);
               for(int j =1; j<=n3;j++){
                System.out.print("*");}
                System.out.println();}
           
           
           
           
            if(i<n4){
               System.out.print(n4);
               for(int j =1; j<=n4;j++){
                System.out.print("*");
               }System.out.println();}
    }    
}
