/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Ejercicio_2;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Juego {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Jugador> jugadores = new ArrayList();
    private RevolverAgua Ra = new RevolverAgua();

    

    public Juego() {
    }

    public Juego(RevolverAgua Ra) {
        this.jugadores = jugadores;
        this.Ra = Ra;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public RevolverAgua getRa() {
        return Ra;
    }

    public void setRa(RevolverAgua Ra) {
        this.Ra = Ra;
    }
    
    
    public void llenarJuego(ArrayList<Jugador> jug,RevolverAgua r){
        Jugador j;
        Juego x = new Juego();
        System.out.println("Ingrese la cantidad de jugadores que participarán (Entre 2 y 6)");
        int numJ = input.nextInt();
        if(numJ>=2 && numJ<=6){
            System.out.println("'Ingrese los datos de los jugadores'");
            
        }else{
            System.out.println("Numero de jugadores invalido.. Se autoasignarán 6 jugadores");
            numJ = 6;
        }
        for (int i = 0; i <numJ; i++) {
            j = new Jugador();
            j.setId(i);
            System.out.println("Ingrese el nombre del jugador");
            j.setNombre(input.next());
            j.setMojado(false);
            jug.add(j);
        }
          x.setJugadores(jug);
    }
    
    
    public void ronda() {
        Ra.llenarRevolverA();
        llenarJuego(jugadores, Ra);
        
        boolean juegoTerminado = false;
        int i = 0;
        while (!juegoTerminado) {
            Jugador jugadorActual = jugadores.get(i);
            System.out.println("Es el turno de " + jugadorActual.getNombre());
            
        System.out.println("Posicion de la bala: "+Ra.getPosicionAc());
            System.out.println("Posicion de la bala: "+Ra.getPosicionAg());
            juegoTerminado = Ra.mojar();
            if (juegoTerminado) {
                System.out.println(jugadorActual.getNombre() + " se mojó!");
            } else {
                Ra.siguienteChorro();
                
            }
        }
    }
}