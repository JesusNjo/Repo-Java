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
public class Profesor extends Persona {
    private String materia;
    private Year anioDeIngreso;

    public Profesor() {
    }

    public Profesor(String materia, Year anioDeIngreso, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.materia = materia;
        this.anioDeIngreso = anioDeIngreso;
    }

    @Override
    public String toString() {
        return "[Profesor]"+super.toString() + " Materia: " + materia + "/ Año de Ingreso: " + anioDeIngreso;
    }
   
}
