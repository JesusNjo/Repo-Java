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
public class EjercicioGuia12 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String mensaje;
        int lectura_correcta, lectura_incorrecta;
        lectura_correcta = lectura_incorrecta = 0; 
        
        do {
            System.out.println("Por favor ingrese un mensaje");
            mensaje = input.next();
            if(mensaje.length() <= 5 && mensaje.substring(0, 1).equals("X") && mensaje.substring(mensaje.length()-1).equals("O")){
                lectura_correcta ++;
            }else{
                lectura_incorrecta ++;
            }
        } while (!mensaje.equals("&&&&&"));
        
        
        System.out.printf("Lecturas correctas: %d \n Lecturas incorrectas: %d \n", lectura_correcta, lectura_incorrecta);
    }
    
}
