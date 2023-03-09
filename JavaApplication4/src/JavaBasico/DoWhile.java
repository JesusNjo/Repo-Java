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
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int x;
        int r=0;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero");
            x = leer.nextInt();
            
            if(r>0 && x>0){
            System.out.print(x + "+" + r); 
            }
           
            contador++;
            
            if(x>0){
            r+=x;
            System.out.println("="+r);
            }
           if(x == 0){
            System.out.println("Se capturó el numero cero");
            break;
        }
            
    }while(contador <20); // Si esto es falso se sale (SI X PASA DE 20 SE SALE)
        
        if(contador == 20){
        System.out.println("Ya ingresó los 20 digitos, ha salido del buclé");
        }   
    }
    
}
