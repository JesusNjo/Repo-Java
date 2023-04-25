/*
Jerarquía de figuras geométricas: En este ejercicio, puedes crear una clase abstracta Figura 
que tenga métodos abstractos para calcular el área y el perímetro.
Luego, puedes crear clases concretas como 
Circulo, Rectangulo y Triangulo que extiendan la clase Figura y proporcionen implementaciones para estos métodos. 
Por ejemplo, 
la clase Circulo podría tener un atributo radio y sobrescribir el método calcularArea 
para devolver el valor de Math.PI * radio * radio.
 */
package EjercicioInternet;

/**
 *
 * @author JesusNjo
 */
public class FiguraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FiguraService x = new FiguraService();
       
       x.calcularArea();
       
       
     
    }
    
}
