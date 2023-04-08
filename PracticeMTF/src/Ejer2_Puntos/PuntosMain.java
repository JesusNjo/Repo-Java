/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package Ejer2_Puntos;

/**
 *
 * @author JesusNjo
 */
public class PuntosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoService pointS = new PuntoService();
        PuntosClass punto = pointS.crearPuntos();
        
        
        pointS.calcular(punto);
        System.out.println("La distancia entre los dos puntos es: " + pointS.calcular(punto));
    }
    
}
