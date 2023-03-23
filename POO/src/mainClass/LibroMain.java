/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import java.util.Scanner;
import entidades.LibroClass;

/**
 *
 * @author JesusNjo
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        System.out.println("Ingrese el nombre del libro");
        System.out.println("Ingrese el autor del libro");
        System.out.println("Ingrese la cantidad de paginas del libro");
        
        
        LibroClass libro1 = new LibroClass(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine());
        System.out.println();
        System.out.println();
        System.out.println("-----------");
        
        System.out.println(libro1);
        
        
    }
    
}
