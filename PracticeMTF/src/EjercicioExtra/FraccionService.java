/*
 Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package EjercicioExtra;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class FraccionService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public FraccionClass crearServicio(FraccionClass n) {

        System.out.println("Ingrese numerado del numero 1");
        n.setN1(input.nextInt());
        System.out.println("Ingrese denominador del numero 1");
        n.setN1D(input.nextInt());
        System.out.println("Ingrese numerado del numero 2");
        n.setN2(input.nextInt());
        System.out.println("Ingrese denominador del numero 2");
        n.setN2D(input.nextInt());
        System.out.println("Eliga una opcion");

        return n;
    }

    public void ejecutarServicio(FraccionClass n) {
        int op = 0;
        do {
            System.out.println("Opcion 1: Sumar"
                    + "\nOpcion 2: Restar"
                    + "\nOpcion 3: Multiplicar"
                    + "\nOpcion 4: Dividir"
                    + "\n\nOpcion 5:Salir ");
            op = input.nextInt();
            if(op<5){
                
                crearServicio(n);
            }

            switch (op) {
                case 1:
                    suma(n);
                    break;
                case 2:
                    resta(n);
                    break;
                case 3:
                    multiplicacion(n);
                    break;
                case 4:
                    division(n);
                    break;
                default:
                    System.out.println("Salió del sistema");
            }
        } while (op != 5);
    }

    public void suma(FraccionClass s) {
        int resultado = (s.getN1() * s.getN2D()) + s.getN2() * s.getN1D();
        System.out.println("(" + s.getN1() + "x" + s.getN2D() + ")+" + "(" + s.getN2() + "x" + s.getN1D() + ")" + "=" + resultado);

        System.out.println("-----");
        System.out.println(s.getN1D() * s.getN2D());
    }

    public void resta(FraccionClass s) {
        int resultado = (s.getN1() * s.getN2D()) - s.getN2() * s.getN1D();
        System.out.println("(" + s.getN1() + "x" + s.getN2D() + ")-" + "(" + s.getN2() + "x" + s.getN1D() + ")" + "=" + resultado);

        System.out.println("-----");
        System.out.println(s.getN1D() * s.getN2D());
    }

    public void multiplicacion(FraccionClass s) {
        double numerador = s.getN1() * s.getN2D();
        double denominador = s.getN2() * s.getN1D();
        double resultado = numerador * denominador;
        System.out.println("(" + s.getN1() + "x" + s.getN2D() + ")*" + "(" + s.getN2() + "x" + s.getN1D() + ")" + "=" + resultado);
    }

    public void division(FraccionClass s) {
        double numerador = s.getN1() * s.getN2D();
        double denominador = s.getN2() * s.getN1D();
        double resultado = numerador / denominador;
        System.out.println(numerador + "/" + denominador + "=" + resultado);
    }
}
