/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package EjerciciosManosALO1;

import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class jugadorext {
    
    private ArrayList<jugadorEnti> equipo = new ArrayList();

    public jugadorext() {
    }

    public ArrayList<jugadorEnti> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<jugadorEnti> equipo) {
        this.equipo = equipo;
    }
    
    
    
    
}
