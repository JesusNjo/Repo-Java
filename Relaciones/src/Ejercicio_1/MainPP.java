/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Ejercicio_1;

/**
 *
 * @author JesusNjo
 */
public class MainPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Fer", "Beagle", 2, "Chiquito");
        Perro perro2 = new Perro("Bruno", "Pastor ingles", 4, "Mediano");
        
        Persona persona1 = new Persona("Nagger", "Navas", 40, 2152482L, perro1);
        Persona persona2 = new Persona("Dorys", "Erazo", 30, 1824852L, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        
    }
    
}
