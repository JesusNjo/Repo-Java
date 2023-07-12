/*
Ejemplo de herencias en Java. Te mostraremos tres tipos de herencia: Simple: la herencia de la clase 
Persona a Profesor Multinivel: la herencia de Persona a Alumno y 
de Alumno a Practicante Jerárquica: la herencia de Persona a Alumno y a Profesor al mismo tiempo3.
 */
package Practicando;

import java.time.Year;

/**
 *
 * @author JesusNjo
 */
public class Practicante extends Alumno {

    public Practicante(String materiaAprendida, Year ingreso, String nombre, String apellido, long dni) {
        super(materiaAprendida, ingreso, nombre, apellido, dni);
    }
    

    public Practicante() {
    }

   public String toString() {
    return super.toString().replace("Alumno", "Practicante").replace("/ Materia cursando:", "");
}  
    
}
