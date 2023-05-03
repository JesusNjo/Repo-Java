/*
  Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro..
 */
package Practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CursoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    List<CursoClass> curso = new ArrayList();

    public void Curso() {
        CursoClass x = new CursoClass();

    }

    public void cargarAlumnos() {
        int cantidad = 5;
        String[] alumnos = new String[5];
        CursoClass n = new CursoClass();
        List<String> alum = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alum.add(input.next());
        }
        System.out.println("Lista de alumnos");
        n.setAlumnos(alum);
        alum.forEach((x)
                
                -> System.out.println(x));

    }

    public void crearCurso(CursoClass x) {
        CursoClass p = new CursoClass();
        System.out.println("Nombre del curso");
        p.setNombreCurso(input.next());
        System.out.println("Ingrese las horas a cursar por dia");
        p.setCantidadDeHoras(input.nextInt());
        System.out.println("Ingrese la cantidad de dias a cursar por semana");
        p.setHorasPorSemana(input.nextInt());
        System.out.println("Indique el turno M/T");
        System.out.println(input.nextBoolean());
        System.out.println("Ingrese el precio por hora");
        p.setPrecioPorHora(input.nextInt());

        List<CursoClass> datos = new ArrayList();

        System.out.println(datos.size());
        for (int i = 0; i < datos.size(); i++) {
            datos.add(x);
            x = datos.get(i);
            System.out.println(x);
        }

        //datos.forEach((x)->System.out.println(x));
    }

    public void mostrarInfo() {

    }
}
