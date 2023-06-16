/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Inte;

/**
 *
 * @author JesusNjo
 */
public class Jarvis {

    /**
     * @param args the command line arguments
     */
   
   
    public static void main(String[] args) {
        Generador generador = new Generador();
        Armadura armadura = new Armadura("Rojo", "Oro", 50, generador);

        armadura.caminar(10);
        armadura.correr(5);
        armadura.propulsar(2);
        armadura.volar(3);

        System.out.println("Nivel de salud: " + armadura.getNivelDeSalud());
    }
}

    

