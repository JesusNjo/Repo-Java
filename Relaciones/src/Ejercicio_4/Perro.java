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
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        //this.persona = persona;
    }

  

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

   /* public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


   */

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nTamaño: " + tamanio;
    }
    
    
    
    

   

    
    
    
}
