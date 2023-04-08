/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes
 */
package Ejer1_Cancion;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CancionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        CancionClass newCan = new CancionClass();
        System.out.println("Ingrese el titulo de la cancion");
        newCan.setTitulo(input.next());
        System.out.println("Ingrese el auto de la cancion");
        newCan.setAutor(input.next());
        String cancion = "Titulo: "+newCan.getTitulo() +" | Autor: "+ newCan.getAutor();
        
        System.out.println(cancion.toUpperCase());
    }
    
}
