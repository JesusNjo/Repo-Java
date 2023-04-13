/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package Ejer6_Juego;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 *
 */
public class JuegoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    JuegoClass juego = new JuegoClass();

    public JuegoClass crearJuego() {
        String[] palabras = {"objetos", "arrays", "poo", "java", "javascript","milenio","react","html","longitud","dinero"};
        juego.setBuscar(palabras[(int) (Math.random() * 10)].split(""));
        return juego;
    }

    public void longitudVec(JuegoClass juego) {
        System.out.println("La longitud de la palabra es: " + juego.getBuscar().length);
        juego.setJugadasMax(juego.getBuscar().length);
    }

    public void buscar(JuegoClass c) {

        int intentos = c.getJugadasMax();
        String[] vectorAx = new String[c.getBuscar().length];
        Arrays.setAll(vectorAx, i->"_");
       boolean sonIguales = false;

        do {
            System.out.println("Ingrese una letra para el juego");
            String letra = input.next();
            int cont = 0;
            for (int i = 0; i < c.getBuscar().length; i++) {
                if (letra.equalsIgnoreCase(c.getBuscar()[i])) {
                    cont++;

                }
            }
            if (cont > 0) {

                for (int i = 0; i < c.getBuscar().length; i++) {
                    if (c.getBuscar()[i].equals(letra)) {
                        vectorAx[i] = letra;
                        System.out.println(Arrays.toString(vectorAx));
                    }
                }
                System.out.println("La letra " + letra + " esta está " + cont + " veces");

            } else {
                System.out.println("Letra " + letra + " no encontrada");
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos");
            }

            if (Arrays.equals(c.getBuscar(), vectorAx)) {
                sonIguales = true;
                System.out.println(Arrays.toString(vectorAx));
                System.out.println(Arrays.toString(c.getBuscar()));

            }

        } while (sonIguales == false && intentos != 0);
        if (sonIguales == true) {
            System.out.println("\nFelicidades. Completo el juego!");
        } else {
            System.out.println("\nAcabaron sus intentos! HA PERDIDO");
        }
    }
    
    public void juego(JuegoClass c){
        crearJuego();
        longitudVec(c);
        buscar(c);
    }
}


    