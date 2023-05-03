/*
/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class AlumnosService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public AlumnosClass crearAlumno() {
        AlumnosClass a = new AlumnosClass();
        List<AlumnosClass> alumnos = new ArrayList<>();
        String op = null;
        do {
            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(input.next());
            List<Integer> notaT = new ArrayList();
            int acumulativo = 0;
            int nota = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese las notas de " + a.getNombre());
                nota = input.nextInt();

                if (nota > 0 && nota <= 20) {

                    acumulativo += nota;
                } else {
                    System.out.println("Error. La nota debe ir entre 1 y 20, vuelva a ingresar la nota");
                    i--;
                }
            }
            notaT.add(acumulativo);
            a.setNota(notaT);
            alumnos.add(new AlumnosClass(a.getNombre(), notaT));

            System.out.println("Alumnos agregado, ¿desea agregar otro alumno?S/N");

            op = input.next();

        } while (!"n".equalsIgnoreCase(op));

        System.out.println("-----------");
        System.out.println("Notas totales de los alumnos: ");
        alumnos.forEach((x) -> System.out.println(x.getNombre() + " / " + x.getNota()));
        notaFinal(alumnos);
        return a;
    }

    public void notaFinal(List<AlumnosClass> x) {
        AlumnosClass n = new AlumnosClass();
        System.out.println("Ingrese el nombre del alumno que desea verificar la nota final");
        String nombreB = input.next();
        for (AlumnosClass alumno : x) {

            if (nombreB.equalsIgnoreCase(alumno.getNombre())) {

                for (AlumnosClass valor : x) {
                    System.out.println("La nota final de " + nombreB + " es: ");
                    System.out.println((double) valor.getNota().get(0) / 3);
                }

            }else{
                System.out.println("Disculpe, su nombre no está en nuestra base de datos");
            }

        }

    }

}
