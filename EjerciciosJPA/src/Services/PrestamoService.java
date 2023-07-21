/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistence.ClienteJpaController;
import Persistence.LibroJpaController;
import Persistence.PrestamoJpaController;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PrestamoService {
    PrestamoJpaController prestamoJpa = new PrestamoJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    LibroJpaController libroJpa = new LibroJpaController();
    
    Prestamo prestamo = new Prestamo();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void consultarPrestamo(){
        try {
            
            List<Prestamo> prestamoLista = prestamoJpa.findPrestamoEntities();
            System.out.println("Lista de prestamos");
            for (Prestamo prestamo : prestamoLista) {
                System.out.println(prestamo.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void crearPrestamo() throws Exception{
        try {
            
             List<Libro> libroJ = libroJpa.findLibroEntities();
            
            for (Libro libro1 : libroJ) {
                System.out.println(libro1.getTitulo() + libro1.getEjemplares_prestados() );
            }
            
            
            System.out.println("Indique la fecha del prestamo M/D/A");
            String fechaPresta = input.next()+"/"+input.next()+"/"+input.next();
            prestamo.setFechaPrestamo(new Date(fechaPresta));
            System.out.println("Indique la fecha del  M/D/A");
            String fechaDe = input.next()+"/"+input.next()+"/"+input.next();
            prestamo.setFechaDevolucion(new Date(fechaDe));
            System.out.println("Indique el ID del cliente");
            int clientId = input.nextInt();
            Cliente cliente = clienteJpa.findCliente(clientId);
            prestamo.setCliente(cliente);
            System.out.println("Indique el ISBN del libro");
            Long libroId = input.nextLong();
            Libro libro = libroJpa.findLibro(libroId);
            
            libro.setEjemplares_prestados(libro.getEjemplares_prestados()+1);
            
            libroJpa.edit(libro);
            
            prestamo.setLibro(libro);
            prestamoJpa.create(prestamo);
            
           
            
            for (Libro libro1 : libroJ) {
                System.out.println(libro1.getTitulo() + libro1.getEjemplares_prestados() );
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void devolPrestamo(){
        try {
            System.out.println("Indique el ISBN del libro que desea retornar");
            List<Libro> libros = libroJpa.findLibroEntities();
            
            for (Libro libro : libros) {
                System.out.println(libro.getIsbn() + " -- "+libro.getTitulo());
            }
            System.out.println("-------");
            Libro libroD = libroJpa.findLibro(input.nextLong());
            System.out.println(libroD.getTitulo());
           if(libroD.getEjemplares_prestados()>0){
               System.out.println("Libro entregado correctamente");
               libroD.setEjemplares_prestados(libroD.getEjemplares_prestados()-1);
               libroJpa.edit(libroD);
               
           }
            
            
        } catch (Exception e) {
        }
    }
}
