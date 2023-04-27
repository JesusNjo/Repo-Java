/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Clase1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class MascotaMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        ServicioMascota crear = new ServicioMascota();
        
        crear.crearMascota();
        crear.mostrarMascota();
        
        System.out.println("Desea agregar otra mascota?");
        String op = input.next();
        if("si".equalsIgnoreCase(op)){
            crear.agregarMascota();
        }
    }
    
}
