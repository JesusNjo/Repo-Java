/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Ejercicio_4;
import java.util.ArrayList;
/**
 *
 * @author JesusNjo
 */
public class Persona {
    String nombre;
    String apellido;
    int dni;
    ArrayList<Perro> persona = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String apellido,int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Perro> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Perro> persona) {
        this.persona = persona;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\nNombre:" + nombre + "\nApellido: " + apellido + "\nDNI: " + dni;
    }

    
   

   
}
