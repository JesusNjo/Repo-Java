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

import java.util.Scanner;

/**
 *

 */
public class JuegoService {

    Scanner leer = new Scanner(System.in);
    JuegoClass juego = new JuegoClass();

    public JuegoClass crearJuego() {
        String[] palabras = {"Objetos", "Arrays", "POO", "Java", "JavaScript"};
        juego.setCantLetras(0);
        System.out.println("Ingrese una palabra");
        juego.setBuscar(palabras[(int) Math.random() * 5].split(""));
        return juego;
    }

    public void longitudVec(JuegoClass juego) {
        System.out.println("La longitud de la palabra es " + juego.getBuscar().length
                + "\nTiene un intento por letra!");

    }

    public void buscar(JuegoClass b) {
        String[] palabraCompleta = new String[b.getBuscar().length];
        String letra;
        int x;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        x = 0;
        for (int i = 0; i < b.getBuscar().length; i++) {
            if (letra.equalsIgnoreCase(b.getBuscar()[i])) {
                
                if(letra.equals(b.getBuscar()[i].substring(i+1))){
                    x++;
                }
                
                
            }
        }

        if (x > 0) {
            System.out.println("La letra esta: "+x+"veces");
            System.out.println("La letra si se encuentra en la palabra");

        } else {
            System.out.println("La letra no se encuentra en la palabra.");

        }
    }

    public boolean encontradas(JuegoClass b) {
        int x;
        int intentos= b.getBuscar().length;
        intentos--;
        
        int longitud = b.getBuscar().length;
        buscar(b);
        do {
            if (intentos == longitud) {
                System.out.println("Se terminaron sus intentos, no lo completó");
                return true;
            } else {
                System.out.println("");
                return false;
            }
        } while (intentos < longitud);

    }

}
