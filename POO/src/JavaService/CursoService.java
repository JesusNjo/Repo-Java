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
se repite el encuentro.
 */
package JavaService;

import entidades.CursoClass;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CursoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public CursoClass crearCurso() {
        CursoClass curso = new CursoClass();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(input.next());
        System.out.println("Ingrese la cantidad de horas cursadas por dia");
        curso.setCantidadHorasPorDia(input.nextInt());
        System.out.println("Ingrese la cantidad de dias cursadas por semana");
        curso.setCantidadDiasPorSemana(input.nextInt());
        int turno;

        do {
            System.out.println("¿Que turno se realizará el curso? 1: Mañana / 2: Tarde");
            turno = input.nextInt();
            if (turno == 1) {
                curso.setTurno("Mañana");
            } else if (turno == 2) {
                curso.setTurno("Tarde");
            } else {
                System.out.println("El turno que indico no se encuentra disponible para el curso");
            }
        } while (turno != 1 && turno != 2);

        System.out.println("Ingrese el costo del curso por hora");
        curso.setPrecioPorHora(input.nextInt());
        System.out.println("Ingrese los alumnos a cursar");
        cargarAlumnos(curso);
        return curso;

    }

    public String[] cargarAlumnos(CursoClass alum) {
        String[] nombresAlumnos = new String[5];

        for (int i = 0; i < nombresAlumnos.length; i++) {
            System.out.println("Por favor ingrese el nombre del alumno " + (i + 1));
            nombresAlumnos[i] = input.next();

        }
        alum.setAlumnos(nombresAlumnos);

        return alum.getAlumnos();

    }

    public void calcularGananciaSemanal(CursoClass g) {
        int gananciaDiaria = g.getCantidadHorasPorDia() * g.getPrecioPorHora();
        int gananciaSemanal = gananciaDiaria * g.getCantidadDiasPorSemana();
        int total = gananciaSemanal * g.getAlumnos().length;
        System.out.println("Su ganancia semanal será: " + total + "$");
    }

    public void mostrarInfo(CursoClass curso) {
        System.out.println();
        System.out.println("   ------Información del curso------    ");
        System.out.println();
        System.out.println(curso.toString());
        System.out.println("Alumnos: " + Arrays.toString(curso.getAlumnos()));
    }

}
