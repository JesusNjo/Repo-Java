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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner notaTotal = new Scanner(System.in);
       
        System.out.println("Indique su nota");
        int nota = notaTotal.nextInt();
        
        
        while(nota<=0 || nota>10){
            System.out.println("Nota incorrecta, ingrese su nota entre (1/10)");
            
            nota = notaTotal.nextInt();
            
        }if(nota>0 && nota<=10){
        System.out.println("Su nota es: "+nota);
        }
       
    }
    
}
