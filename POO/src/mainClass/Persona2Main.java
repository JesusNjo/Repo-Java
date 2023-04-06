/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import JavaService.Persona2Service;
import entidades.Persona2Class;

/**
 *
 * @author JesusNjo
 */
public class Persona2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona2Service persona = new Persona2Service();
        Persona2Class p1 = persona.crearPersona();

        System.out.print("Su edad es: ");
        persona.calcularEdad(p1);
        System.out.println(persona.menorQue(p1));
        System.out.println(persona.mostrarPersona(p1));

    }

}
