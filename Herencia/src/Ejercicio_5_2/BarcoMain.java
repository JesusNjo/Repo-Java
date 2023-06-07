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
package Ejercicio_5_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BarcoMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Barcos> barcos = new ArrayList();
        AlquilerB alquiler = new AlquilerB();
        barcos.add(new Veleros(8, 548145, 40, 1994));
        barcos.add(new BarcoMotor(50, 718412, 50, 1998));
        barcos.add(new YatesB(12, 60, 84568, 45, 2002));

        System.out.println("Barcos disponibles: ");

        System.out.print("Indique su nombre: ");
        alquiler.setNombreCliente(input.next());
        System.out.print("Indique su documento: ");
        alquiler.setDocumentoCliente(input.nextInt());
        System.out.print("Indique la posicion de amarre: ");
        alquiler.setPosicionAmarra(input.nextInt());
        barcos.forEach((x) -> System.out.println(x.toString()));

        System.out.println("Indique cual desea rentar");
        System.out.println("1:Velero\n2:Barco a motor\n3:Yate");
        int op = input.nextInt();
        
        switch (op) {
            case 1:

                AlquilerB alquilerVelero = new AlquilerB(alquiler.getNombreCliente(), alquiler.getDocumentoCliente(), alquiler.getFechaAlquiler(), alquiler.getFechaRetorno(), alquiler.getPosicionAmarra(), barcos.get(op-1));
                double precioFinal = alquilerVelero.calcularPrecio();
                System.out.println("El precio del alquiler es: $" + precioFinal);
                break;
            case 2:
                AlquilerB alquilerMotor = new AlquilerB(alquiler.getNombreCliente(), alquiler.getDocumentoCliente(), alquiler.getFechaAlquiler(), alquiler.getFechaRetorno(), alquiler.getPosicionAmarra(), barcos.get(op-1));
                double precioFinalM = alquilerMotor.calcularPrecio();
                System.out.println("El precio del alquiler es: $" + precioFinalM);
                break;
            case 3:
                AlquilerB alquilerY = new AlquilerB(alquiler.getNombreCliente(), alquiler.getDocumentoCliente(), alquiler.getFechaAlquiler(), alquiler.getFechaRetorno(), alquiler.getPosicionAmarra(), barcos.get(op-1));
                double precioFinalY = alquilerY.calcularPrecio();
                System.out.println("El precio del alquiler es: $" + precioFinalY);
                break;
            default: ;
        }

    }
}
