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
package Services;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ServiciosCompletos {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    AutorService autorS = new AutorService();
    LibroService libroS = new LibroService();
    EditorialService editoS = new EditorialService();

    Autor autor = new Autor();
    Editorial editorial = new Editorial();
    Libro libro = new Libro();

    public void menu() throws Exception {
        int ope = 0;
        int op = 0;
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1 - Dar de alta");
            System.out.println("2 - Dar de baja");
            System.out.println("3 - Editar");
            System.out.println("4 - ");
            System.out.println("5 - ");
            System.out.println("0 - Salir");

            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Indique que desea dar de alta \n1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    if (ope == 1) {
                        autorS.crearAutor(autor);
                    }
                    if (ope == 2) {
                        editoS.crearEditorial(editorial);
                    }
                    if (ope == 3) {
                        libroS.crearLibro(libro);
                    }
                    break;
                    
                case 2:
                    System.out.println("Indique que desea dar de baja \n1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    
                    if(ope == 1){
                        autorS.eliminar();
                    }
                    if(ope == 2){
                        
                    editoS.eliminarEditorial();
                    }
                    if(ope == 3){
                        
                    }
                    break;

                case 3:

                    break;
                case 14:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        } while (op != 0);
    }

}
