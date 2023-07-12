/*
Ejemplo de herencias en Java. Te mostraremos tres tipos de herencia: Simple: la herencia de la clase 
Persona a Profesor Multinivel: la herencia de Persona a Alumno y 
de Alumno a Practicante Jerárquica: la herencia de Persona a Alumno y a Profesor al mismo tiempo3.
 */
package Practicando;

/**
 *
 * @author JesusNjo
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected long dni;

    public Persona(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Nombre y apellido: "+nombre+" "+apellido+"/ Nº DNI:"+dni ;
    }
}
