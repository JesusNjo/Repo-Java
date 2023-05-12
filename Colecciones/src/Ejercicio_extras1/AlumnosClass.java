/*
Ejercicio1 (utilizar ArrayList)
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y 
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
Necesidades:
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los 
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , 
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
apellido de forma ascendente. 
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
nombre de forma descendente. 
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo 
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas, 
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA.
 */
package Ejercicio_extras1;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class AlumnosClass {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Calendar fechaN;

    public AlumnosClass(String nombre, String apellido, String nacionalidad, Calendar fechaN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaN = (Calendar) fechaN.clone();
    }

    public AlumnosClass() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Calendar getFechaN() {
        return fechaN;
    }

    public void setFechaN(Calendar fechaN) {
        this.fechaN = fechaN;
    }

}
