/*
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.
 */
package Ejercicio_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JesusNjo
 */
public class Votos {
    private Alumno alumno;
    private ArrayList <Alumno> votados = new ArrayList();

    public Votos(Alumno alumno) {
        this.alumno = alumno;
    }
   
   
    

    public Votos() {
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

   
    
    

    
    
}
