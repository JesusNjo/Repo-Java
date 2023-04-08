/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package Ejer2_Puntos;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PuntoService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public PuntosClass crearPuntos(){
        
        PuntosClass p = new PuntosClass();
        //PUNTOS X Y Y : 1
        System.out.println("Ingrese las coordenadas del punto X1");
        p.setX1(input.nextDouble());
        System.out.println("Ingrese las coordenadas del punto Y1");
        p.setY1(input.nextDouble());
        //PUNTOS X Y Y : 2
        System.out.println("Ingrese las coordenadas del punto X2");
        p.setX2(input.nextDouble());
        System.out.println("Ingrese las coordenadas del punto Y2");
        p.setY2(input.nextDouble());
        
        return p;
    }
    
    public double calcular(PuntosClass c){
        //Usar Teorema de pitagoras 
        double distanciaP = Math.sqrt(Math.pow(c.getX2() - c.getX1(), 2) + Math.pow(c.getY2() - c.getY1(), 2));
        return distanciaP;
    }
    
}
