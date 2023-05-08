/*
Programa Java que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca
el valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por pantalla el 
número de valores que se han leído, su suma y su media. Por último, se mostrarán todos los valores leídos, 
indicando cuántos de ellos son mayores que la media .
 */
package Practica1;

/**
 *
 * @author JesusNjo
 */
public class NumerosMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumerosService n = new NumerosService();
        
        n.numeros();
        
    }
    
}
