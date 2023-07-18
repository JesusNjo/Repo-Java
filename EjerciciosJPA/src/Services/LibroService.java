/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import static Entidades.Libro_.autor;
import Persistence.AutorJpaController;
import Persistence.EditorialJpaController;
import Persistence.LibroJpaController;
import java.util.ArrayList;
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
            //ArrayList<Autor> autores = new ArrayList();
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
}