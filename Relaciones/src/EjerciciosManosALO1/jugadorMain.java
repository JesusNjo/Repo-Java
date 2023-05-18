/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package EjerciciosManosALO1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class jugadorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<jugadorEnti> crearJ = new ArrayList();
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        jugadorext equipo = new jugadorext();
        jugadorEnti jugador = new jugadorEnti();

        /*jugador.setNombre("Cristiano");
        jugador.setApellido("Ronaldo");
        jugador.setPosicion("Delantero");
        jugador.setNumero(7);*/
        
        
        System.out.println("Ingrese la cantidad de jugadores que quiere agregar");
        int op = input.nextInt();

        for (int i = 0; i < op; i++) {
            System.out.print("Nombre: ");
            jugador.setNombre(input.next());
            System.out.print("Apellido: ");

            jugador.setApellido(input.next());
            System.out.print("Posición: ");

            jugador.setPosicion(input.next());
            System.out.print("Número: ");

            jugador.setNumero(input.nextInt());

            crearJ.add(new jugadorEnti(jugador.getNombre(),jugador.getApellido(),jugador.getPosicion(),jugador.getNumero()));
            equipo.setEquipo(crearJ);
            System.out.println();
        }
        
        crearJ.forEach((x)->System.out.println(x.toString())) ;

    }

}
