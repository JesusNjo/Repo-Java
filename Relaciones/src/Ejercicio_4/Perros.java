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

/**
 *
 * @author JesusNjo
 */
public class Perros {
    private String nombreP;
    private String raza;
    private int edad;
    private String tamanio;

    public Perros(String nombreP, String raza, int edad, String tamanio) {
        this.nombreP = nombreP;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public Perros() {
    }
    

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
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

    @Override
    public String toString() {
        return "[\nNombre: " + nombreP + "/ Raza:" + raza + "/ Edad:" + edad + "/Tamaño:" + tamanio+"]";
    }
    
    
    
}
