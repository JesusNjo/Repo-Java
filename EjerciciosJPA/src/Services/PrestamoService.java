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

    public void consultarPrestamo() {
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

    public void crearPrestamo() throws Exception {
        try {

            List<Libro> libroJ = libroJpa.findLibroEntities();
            List<Prestamo> prestamoList = prestamoJpa.findPrestamoEntities();
            List<Cliente> clienteList = clienteJpa.findClienteEntities();

            System.out.println("Indique la fecha del prestamo M/D/A");
            String fechaPresta = input.next() + "/" + input.next() + "/" + input.next();
            prestamo.setFechaPrestamo(new Date(fechaPresta));
            System.out.println("Indique la fecha del devolucion M/D/A");
            String fechaDe = input.next() + "/" + input.next() + "/" + input.next();
            prestamo.setFechaDevolucion(new Date(fechaDe));

            System.out.println("Lista clientes");
            for (Cliente cliente : clienteList) {
                System.out.println(cliente.getId() + " " + cliente.getNombre() + " " + cliente.getApellido());
            }
            System.out.println("Indique el ID del cliente");
            int clientId = input.nextInt();
            Cliente cliente = clienteJpa.findCliente(clientId);
            prestamo.setCliente(cliente);

            System.out.println("Lista de libros");
            for (Libro libro : libroJ) {
                System.out.println(libro.getIsbn() + " - " + libro.getTitulo());
            }
            System.out.println("Indique el ISBN del libro");
            Long libroId = input.nextLong();
            Libro libro = libroJpa.findLibro(libroId);

            libro.setEjemplares_prestados(libro.getEjemplares_prestados() + 1);

            libroJpa.edit(libro);

            prestamo.setLibro(libro);

            if (prestamo.getCliente() == null || prestamo.getLibro() == null || prestamo.getFechaDevolucion() == null || prestamo.getFechaPrestamo() == null) {
                throw new Exception("Todos los campos son obligatorios");

            }
            boolean prest = true;
            for (Prestamo prestamo1 : prestamoList) {
                if (prestamo1.getCliente().equals(prestamo.getCliente())) {
                    System.out.println("Este prestamo ya ha sido realizado");
                    prest = false;
                }
            }
            if (prest) {

                prestamoJpa.create(prestamo);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void devolPrestamo() {
        try {
            System.out.println("Indique el ISBN del libro que desea retornar");
            List<Libro> libros = libroJpa.findLibroEntities();

            for (Libro libro : libros) {
                System.out.println(libro.getIsbn() + " -- " + libro.getTitulo());
            }
            System.out.println("-------");
            Libro libroD = libroJpa.findLibro(input.nextLong());
            System.out.println(libroD.getTitulo());
            if (libroD.getEjemplares_prestados() > 0) {
                System.out.println("Libro entregado correctamente");
                libroD.setEjemplares_prestados(libroD.getEjemplares_prestados() - 1);
                libroJpa.edit(libroD);

            }

        } catch (Exception e) {
        }
    }

    public void buscarPrestamoCliente() {
        try {
            List<Cliente> listaCliente = clienteJpa.findClienteEntities();
            List<Prestamo> listaPrest = prestamoJpa.findPrestamoEntities();
            System.out.println("\nLista cliente");
            for (Cliente cliente : listaCliente) {
                System.out.println(cliente.getId() + " - " + cliente.getNombre() + " " + cliente.getApellido());
            }
            System.out.println("Indique el ID del cliente que desea consultar sus prestamos");
            Integer idC = input.nextInt();

            Cliente cliente = clienteJpa.findCliente(idC);

            if (cliente != null) {
                for (Prestamo prestamo1 : listaPrest) {
                    if (prestamo1.getCliente().getId() == cliente.getId()) {

                        System.out.println("Cliente: " + prestamo1.getCliente().getDocumento() + " " + prestamo1.getCliente().getNombre() + " " + prestamo1.getCliente().getApellido());
                        System.out.println("Libro prestado: " + prestamo1.getLibro().getIsbn() + " " + prestamo1.getLibro().getTitulo());

                    }
                }
            } else {
                System.out.println("El cliente no existe");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
