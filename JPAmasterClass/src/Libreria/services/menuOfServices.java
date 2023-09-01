/*
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas (excepto Préstamo) 
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título. 
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación: 
• Validar campos obligatorios.
• No ingresar datos duplicados.
 */
package Libreria.services;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class menuOfServices {

    AutorService sautor = new AutorService();
    EditorialService seditorial = new EditorialService();
    LibroService slibro = new LibroService();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void menu() {
        int op = 0;
        int ope = 0;
        do {
            System.out.println("--Menu--\nEliga la operación que desea realizar");
            System.out.println("\n1:Consultar por objeto\n2:Consultar todo de un objeto\n3:Crear un objeto\n4:Modificar un objeto\n5:Eliminar un objeto"
                    + "\n0:Salir");
             op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Indique que desea consultar individualmente");
                    System.out.println("1:Autor\n2:Editorial\n3:Libro");
                   ope = input.nextInt();
                    switch (ope) {
                        case 1:
                            sautor.consultar();
                            break;
                        case 2:
                            seditorial.consultarEditorial();
                            break;
                        case 3:
                            slibro.consultarLibro();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Indique que desea consultar");
                    System.out.println("1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    switch (ope) {
                        case 1:
                            sautor.consultarTodos();
                            break;
                        case 2:
                            seditorial.consultarTodosEdit();
                            break;
                        case 3:
                            slibro.consultarTodosLibros();
                            break;
                    }break;
                case 3:
                    System.out.println("Indique que desea crear");
                    System.out.println("1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    switch (ope) {
                        case 1:
                            sautor.crearAutor();
                            break;
                        case 2:
                            seditorial.createEditorial();
                            break;
                        case 3:
                            slibro.createBook();
                            break;
                    }break;
                case 4:
                    System.out.println("Indique que desea modificar");
                    System.out.println("1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    switch (ope) {
                        case 1:
                            sautor.modificarAutor();
                            break;
                        case 2:
                            seditorial.modifyEditorial();
                            break;
                        case 3:
                            slibro.modifyBook();
                            break;
                    }break;
                case 5:
                    System.out.println("Indique que desea eliminar");
                    System.out.println("1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    switch (ope) {
                        case 1:
                            sautor.eliminar();
                            break;
                        case 2:
                            seditorial.deleteEditorial();
                            break;
                        case 3:
                            slibro.deleteBook();
                            break;
                    }break;
            }
            
        }while (op!=0);

    }
}
