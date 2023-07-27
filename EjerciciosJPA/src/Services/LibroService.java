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
    LibroJpaController libroJpa = new LibroJpaController();
    EditorialJpaController editorialJpa = new EditorialJpaController();

    public void consultarLibro() {
        try {
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            System.out.println("Lista de libros");
            for (Libro listaLibro : listaLibros) {
                System.out.println(listaLibro.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearLibro(Libro libro) throws Exception {
        try {
            if (libro == null) {
                throw new Exception("El libro no puede estar vacío");
            }

            System.out.println("Indique la cantidad de libros que desea crear");
            int cant = input.nextInt();

            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese el ISBN del libro");
                Long isbn = input.nextLong();
                if (isbn == null) {

                    throw new Exception("El ISBN del libro es obligatorio");

                }
                libro.setIsbn(isbn);

                System.out.println("Ingrese el título del libro");
                String titulo = input.next();
                if (titulo == null || titulo.isEmpty()) {
                    throw new Exception("El titulo es obligatorio");
                }
                libro.setTitulo(titulo);

                System.out.println("Ingrese el año del libro");
                Integer anio = input.nextInt();
                if (anio == null) {
                    throw new Exception("El año del libro es obligatorio");

                }
                libro.setAnio(anio);

                System.out.println("Ingrese la cantidad de ejemplares");
                Integer ejemplares = input.nextInt();
                if (ejemplares == null) {
                    throw new Exception("La cantidad de ejemplares del libro es obligatoria");

                }
                libro.setEjemplares(ejemplares);

                System.out.println("Ingrese la cantidad de ejemplares prestados");
                Integer ejemplares_prestados = input.nextInt();
                if (ejemplares_prestados == null) {
                    throw new Exception("La cantidad de ejemplares prestados del libro es obligatoria");

                }
                libro.setEjemplares_prestados(ejemplares_prestados);

                libro.setEjemplares_restantes(libro.getEjemplares() - libro.getEjemplares_prestados());
                libro.setAlta(true);

                System.out.println("Ingrese el ID del autor");
                int cr = input.nextInt();
                if (cr <= 0) {
                    System.out.println("No hay autor con ese ID");
                    return;
                }
                Autor autor = autorJpa.getEntityManager().find(Autor.class, cr);
                libro.setAutor(autor);

                System.out.println("Ingrese el ID de la editorial");
                int cd = input.nextInt();
                if (cd <= 0) {
                    System.out.println("No hay editorial con ese ID");
                    return;
                }
                Editorial editorial = editorialJpa.getEntityManager().find(Editorial.class, cd);
                libro.setEditorial(editorial);

                libroJpa.create(libro);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarLibro() throws Exception {

        try {

            int firstResult = 0;
            boolean hayResultado = true;
            ArrayList<Libro> listaLibro = new ArrayList();

            while (hayResultado) {
                List<Libro> listLibro = libroJpa.findLibroEntities(0, firstResult);
                if (listLibro.isEmpty()) {
                    hayResultado = false;
                } else {
                    listaLibro.addAll(listLibro);
                    firstResult += listLibro.size();
                }

            }
            System.out.println("Lista de libro");
            for (Libro libro : listaLibro) {
                System.out.println(libro.getIsbn() + "/" + libro.getTitulo());
            }
            System.out.println("Indique el ISBN del libro que desea eliminar");
            Long elim = input.nextLong();
            libroJpa.destroy(elim);
        } catch (Exception e) {
            throw e;
        }
    }

    public void darBajaLibro() {
        try {
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            System.out.println("Lista de libros");
            for (Libro listaLibro : listaLibros) {
                System.out.println(listaLibro.getIsbn() + " - " + listaLibro.getTitulo());
            }
            System.out.println("Indique el ISBN del libro que desea dar de baja");
            long libroB = input.nextInt();

            for (Libro listaLibro : listaLibros) {
                if (listaLibro.getIsbn() == libroB) {
                    if (!listaLibro.isAlta()) {
                        System.out.println("El libro ya esta de baja");
                    } else {
                        listaLibro.setAlta(false);
                        libroJpa.edit(listaLibro);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void editarLibro() throws Exception {
        try {
            List<Libro> listaLibr = libroJpa.findLibroEntities();
            System.out.println("Lista libros");
            for (Libro libro : listaLibr) {
                System.out.println(libro.getIsbn() + " - " + libro.getTitulo());
            }

            System.out.println("Indique el ISBN del libro a editar");
            int isbnP = input.nextInt();

            for (Libro libro : listaLibr) {
                if (libro.getIsbn() == isbnP) {
                    System.out.println("Indique el nuevo titulo del libro");
                    String titulo = input.next();
                    libro.setTitulo(titulo);
                    libroJpa.edit(libro);
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void darAltaLibro() {
        try {
            List<Libro> libroList = libroJpa.findLibroEntities();

            System.out.println("Lista de libros");
            for (Libro libro : libroList) {
                System.out.println(libro.getIsbn() + " - " + libro.getTitulo());
            }
            System.out.println("Indique el ISBN del libro que desea dar de alta");
            long isbnP = input.nextInt();

            for (Libro libro : libroList) {
                if (libro.getIsbn() == isbnP) {
                    if (libro.isAlta()) {
                        System.out.println("Ya el libro esta de alta");
                    } else {
                        libro.setAlta(true);
                        libroJpa.edit(libro);
                        System.out.println("El libro ha cambiado a alta");
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    public void buscarLibroISBN() {
        try {

            List<Libro> libroBusc = libroJpa.findLibroEntities();
            System.out.println("Lista de libros");
            for (Libro libro : libroBusc) {
                System.out.println(libro.getIsbn() + "/" + libro.getTitulo());
            }
            System.out.println("Ingrese el ISBN del libro que desea ver");
            int isbnP = input.nextInt();
            for (Libro libro : libroBusc) {
                if (libro.getIsbn() == isbnP) {
                    System.out.println(libro.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroTitulo() {

        List<Libro> librosB = libroJpa.findLibroEntities();
        System.out.println("Lista de libros");
        for (Libro libro : librosB) {
            System.out.println(libro.getIsbn() + "/" + libro.getTitulo());
        }
        System.out.println("\nIngrese el nombre del libro que desea buscar");
        String nombreL = input.next();
        for (Libro libro : librosB) {
            if (libro.getTitulo().equalsIgnoreCase(nombreL)) {
                System.out.println(libro.toString());
                break;
            }
        }
    }

    public void buscarLibroAutor() {

        try {

            List<Libro> librosB = libroJpa.findLibroEntities();

            System.out.println("Lista de libros");
            for (Libro libro : librosB) {
                System.out.println(libro.getIsbn() + "/" + libro.getTitulo() + "/" + libro.getAutor().getNombre());
            }
            System.out.println("\nIngrese el autor del libro que desea buscar");
            String nombreA = input.next();
            for (Libro libro : librosB) {
                if (libro.getAutor().getNombre().equalsIgnoreCase(nombreA)) {
                    System.out.println(libro.toString());
                    break;
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroEditorial() {

        try {
            int firstResult = 0;
            boolean hayLibros = true;
            ArrayList<Libro> librosB = new ArrayList();
            while (hayLibros) {
                List<Libro> librosBusc = libroJpa.findLibroEntities(0, firstResult);

                if (librosBusc.isEmpty()) {
                    hayLibros = false;
                } else {
                    librosB.addAll(librosBusc);
                    firstResult += librosBusc.size();
                }
            }
            System.out.println("Lista de libros");
            for (Libro libro : librosB) {
                System.out.println(libro.getIsbn() + "/" + libro.getTitulo() + "/" + libro.getEditorial().getNombre());
            }
            System.out.println("\nIngrese el editorial del libro que desea buscar");
            String nombreE = input.next();
            for (Libro libro : librosB) {
                if (libro.getEditorial().getNombre().equalsIgnoreCase(nombreE)) {
                    System.out.println(libro.toString());
                    break;
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
