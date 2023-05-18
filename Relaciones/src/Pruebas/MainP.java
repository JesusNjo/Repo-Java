/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author JesusNjo
 */
public class MainP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String razaBuscar = "BEAGLE";
        for (Raza aux : Raza.values()) {

            System.out.println(aux.ordinal()); //Las posiciones;
            System.out.println(aux.toString()); // Los valores
            if(aux.equals(razaBuscar)){ //<----MAL
                System.out.println("Encontrado..");
            }
            
            if(aux.toString().equals(razaBuscar)){ //<----BIEN
                System.out.println("Encontrado...");
            }
          
        }
    }

}
