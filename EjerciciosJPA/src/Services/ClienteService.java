/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Cliente;
import Persistence.ClienteJpaController;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ClienteService {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    Cliente cliente = new Cliente();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultarCliente() {
        try {
            List<Cliente> listaClientes = clienteJpa.findClienteEntities();
            System.out.println("Lista de clientes");
            for (Cliente listaCliente : listaClientes) {
                
                System.out.println(listaCliente.getId() + " - " + listaCliente.getDocumento() + " - "+ listaCliente.getNombre() + " " + listaCliente.getApellido());
                System.out.println(listaCliente.getDocumento()+ " - "+ listaCliente.getTelefono());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearCliente() throws Exception {
        try {
            System.out.println("Indique el documento del cliente");
            cliente.setDocumento(input.nextLong());
            System.out.println("Indique el nombre del cliente");
            cliente.setNombre(input.next());
            System.out.println("Indique el apellido del cliente");
            cliente.setApellido(input.next());
            System.out.println("Indique el numero de telefono del cliente");
            cliente.setTelefono(input.next());

            clienteJpa.create(cliente);

        } catch (Exception e) {
            throw e;

        }
    }

    public void eliminarCliente() throws Exception {
        try {
            List<Cliente> listaClientes = clienteJpa.findClienteEntities();
            System.out.println("Lista de clientes");
            for (Cliente listaCliente : listaClientes) {
                System.out.println(listaCliente.getId() + " - " + listaCliente.getNombre() + " " + listaCliente.getApellido());
            }
            System.out.println("Indique el ID del cliente que desea eliminar");
            int id = input.nextInt();
            clienteJpa.destroy(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarCliente() {

        try {
            List<Cliente> listaCliente = clienteJpa.findClienteEntities();
            System.out.println("Lista de cliente");
            for (Cliente cliente : listaCliente) {
                System.out.println(cliente.getId() + " - " + cliente.getNombre() + " " + cliente.getApellido());
            }

            System.out.println("Indique el ID del cliente que desea editar");
            int idCl = input.nextInt();
            for (Cliente cliente : listaCliente) {
                if (cliente.getId() == idCl) {
                    System.out.println("Indique el nuevo nombre");
                    cliente.setNombre(input.next());
                    System.out.println("Indique el nuevo apellido del cliente");
                    cliente.setApellido(input.next());
                    System.out.println("Indique el nuevo numero de telefono del cliente");
                    cliente.setTelefono(input.next());
                    clienteJpa.edit(cliente);
                }
            }
        } catch (Exception e) {
        }
    }
}
