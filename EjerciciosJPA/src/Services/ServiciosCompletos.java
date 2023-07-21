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
import Entidades.Cliente;
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
    ClienteService clienteS = new ClienteService();
    PrestamoService prestamoS = new PrestamoService();
    
    Autor autor = new Autor();
    Editorial editorial = new Editorial();
    Libro libro = new Libro();
    Cliente cliente = new Cliente();
    public void menu() throws Exception {
        int ope = 0;
        int op = 0;
        do {
            System.out.println("\n-----------MENU----------");
            System.out.println("1 - Consultar AUTOR/LIBRO/EDITORIAL/CLIENTE/PRESTAMO");
            System.out.println("2 - Crear AUTOR/LIBRO/EDITORIAL/CLIENTE/PRESTAMO");
            System.out.println("3 - Eliminar AUTOR/LIBRO/EDITORIAL/CLIENTE/PRESTAMO");
            System.out.println("4 - Editar AUTOR/LIBRO/EDITORIAL/CLIENTE");
            System.out.println("5 - Dar de alta AUTOR/LIBRO/EDITORIAL");
            System.out.println("6 - Dar de baja AUTOR/LIBRO/EDITORIAL");

            System.out.println("7 - Busca Autor por nombre");
            System.out.println("8 - Buscar un libro por ISBN");
            System.out.println("9 - Buscar un libro por titulo");
            System.out.println("10 - Buscar un libro por autor");
            System.out.println("11 - Buscar un libro por editorial");
            System.out.println("12 - Devolver un libro");
            System.out.println("13 - Buscar prestamo de un cliente");
            System.out.println("0 - Salir");

            op = input.nextInt();

            switch (op) {
                
                case 1:
                    System.out.println("Indique la lista que desea consultar \n1:Autor\n2:Editorial\n3:Libro\n4:Cliente\n5:Prestamo");
                    ope = input.nextInt();
                    if (ope == 1) {
                        autorS.consultarAutor();
                    }
                    if (ope == 2) {
                        editoS.consultarEditorial();
                    }
                    if (ope == 3) {
                        libroS.consultarLibro();
                    }
                    if (ope == 4) {
                        clienteS.consultarCliente();
                    }
                    if(ope == 5){
                        prestamoS.consultarPrestamo();
                    }
                    break;
                case 2:
                    System.out.println("Indique que desea crear \n1:Autor\n2:Editorial\n3:Libro\n4:Cliente\n5:Prestamo");
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
                    if (ope == 4) {
                        clienteS.crearCliente();
                    }
                    if(ope == 5){
                        prestamoS.crearPrestamo();
                    }
                    break;

                case 3:
                    System.out.println("Indique que desea eliminar \n1:Autor\n2:Editorial\n3:Libro\n4:Cliente");
                    ope = input.nextInt();

                    if (ope == 1) {
                        autorS.eliminarAutor();
                    }
                    if (ope == 2) {

                        editoS.eliminarEditorial();
                    }
                    if (ope == 3) {
                        libroS.eliminarLibro();
                    }
                    if (ope == 4) {
                        clienteS.eliminarCliente();
                    }
                    if(ope == 5){
                        
                    }
                    break;

                case 4:
                    System.out.println("Indique que desea editar \n1:Autor\n2:Editorial\n3:Libro\n4:Cliente");
                    ope = input.nextInt();
                    if(ope == 1){
                        
                    autorS.editarAutor();
                    }
                    if(ope == 2){
                        
                   editoS.editarEditorial();
                    }
                    if(ope ==3){
                    libroS.editarLibro();
                    }
                    if(ope ==4){
                    clienteS.editarCliente();
                    }
                    if(ope ==5){
                        
                    }
                    break;

                case 5:
                    System.out.println("Indique que desea dar de alta \n1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();

                    if (ope == 1) {
                        autorS.darAlta();
                    }
                    if (ope == 2) {

                        editoS.eliminarEditorial();
                    }
                    if (ope == 3) {
                        libroS.darAltaLibro();
                    }
                    break;
                case 6:
                    System.out.println("Indique que desea dar de baja \n1:Autor\n2:Editorial\n3:Libro");
                    ope = input.nextInt();
                    
                    if (ope == 1) {
                        autorS.darBaja();
                    }
                    if (ope == 2) {
                        
                        editoS.eliminarEditorial();
                    }
                    if (ope == 3) {
                        libroS.darBajaLibro();
                    }
                    break;
                case 7:
                    autorS.buscarAutor();
                    break;
                case 8:
                    libroS.buscarLibroISBN();
                    break;

                case 9:
                    libroS.buscarLibroTitulo();
                    break;
                case 10:
                    libroS.buscarLibroAutor();
                    break;
                case 11:
                    libroS.buscarLibroEditorial();
                    break;
                    
                case 12:
                    prestamoS.devolPrestamo();
                    break;
                    
                case 13:
                    prestamoS.buscarPrestamoCliente();
                    break;
                case 0:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        } while (op != 0);
    }

}
