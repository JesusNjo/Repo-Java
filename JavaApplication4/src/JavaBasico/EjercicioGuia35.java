/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int N = input.nextInt();

        int totalHijos = 0;
        double totalEdades = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int M = input.nextInt();

            int sumEdades = 0;
            for (int j = 1; j <= M; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edad = input.nextInt();
                sumEdades += edad;
                totalHijos++;
            }

            double mediaEdadFamilia = (double) sumEdades / M;
            System.out.println("La media de edad de los hijos de la familia " + i + " es: " + mediaEdadFamilia);

            totalEdades += sumEdades;
        }

        double mediaEdadTotal = totalEdades / totalHijos;
        System.out.println("La media de edad de todos los hijos de todas las familias es: " + mediaEdadTotal);
    }
}
    
    

