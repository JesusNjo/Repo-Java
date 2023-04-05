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
public class CursoService2 {
    public class CursoServicio {
        
    public CursoClass crearCurso (){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String nombreCurso;
        int cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        int turno;
        double precioPorHora;
        
        System.out.println("Por favor ingrese el nombre del curso");
        nombreCurso = input.next();
        System.out.println("Por favor ingrese la cantidad de horas por día impartidas.");
        cantidadHorasPorDia = input.nextInt();
        System.out.println("Por favor ingrese la cantidad de dias por semana que se imparte el curso");
        cantidadDiasPorSemana = input.nextInt();
        do {
            System.out.println("Por favor ingrese el número correspondiente al turno en que se imparte el curso: 1 -> mañana, 2 -> tarde");
            turno = input.nextInt();
        } while (turno != 1 && turno != 2);
        System.out.println("Por favor indique el precio por hora del curso");
        precioPorHora = input.nextDouble();
        System.out.println("Por favor ingrese los nombres de los alumnos del curso.");
        
        return new CursoClass();
    }
    
    public String[] cargarAlumnos (Scanner input){
        String [] nombresAlumnos = new String [5];
        Arrays.setAll(nombresAlumnos, (i) -> {
            System.out.println("Por favor ingrese el nombre del alumno " + (i+1));
            return input.next();
        });
        return nombresAlumnos;
    }
    
    public void calcularGananciaSemanal(CursoClass course){
        System.out.printf("La ganancia semanal del curso %s = %f COP \n", course.getNombreCurso(), (course.getPrecioPorHora() * course.getCantidadHorasPorDia() * course.getCantidadDiasPorSemana() * course.getAlumnos().length));
    }
    
    public void mostrarDataCourse (CursoClass course){
        System.out.println(course.toString());
    }
}
}
