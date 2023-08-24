/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author JesusNjo
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService libro = new LibroService();
        LibroClass libroL= libro.crearLibro();
        
        System.out.println(libroL.toString());
        
        libro.menu();
        
    }
    
}
