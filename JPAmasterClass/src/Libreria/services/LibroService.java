/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.services;

import Libreria.entities.Autor;
import Libreria.entities.Editorial;
import Libreria.entities.Libro;
import Libreria.persistence.DAOAutor;
import Libreria.persistence.DAOEditorial;
import Libreria.persistence.DAOLibro;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class LibroService {

    Libro libro = new Libro();
    DAOLibro libroJpa = new DAOLibro();
    DAOAutor autorJpa = new DAOAutor();
    DAOEditorial editorialJpa = new DAOEditorial();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultarLibro() {
        try {
            System.out.println("Ingrese el ID del libro que desea consultar");
            libro = libroJpa.lookForID(input.nextLong());
            System.out.println(libro.toString());
        } catch (Exception e) {
            throw e;
        }
    }

    public void consultarTodosLibros() {
        try {
            List<Libro> listaLibro = libroJpa.lookall();

            for (Libro libro1 : listaLibro) {
                System.out.println(libro1.toString());
            }
        } catch (Exception e) {
        }
    }

    public void createBook() {
        try {
            System.out.println("Ingrese el ISBN del libro");
            libro.setISBN(input.nextLong());
            System.out.println("Ingrese el nombre del nuevo libro");
            libro.setTitulo(input.next());
            System.out.println("Lista autores");
            List<Autor> autores = autorJpa.lookAll();
            for (Autor autore : autores) {
                System.out.println(autore.toString());
            }
            System.out.println("Ingrese el autor del libro");
            libro.setAutor(autorJpa.lookForID(input.nextInt()));
            System.out.println("Lista editoriales");
            List<Editorial> listaEditoriales = editorialJpa.lookAll();
            for (Editorial listaEditoriale : listaEditoriales) {
                System.out.println(listaEditoriale.toString());
            }
            System.out.println("Ingrese la editorial del libro");
            libro.setEditorial(editorialJpa.lookForID(input.nextInt()));

            System.out.println("Ingrese el año del libro");
            libro.setAnio(input.nextInt());
            System.out.println("Ingrese la cantidad de ejempleares");
            libro.setEjemplares(input.nextInt());
            libro.setEjemplaresPrestados(0);
            libro.setEjemplearesRestantes(0);
            libro.setAlta(true);

            //Verificaciones
            boolean hayError = false;

            if (libro.getISBN() == null || libro.getISBN() == 0) {
                System.out.println("El ISBN no puede ser nulo o cero");
                hayError = true;
            }


            if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
                System.out.println("El título no puede ser nulo o vacío");
                hayError = true;
            }

            if (libro.getAutor() == null) {
                System.out.println("El autor no puede ser nulo");
                hayError = true;
            }

            if (libro.getEditorial() == null) {
                System.out.println("La editorial no puede ser nula");
                hayError = true;
            }

            if (libro.getAnio() == null || libro.getAnio() == 0) {
                System.out.println("El año no puede ser nulo o cero");
                hayError = true;
            }

            if (libro.getEjemplares() == null || libro.getEjemplares() == 0) {
                System.out.println("La cantidad de ejemplares no puede ser nula o cero");
                hayError = true;
            }

            if (!hayError) {
                libroJpa.create(libro);
            } else {
                System.out.println("No se pudo crear el libro debido a los errores anteriores");
            }

        } catch (Exception e) {
        }
    }
    
    public void modifyBook(){
        try {
            System.out.println("Lista de libros");
            List<Libro> listaL = libroJpa.lookall();
            for (Libro libro1 : listaL) {
                System.out.println(libro1.toString());
            }
            System.out.println("Indique el ISBN del libro que desea modificar");
            Long isbn = input.nextLong();
            libro =libroJpa.lookForID(isbn);
            if(isbn<=0 || isbn==null){
                System.out.println("El ISBN no existe");
            }else{
                int op = 0;
                
                do{
                    System.out.println("Indique que desea modificar el libro");
                    System.out.println("\n1: Titulo\n2:Autor\n3:Editorial\n4:Año\n5:Cantidad de ejempleares");
                    op = input.nextInt();
                    switch(op){
                        case 1: System.out.println("Ingrese el nuevo titulo de "+libro.getTitulo());
                        libro.setTitulo(input.next());break;
                        case 2: 
                            System.out.println("Ingrese el nuevo autor de "+libro.getTitulo());
                            libro.setAutor(autorJpa.lookForID(input.nextInt()));break;
                        case 3: 
                            System.out.println("Ingrese el nuevo editorial de "+libro.getTitulo());
                            libro.setEditorial(editorialJpa.lookForID(input.nextInt()));break;
                        case 4:
                            System.out.println("Ingrese el nuevo año de "+libro.getTitulo());
                            libro.setAnio(input.nextInt());break;
                        case 5:
                            System.out.println("Ingrese la nueva cantidad de ejempleares de "+libro.getTitulo());
                            libro.setEjemplares(input.nextInt());
                            break;
                        default:System.out.println("Opcion equivocada");    
                        
                    }
                    libroJpa.modify(libro);
                    System.out.println("Libro modificado exitosamente");
                    
                    System.out.println("Desea salir del menú? S/N");
                    String ope = input.next();
                    if("s".equalsIgnoreCase(ope)){
                        op =0;
                    }
                }while(op !=0);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void deleteBook(){
        try {
            List<Libro> listLibros = libroJpa.lookall();
            System.out.println("Lista de libros");
            for (Libro listLibro : listLibros) {
                System.out.println(listLibro.getISBN() + "/"+listLibro.getTitulo());
            }
            System.out.println("Seleccione el ISBN del libro que desea eliminar");
            Long isbn = input.nextLong();
            libro = libroJpa.lookForID(isbn);
            if(isbn<=0 || isbn== null){
                System.out.println("Debe ingresar un ISBN ");
            }else{
                libroJpa.deleteBook(isbn);
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
