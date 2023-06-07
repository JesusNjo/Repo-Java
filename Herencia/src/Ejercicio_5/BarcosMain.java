/*

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarcosMain {

    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList();
        barcos.add(new Velero("ABC123", 10, 2000, 2));
        barcos.add(new BarcoAMotor("DEF456", 15, 2005, 500));
        barcos.add(new Yate("GHI789", 20, 2010, 1000, 4));

        Scanner input = new Scanner(System.in);
        System.out.println("Elija un barco para alquilar:");
        for (int i = 0; i < barcos.size(); i++) {
            System.out.println(i + " - " + barcos.get(i).getClass().getSimpleName());
        }
        int opcionBarco = input.nextInt();

        System.out.println("Indique la fecha de alquiler (AÑO/MES/DÍA)");
        int anioAlquiler = input.nextInt();
        int mesAlquiler = input.nextInt();
        int diaAlquiler = input.nextInt();
        LocalDate fechaAlquiler = LocalDate.of(anioAlquiler, mesAlquiler, diaAlquiler);

        System.out.println("Indique la fecha de devolución (AÑO/MES/DÍA)");
        int anioDevolucion = input.nextInt();
        int mesDevolucion = input.nextInt();
        int diaDevolucion = input.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anioDevolucion, mesDevolucion, diaDevolucion);

        Alquiler alquiler = new Alquiler("Juan Perez", "12345678", fechaAlquiler,
                fechaDevolucion, 1, barcos.get(opcionBarco));
        double precio =alquiler.calcularPrecio();
        System.out.println("El precio del alquiler es: $" + precio);
    }
}
