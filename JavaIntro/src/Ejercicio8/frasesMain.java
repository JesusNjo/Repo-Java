/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si 
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Ejercicio8;

/**
 *
 * @author JesusNjo
 */
public class frasesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frases frase = new Frases();
       
       frase.frases("amiguito");
    }
    
}
