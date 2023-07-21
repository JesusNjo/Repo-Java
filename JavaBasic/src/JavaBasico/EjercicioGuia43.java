/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] alumnos = new double[10];
        double evaluativo = 0;
        double evaluativo2 = 0;
        double integrador = 0;
        double integrador2 = 0;

        System.out.println("Las notas van entre 1 y 10");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese las notas del alumno: " + (i + 1));

            evaluativo = (input.nextInt() * 100);
            evaluativo2 = (input.nextInt() * 150);
            integrador = (input.nextInt() * 250);
            integrador2 = (input.nextInt() * 500);

            double total = (evaluativo + evaluativo2 + integrador + integrador2) / 100;
            if (total > 100) {
                System.out.println("Las notas no puede pasar del 100%");
                break;
            }
            alumnos[i] = total;
        }

        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i] >= 70) {
                System.out.println("El alumno: " + (i + 1) + " fue aprobado, consiguio el: " + alumnos[i] + "% de la nota total");
                System.out.println("Promedio: " + alumnos[i] / 10);
                System.out.println();
            } else {
                System.out.println("El alumno: " + (i + 1) + " fue reprobado, su nota fue: " + alumnos[i] + "% de la nota total");
                System.out.println("Promedio: " + alumnos[i] / 10);
                System.out.println();

            }
        }

    }

}
