/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package EjercicioExtra;

/**
 *
 * @author JesusNjo
 */
public class FraccionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FraccionService num= new FraccionService();
        FraccionClass n = new FraccionClass();
        
        num.ejecutarServicio(n);
        
    }
    
}
