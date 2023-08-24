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
public class Frases {
    
    
    public void frases(String frase){
        
        if(frase.length() == 8){
            System.out.println("Frase correcta");
        }else{
            System.out.println("Frase incorrecta");
        }
        
    }
}
