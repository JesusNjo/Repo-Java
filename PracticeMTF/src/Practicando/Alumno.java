/*
Ejemplo de herencias en Java. Te mostraremos tres tipos de herencia: Simple: la herencia de la clase 
Persona a Profesor Multinivel: la herencia de Persona a Alumno y 
de Alumno a Practicante Jerárquica: la herencia de Persona a Alumno y a Profesor al mismo tiempo3.
 */
package Practicando;

import java.time.Year;

/**
 *
 * @author JesusNjo
 */
public class Alumno extends Persona{
    protected String materiaAprendida;
    protected Year ingreso;
    private String materiaCursando;

      public Alumno(String materiaAprendida, Year ingreso, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.materiaAprendida = materiaAprendida;
        this.ingreso = ingreso;
        this.materiaCursando = " ";
    }

    public Alumno() {
    }

    public String getMateriaCursando() {
        return materiaCursando;
    }

    public void setMateriaCursando(String materiaCursando) {
        this.materiaCursando = materiaCursando;
    }

    public String getMateriaAprendida() {
        return materiaAprendida;
    }

    public void setMateriaAprendida(String materiaAprendida) {
        this.materiaAprendida = materiaAprendida;
    }

    public Year getIngreso() {
        return ingreso;
    }

    public void setIngreso(Year ingreso) {
        this.ingreso = ingreso;
    }
    

    @Override
    public String toString() {
        return "[Alumno]" +" Materia aprendida " + materiaAprendida + "/ Ingreso: (" + ingreso + ")/ Materia cursando: " + materiaCursando;
    }
    
    
    
}
