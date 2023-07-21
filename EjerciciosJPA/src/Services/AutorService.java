/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Autor;
import Persistence.AutorJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class AutorService {

    AutorJpaController autorJpa = new AutorJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultarAutor() {
        try {
            List<Autor> listaAutores = autorJpa.findAutorEntities();
            System.out.println("Lista de autores");
            for (Autor listaAutore : listaAutores) {
                System.out.println(listaAutore.getId() + " - " + listaAutore.getNombre());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearAutor(Autor autor) throws Exception {

        try {
            if (autor == null) {
                throw new Exception("El libro no puede esta vacio");
            }

            System.out.println("Ingrese el nombre");
            autor.setNombre(input.next());
            autor.setAlta(true);
            autorJpa.create(autor);

        } catch (Exception e) {
            throw e;
        }
    }

    public void darAlta() throws Exception {

        try {
            List<Autor> listaAutores = autorJpa.findAutorEntities();
            System.out.println("Lista de autores");
            for (Autor listaAutore : listaAutores) {
                System.out.println(listaAutore.getId() + " - " + listaAutore.getNombre());
            }
            System.out.println("Indique el ID del autor que desea dar de alta");
            int darAlta = input.nextInt();
            for (Autor listaAutore : listaAutores) {
                if (listaAutore.getId() == darAlta) {

                    if (listaAutore.isAlta()) {
                        System.out.println("Ya el autor esta de alta");
                    } else {
                        listaAutore.setAlta(true);
                        autorJpa.edit(listaAutore);
                    }
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void darBaja() throws Exception {

        try {
            System.out.println("Lista de autores");
            List<Autor> autor = autorJpa.findAutorEntities();
            for (Autor autor1 : autor) {
                System.out.println(autor1.getId() + " - " + autor1.getNombre());
            }

            System.out.println("Indique el ID del autor que desea dar de baja");
            int idA = input.nextInt();

            for (Autor autorxs : autor) {
                if (autorxs.getId() == idA) {
                    if (autorxs.isAlta() == false) {
                        System.out.println(autorxs.getNombre());
                        System.out.println("Ya el autor está de baja");
                    } else {
                        autorxs.setAlta(false);
                        autorJpa.edit(autorxs);
                        System.out.println("Autor de baja correctamente\n");
                    }
                }

            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarAutor() throws Exception {

        try {
            int firstResult = 0;
            boolean hayMas = true;
            ArrayList<Autor> autorBusc = new ArrayList();
            while (hayMas) {
                List<Autor> autoresBusc = autorJpa.findAutorEntities(0, firstResult);
                if (autoresBusc.isEmpty()) {
                    hayMas = false;
                } else {
                    autorBusc.addAll(autorBusc);
                    firstResult = autoresBusc.size();
                }

            }
            System.out.println("Lista de autores");
            for (Autor autor : autorBusc) {
                System.out.println(autor.getId() + "/" + autor.getNombre());
            }
            System.out.println("Indique el ID del autor que desea eliminar");
            int id = input.nextInt();

            autorJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            throw e;
        }
    }

    public void editarAutor() throws Exception {

        try {

            int firstResult = 0;
            boolean hayResult = true;
            ArrayList<Autor> autoresList = new ArrayList();
            while (hayResult) {

                List<Autor> auList = autorJpa.findAutorEntities(0, firstResult);
                if (auList.isEmpty()) {
                    hayResult = false;
                } else {
                    autoresList.addAll(auList);
                }
                firstResult += auList.size();

            }
            System.out.println("Lista de autores");
            for (Autor autor : autoresList) {
                System.out.println(autor.getId() + "/" + autor.getNombre());

            }
            System.out.println("Ingrese el nombre del autor que desea editar");
            String nombreAutor = input.next();
            List<Autor> autores = autorJpa.findAutorEntities();
            for (Autor autor : autores) {
                if (autor.getNombre().equalsIgnoreCase(nombreAutor)) {

                    System.out.println("Ingrese el nuevo nombre del autor");
                    autor.setNombre(input.next());
                    System.out.println("Autor modificado exitosamente!!");
                    autorJpa.edit(autor);
                    break;
                } else {
                    System.out.println("Autor no encontrado");

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarAutor() throws Exception {

        try {

            int firstResult = 0;
            boolean hayResult = true;
            ArrayList<Autor> autoresList = new ArrayList();
            while (hayResult) {

                List<Autor> auList = autorJpa.findAutorEntities(0, firstResult);
                if (auList.isEmpty()) {
                    hayResult = false;
                } else {
                    autoresList.addAll(auList);
                }
                firstResult += auList.size();

            }
            System.out.println("Lista de autores");
            for (Autor autor : autoresList) {
                System.out.println(autor.getId() + "/" + autor.getNombre());

            }
            System.out.println("Ingrese el nombre del autor que desea buscar");
            String nombreAutor = input.next();
            List<Autor> autores = autorJpa.findAutorEntities();
            for (Autor autor : autores) {
                if (autor.getNombre().equalsIgnoreCase(nombreAutor)) {

                    System.out.println(autor.toString());
                    break;
                } else {
                    System.out.println("Autor no encontrado");

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
