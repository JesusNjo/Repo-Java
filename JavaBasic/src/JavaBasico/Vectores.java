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
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer = new Scanner(System.in);
      
      String[] equipo = new String[6];
     
      String aux = "";
      
      
      
      for(int i=0;i<equipo.length;i++){
      System.out.println("Indique el miembro del equipo Nº"+(i+1));
      equipo[i]= leer.next();
      }
       for(String elemento: equipo){
            aux +=" "+  elemento;
        }
      
      System.out.println(aux);
    }

    
}
