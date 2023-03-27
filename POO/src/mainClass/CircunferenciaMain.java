/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package mainClass;

import entidades.CircuferenciaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CircunferenciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircuferenciaClass radio = new CircuferenciaClass();

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los datos de su parametro");
        radio.setRadio(input.nextDouble());

        System.out.println(radio.crearCircunferencia());
        System.out.println("El area de su parametro es: " + radio.area());
        System.out.println("El perimetro de su parametro es: " + radio.perimetro());

    }
}
