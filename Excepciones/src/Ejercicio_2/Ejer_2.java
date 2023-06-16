/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango)..
 */
package Ejercicio_2;

/**
 *
 * @author JesusNjo
 */
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CualquierClase clase = new CualquierClase();
        String[] prueba = new String[9];
        
        
        try {
            prueba[10] = "Hola";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR");
            System.out.println(e.toString());
        }
    }
    
}
