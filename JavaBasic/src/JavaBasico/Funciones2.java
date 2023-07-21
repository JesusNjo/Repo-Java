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
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String texto;
        System.out.println("Ingresa un texto:");
        texto = leer.nextLine();
        String retorno = cambiarCaracter(texto);
        System.out.println(retorno);
        
    }
    public static String cambiarCaracter (String texto){
        
        String sub = texto;
        sub = sub.replace("a", "@");
        sub = sub.replace("A", "@");
        sub = sub.replace("e", "#");
        sub = sub.replace("E", "#");
        sub = sub.replace("i", "$");
        sub = sub.replace("I", "$");
        sub = sub.replace("o", "%");
        sub = sub.replace("O", "%");
        sub = sub.replace("u", "*");
        sub = sub.replace("U", "*");
        
        return sub;
    }
    
}
