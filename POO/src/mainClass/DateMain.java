/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package mainClass;

import entidades.DateClass;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateClass f = new DateClass();

        System.out.println("Ingrese el dia");
        f.setDia(input.nextInt());
        System.out.println("Ingrese el mes");
        f.setMes(input.nextInt());
        System.out.println("Ingrese el año");
        f.setAnio(input.nextInt());

        int dia = f.getDia();
        int mes = f.getMes();
        int anio = f.getAnio();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date hoy = new Date();

        int antiguedad = hoy.getYear() - fecha.getYear();

        System.out.println("Los años de diferencia son: " + antiguedad);

    }

}
