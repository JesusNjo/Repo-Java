/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package EjercicioExtra5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class TrianguloService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public double calcularArea(TrianguloClass a) {

        return (a.getBase() * a.getAltura()) / 2;
    }

    public void calcularPerimetro(TrianguloClass a) {
        System.out.println("Perimetro: ");
        double longitud = (2 * a.getLado()) + a.getBase();
        System.out.println(longitud);
    }

    public TrianguloClass mayorArea(TrianguloClass[] triangulos) {
        TrianguloClass maxTriangulo = null;
        double maxArea = -1;
        for (TrianguloClass triangulo : triangulos) {
            double area = calcularArea(triangulo);
            
            if (area > maxArea) {
                maxArea = area;
                maxTriangulo = triangulo;
            }
        }
       
        return maxTriangulo;

    }

}


