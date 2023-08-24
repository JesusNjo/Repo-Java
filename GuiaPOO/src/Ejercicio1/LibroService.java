/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class LibroService {

    LibroClass libro;
    List<LibroClass> listaLibros = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public void menu(){
        int op = 0;
        
        do {            
            System.out.println("--MENU--\n1:Crear libro - 2: Ver libros");
            op = input.nextInt();
            switch(op){
                case 1: crearLibro();
                break;
                case 2: consultarLibros();
                break;
                default: System.out.println("Opcion invalida");
                
            }
            
        } while (op !=0);
    }

    public LibroClass crearLibro() {

        try {
            System.out.println("Ingrese la cantidad de libro que desea ingresar");
            int cant = input.nextInt();

            for (int i = 0; i < cant; i++) {
                libro = new LibroClass();
                System.out.println("---LIBRO Nº "+(i+1));
                double ISBN = Math.round(Math.random() * 484848) + 1;
                int Pag = (int) ((Math.random() * 484) + 1);
                libro.setISBN(String.valueOf(ISBN));
                System.out.println("Ingrese el nombre del autor del libro");
                libro.setAutor(input.next());
                System.out.println("Ingrese el titulo del libro");
                libro.setTitulo(input.next());
                libro.setNumeroPaginas(Math.round(Pag));
                
                if(libro.getAutor().trim().isEmpty() || libro.getTitulo().trim().isEmpty()){
                    System.out.println("El libro no puede tener datos vacios....");
                }else{
                    listaLibros.add(libro);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return libro;
    }
    
    public void consultarLibros(){
        System.out.println("--LISTA LIBROS--");
        for (LibroClass listaLibro : listaLibros) {
            System.out.println(listaLibro.toString());
        }
    }
}
