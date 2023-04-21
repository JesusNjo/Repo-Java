/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package EjercicioExtra7;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class AutoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public AutoClass crearAuto() {
        AutoClass ficha = new AutoClass();
        System.out.println("Nombre del conductor");
        ficha.setNombre(input.next());
        System.out.println("Ingrese fecha de vencimiento de la licencia DD/MM/AAAA: ");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();
        Date fecha = new Date(dia, mes - 1, anio - 1900);
        ficha.setFechaV(fecha);
        System.out.println("Ingrese el modelo del auto");
        ficha.setModelo(input.next());
        System.out.println("Ingrese el color del auto");
        ficha.setColor(input.next());

        return ficha;
    }

    public void modificar(AutoClass mod) {
        String ope = null;
        System.out.println("¿Desea cambiar de propietario? S/N");
        ope = input.next();

        if ("s".equalsIgnoreCase(ope)) {

            System.out.println("Nombre del nuevo dueño");
            mod.setNombre(input.next());
            System.out.println("Ingrese fecha de vencimiento de la licencia de " + mod.getNombre() + " DD/MM/AAAA");
            int dia = input.nextInt();
            int mes = input.nextInt();
            int anio = input.nextInt();
            //Calendar fecha = Calendar.getInstance(Locale.ITALY);
            Date fecha = new Date(dia, mes - 1, anio - 1900);
            mod.setFechaV(fecha);

        }
    }

    public void recorrido(AutoClass km) {
        System.out.println("Ingrese la cantidad de kilometros recorridos");
        int nK = input.nextInt();
        km.setKilometraje(km.getKilometraje() + nK);
        System.out.println("El auto tiene un total de kilometros de: " + km.getKilometraje());
        int limiteMant = 10000;
        if (km.getKilometraje() >= limiteMant) {
            System.out.println("El auto necesita hacerle servicio!");
        } else {
            System.out.println("Le queda " + (limiteMant - km.getKilometraje()) + " para hacer servicio!");
        }

    }
}
