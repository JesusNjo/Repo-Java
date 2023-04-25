/*
Jerarquía de figuras geométricas: En este ejercicio, puedes crear una clase abstracta Figura 
que tenga métodos abstractos para calcular el área y el perímetro.
Luego, puedes crear clases concretas como 
Circulo, Rectangulo y Triangulo que extiendan la clase Figura y proporcionen implementaciones para estos métodos. 
Por ejemplo, 
la clase Circulo podría tener un atributo radio y sobrescribir el método calcularArea 
para devolver el valor de Math.PI * radio * radio
 */
package EjercicioInternet;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class FiguraService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public FiguraClass calcularArea() {
        FiguraClass area = new FiguraClass();

        System.out.print("Ingrese el tipo de figura que desea calcular: ");
        String op = input.next().toLowerCase();

        if ("circulo".equals(op)) {
            Circulo(area);
        } else {

            switch (op) {

                case "rectangulo":
                    Rectangulo(area);
                    break;
                case "triangulo":
                    Triangulo(area);
                    break;
                default : System.out.println("Figura no valida");
            }
        }

        return area;
    }

    public void Circulo(FiguraClass c) {
        System.out.println("Ingrese el radio del circulo");
        double radio = input.nextDouble();
        c.setRadio(Math.PI * Math.pow(radio, 2));
        c.setPerimetro(2 * Math.PI * radio);

        System.out.println("El radio de su circulo es: " + c.getRadio());
        System.out.println("El perimetro de su circulo es: " + c.getPerimetro());

    }

    public void Rectangulo(FiguraClass r) {

        System.out.println("Ingrese la base de su rectangulo");
        double base = input.nextDouble();
        System.out.println("Ingrese la altura de su rectangulo");
        double altura = input.nextDouble();

        r.setArea(base * altura);
        r.setPerimetro(2 * base + 2 * altura);
        
        
        System.out.println("El area de su rectangulo es: " + r.getArea());
        System.out.println("El perimetro de su rectangulo es: " + r.getPerimetro());
    }

    public void Triangulo(FiguraClass t) {
        System.out.println("Ingrese la base de su triangulo");
        double base = input.nextDouble();
        System.out.println("Ingrese la altura de su triangulo");
        double altura = input.nextDouble();
        System.out.println("Ingrese el tamaño de los lados");
        double[] lados = new double[3];
        double acumular = 0;
        for (int i = 0; i < lados.length; i++) {

            lados[i] = input.nextDouble();
            double lado = lados[i];
            acumular += lado;
        }

        t.setArea((base * altura) / 2);
        t.setPerimetro(acumular);

        System.out.println("El area de su triangulo es: " + t.getArea());
        System.out.println("El perimetro de su triangulo es: " + t.getPerimetro());

    }

}
