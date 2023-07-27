/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjpa2.Services;

import ejerciciosjpa2.Entidades.Autor;
import ejerciciosjpa2.Persistence.AutorJpaController;
import ejerciciosjpa2.Persistence.exceptions.NonexistentEntityException;
import java.util.List;



import java.util.Locale;
import java.util.Scanner;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JesusNjo
 */
public class AutorService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AutorJpaController autorJpa = new AutorJpaController();
    Autor autor = new Autor();

    public void consultarAutores() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria2PU");
    EntityManager em = emf.createEntityManager();
    try {
        System.out.println("Indique que tipo de busqueda quiere\n1:Individual por nombre\n2:Lista completa");
        int op =input.nextInt();
        if(op ==1){
            
        System.out.println("Ingrese el nombre del autor que desea buscar");
        String nombre = input.next();
        Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class)
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();
        System.out.println(autor.getNombre() + " - "+autor.getId_autor());
        }
        if(op == 2){
            List<Autor> listaAutores = autorJpa.findAutorEntities();
            for (Autor list : listaAutores) {
                System.out.println(list.getNombre() + " - "+list.getId_autor());
            }
        }
        if(op<1 || op>2){
            throw new Exception("Opcion invalida");
        }
    } catch (Exception e) {
        System.out.println("No se encontró ningún autor con ese nombre.");
        System.out.println(e.getMessage());
    } finally {
        em.close();
    }
}

    public void crearAutor(String nombre) throws Exception {
        try {

            autor.setNombre(nombre);
            autor.setAlta(true);
            if (autor.getNombre().trim().isEmpty() || autor.getNombre() == null) {
                System.out.println("----No puede ingresar datos vacios o nulos----");
            } else {
                autorJpa.create(autor);
                System.out.println("----Autor creado correctamente----");
            }

        } catch (Exception e) {

            System.out.println("----Error al crear el autor: " + e.getMessage());
        }

    }

    public void eliminarAutor(Integer id) throws NonexistentEntityException {

        try {
            autor.setId_autor(id);

            if (autor.getNombre().isEmpty() || autor.getNombre() == null) {
                System.out.println("----No puede ingresar datos vacios o nulos----");
            } else {
                autorJpa.destroy(autor.getId_autor());
                System.out.println("----Autor eliminado correctamente----");
            }
        } catch (NonexistentEntityException e) {
            throw e;
        }

    }

    public void modificarAutor(Integer modif) {

       try {

            autor.setId_autor(modif);

            if (modif <= 0 || modif == null) {
                throw new Exception("--No puede ingresar datos vacios o nulos");
            } else {
                List<Autor> listaAutor = autorJpa.findAutorEntities();
                boolean edit = true;
                for (Autor autor1 : listaAutor) {
                    if (autor1.getId_autor() == autor.getId_autor()) {
                        System.out.println("--Indique el nuevo nombre de " + autor1.getNombre());
                        autor.setNombre(input.next());
                        System.out.println("--Esta de alta? S/N");
                        autor.setAlta("s".equalsIgnoreCase(input.next()) ? true : false);

                        autorJpa.edit(autor);
                        System.out.println("--Autor modificada exitosamente");
                        edit = false;
                    }
                    if (edit) {
                        throw new Exception("--El autor con el ID " + modif + " no existe!");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("--Error al capturar sus datos " + e.getMessage());
        }
    }

}
