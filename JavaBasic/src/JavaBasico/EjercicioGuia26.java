/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String socio = "";
        int costo = 0;

        System.out.println("Indique que tipo de socio es");
        socio = leer.nextLine();

        System.out.println("Usted indicó que es un socio tipo: " + socio);

        if ("A".equalsIgnoreCase(socio)) {
            System.out.println("Indique el costo de su tratamiento:");
            costo = leer.nextInt();
            System.out.println("Por ser un socio tipo A su tratamiento de valor: " + costo + " queda reducido por un 50%");
            System.out.println("Total a pagar: " + (costo * 0.50));
        }
        if ("B".equalsIgnoreCase(socio)) {
            System.out.println("Indique el costo de su tratamiento:");
            costo = leer.nextInt();
            System.out.println("Por ser un socio tipo B su tratamiento de valor: " + costo + " queda reducido por un 35%");
            System.out.println("Total a pagar: " + (costo - (costo*0.35)));
        }
        if ("C".equalsIgnoreCase(socio)) {
            System.out.println("Indique el costo de su tratamiento:");
            costo = leer.nextInt();
            System.out.println("Total a pagar: " + costo);
        }

    }

}
