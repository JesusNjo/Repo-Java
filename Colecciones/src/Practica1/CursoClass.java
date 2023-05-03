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
package Practica1;

import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class CursoClass {
    
    String nombreCurso;
    Integer cantidadDeHoras;
    Integer HorasPorSemana;
    Boolean turno;
    Integer precioPorHora;
    List<String> alumnos;

    public CursoClass() {
    }

    public CursoClass(String nombreCurso, Integer cantidadDeHoras, Integer HorasPorSemana, Boolean turno, Integer precioPorHora, List<String> alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHoras = cantidadDeHoras;
        this.HorasPorSemana = HorasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(Integer cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public Integer getHorasPorSemana() {
        return HorasPorSemana;
    }

    public void setHorasPorSemana(Integer HorasPorSemana) {
        this.HorasPorSemana = HorasPorSemana;
    }

    public Boolean getTurno() {
        return turno;
    }

    public void setTurno(Boolean turno) {
        this.turno = turno;
    }

    public Integer getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Integer precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public List<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }
    
    @Override
    public String toString() {
        return "\nCurso: " +nombreCurso +"\nCantidad de horas por dia: " +cantidadDeHoras +"\nDias por semana: " +HorasPorSemana +
                "\nPrecio por hora: " +precioPorHora+ "\nAlumnos: "+alumnos;
    }
    
}
