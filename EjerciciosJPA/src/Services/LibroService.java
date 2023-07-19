/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistence.AutorJpaController;
import Persistence.EditorialJpaController;
import Persistence.LibroJpaController;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class LibroService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AutorJpaController autorJpa = new AutorJpaController();
    LibroJpaController libroJpa = new  LibroJpaController();
    EditorialJpaController editorialJpa = new  EditorialJpaController();
    
    
    
    
    public void crearLibro(Libro libro) throws Exception{
        
        try {
            if(libro == null){
                throw new Exception("El libro no puede esta vacio");
            }
            
            System.out.println("Ingrese el ISBN del libro");
            libro.setIsbn(input.nextLong());
            System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(input.next());
            System.out.println("Ingrese año del libro");
            libro.setAnio(input.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares");
            libro.setEjemplares(input.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares prestados");
            libro.setEjemplares_prestados(input.nextInt());
            
            libro.setEjemplares_restantes(libro.getEjemplares()-libro.getEjemplares_prestados());
            libro.setAlta(true);
            System.out.println("Ingrese el ID del autor");
            int cr = input.nextInt();
            
            Autor autor= autorJpa.getEntityManager().find(Autor.class, cr);
            
            libro.setAutor(autor);
            System.out.println("Ingrese el ID de la editorial");
            int cd = input.nextInt();
            Editorial editorial= editorialJpa.getEntityManager().find(Editorial.class, cd);
            libro.setEditorial(editorial);
            
            libroJpa.create(libro);

             
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarLibro() throws Exception{
        
        try {
            
            int firstResult = 0;
            boolean hayResultado = true;
            ArrayList<Libro> listaLibro = new ArrayList();
            
            while(hayResultado){
                List<Libro> listLibro = libroJpa.findLibroEntities(0, firstResult);
                if(listLibro.isEmpty()){
                    hayResultado = false;
                }else{
                    listaLibro.addAll(listLibro);
                    firstResult += listLibro.size();
                }
                
            }
            System.out.println("Lista de libro");
            for (Libro libro : listaLibro) {
                System.out.println(libro.getIsbn() + "/" +libro.getTitulo());
            }
            System.out.println("Indique el ISBN del libro que desea eliminar");
            Long elim = input.nextLong();
            libroJpa.destroy(elim);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void buscarLibroISBN(){
        try {
            int firstResult = 0;
            boolean hayResult = true;
            ArrayList<Libro> libroBusc = new ArrayList();
            
            while(hayResult){
                List<Libro> libroBuscador = libroJpa.findLibroEntities(0, firstResult);
                if(libroBuscador.isEmpty()){
                    hayResult = false;
                }else{
                    libroBusc.addAll(libroBuscador);
                    firstResult += libroBuscador.size();
                }
            }
            System.out.println("Lista de libros");
            for (Libro libro : libroBusc) {
                System.out.println(libro.getIsbn() + "/" + libro.getTitulo());
            }
            System.out.println("Ingrese el ISBN del libro que desea ver");
            int isbnP= input.nextInt();
            for (Libro libro : libroBusc) {
                if(libro.getIsbn() == isbnP){
                    System.out.println(libro.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroTitulo() {
        int firstResult = 0;
        boolean hayLibros = true;
        ArrayList<Libro> librosB = new ArrayList();
        while(hayLibros){
            List<Libro> librosBusc = libroJpa.findLibroEntities(0, firstResult);
            
            if(librosBusc.isEmpty()){
                hayLibros = false;
            }else{
                librosB.addAll(librosBusc);
                firstResult += librosBusc.size();
            }
        }
        System.out.println("Lista de libros");
        for (Libro libro : librosB) {
            System.out.println(libro.getIsbn() + "/" + libro.getTitulo());
        }
        System.out.println("\nIngrese el nombre del libro que desea buscar");
        String nombreL = input.next();
        for (Libro libro : librosB) {
            if(libro.getTitulo().equalsIgnoreCase(nombreL)){
                System.out.println(libro.toString());
                break;
            }
        }
    }
    public void buscarLibroAutor() {
        int firstResult = 0;
        boolean hayLibros = true;
        ArrayList<Libro> librosB = new ArrayList();
        while(hayLibros){
            List<Libro> librosBusc = libroJpa.findLibroEntities(0, firstResult);
            
            if(librosBusc.isEmpty()){
                hayLibros = false;
            }else{
                librosB.addAll(librosBusc);
                firstResult += librosBusc.size();
            }
        }
        System.out.println("Lista de libros");
        for (Libro libro : librosB) {
            System.out.println(libro.getIsbn() + "/" + libro.getTitulo() + "/" +libro.getAutor().getNombre());
        }
        System.out.println("\nIngrese el autor del libro que desea buscar");
        String nombreA = input.next();
        for (Libro libro : librosB) {
            if(libro.getAutor().getNombre().equalsIgnoreCase(nombreA)){
                System.out.println(libro.toString());
                break;
            }
        }
    }
    public void buscarLibroEditorial() {
        int firstResult = 0;
        boolean hayLibros = true;
        ArrayList<Libro> librosB = new ArrayList();
        while(hayLibros){
            List<Libro> librosBusc = libroJpa.findLibroEntities(0, firstResult);
            
            if(librosBusc.isEmpty()){
                hayLibros = false;
            }else{
                librosB.addAll(librosBusc);
                firstResult += librosBusc.size();
            }
        }
        System.out.println("Lista de libros");
        for (Libro libro : librosB) {
            System.out.println(libro.getIsbn() + "/" + libro.getTitulo() + "/" +libro.getEditorial().getNombre());
        }
        System.out.println("\nIngrese el editorial del libro que desea buscar");
        String nombreE = input.next();
        for (Libro libro : librosB) {
            if(libro.getEditorial().getNombre().equalsIgnoreCase(nombreE)){
                System.out.println(libro.toString());
                break;
            }
        }
    }
}