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
package Practicas;

import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JesusNjo
 */
public class CursoClass {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private String nombreCurso;
    private byte cantidadHorasPorDia;
    private byte cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos;

    public CursoClass(String nombreCurso, byte cantidadHorasPorDia, byte cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public CursoClass() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public byte getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(byte cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public byte getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(byte cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

   



    public CursoClass crearCurso() {
        CursoClass cur = new CursoClass();
        System.out.println("Ingrese el nombre del curso");
        cur.setNombreCurso(input.next());
        System.out.println("Ingrese la cantidad de horas a cursar por dia");
        cur.setCantidadHorasPorDia(input.nextByte());
        System.out.println("Ingrese la cantidad de dias a cursar por semana");
        cur.setCantidadDiasPorSemana(input.nextByte());
        System.out.println("¿Que turno desea crear este curso?");
        String[] opciones = {"Mañana", "Tarde", "Noche"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Mañana, tarde, noche", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        System.out.println(opcionSeleccionada);

        if (opcionSeleccionada == 0) {
            cur.setTurno(opciones[0]);
            System.out.println(cur.getTurno());
        } else if (opcionSeleccionada == 1) {
            cur.setTurno(opciones[1]);
        } else if (opcionSeleccionada == 2) {
            cur.setTurno(opciones[2]);
        }
        System.out.println("Ingrese el costo del curso por hora");
        cur.setPrecioPorHora(input.nextInt());
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos a cursar")); //Para crear prompt en JAVA
        System.out.println(num);
        System.out.println("Ingrese los alumnos a cursar: ");
        String[] alum = new String[num];
        for(int i = 0; i<alum.length;i++){
            alum[i] = input.next();
        }
        cur.setAlumnos(alum);
        return cur;
    }
    
    public void mostrarInfo(){
        CursoClass p1 = new CursoClass();
        System.out.println("Nombre" + p1.getNombreCurso());
    }

}
