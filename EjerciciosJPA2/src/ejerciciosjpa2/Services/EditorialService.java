/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjpa2.Services;

import ejerciciosjpa2.Entidades.Editorial;
import ejerciciosjpa2.Persistence.EditorialJpaController;
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
public class EditorialService {

    EditorialJpaController editorialJpa = new EditorialJpaController();
    Editorial editorial = new Editorial();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultarEditorial() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria2PU");
        EntityManager em = emf.createEntityManager();
        try {
            System.out.println("Indique que tipo de busqueda quiere\n1:Individual por nombre\n2:Lista completa");
            int op = input.nextInt();
            if (op < 1 || op > 3) {
                throw new Exception("Debe indicar un numero valido");
            }
            if (op == 1) {
                System.out.println("Indique el nombre de la Editorial que desea buscar");
                String nombre_edit = input.next();
                editorial = em.createQuery("SELECT e from Editorial e where e.nombre LIKE :nombre_edit", Editorial.class)
                        .setParameter("nombre_edit", "%" + nombre_edit + "%").getSingleResult();
                System.out.println(editorial.getId_editorial() + " - " + editorial.getNombre());
            }
            if (op == 2) {
                List<Editorial> listaEditorial = editorialJpa.findEditorialEntities();

                for (Editorial editorial1 : listaEditorial) {
                    System.out.println(editorial1.getId_editorial() + " - " + editorial1.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    public void crearEditorial(String crear) throws Exception {
        try {
            editorial.setNombre(crear);

            if (editorial.getNombre().trim().isEmpty() || editorial.getNombre() == null) {
                throw new Exception("No puede ingresar datos vacions o nulos");
            } else {

                editorial.setAlta(true);
                editorialJpa.create(editorial);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarEditorial(Integer elim) throws Exception {

        try {

            if (elim <= 0 || elim == null) {
                throw new Exception("-- Debe ingresar un valor mayor a 0 o NOT NULL");
            } else {
                editorialJpa.destroy(elim);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void modificarEditorial(Integer modif) throws Exception {
        try {

            editorial.setId_editorial(modif);

            if (modif <= 0 || modif == null) {
                throw new Exception("--No puede ingresar datos vacios o nulos");
            } else {
                List<Editorial> listaEditorial = editorialJpa.findEditorialEntities();
                boolean edit = true;
                for (Editorial editorial1 : listaEditorial) {
                    if (editorial1.getId_editorial() == editorial.getId_editorial()) {
                        System.out.println("--Indique el nuevo nombre de " + editorial1.getNombre());
                        editorial.setNombre(input.next());
                        System.out.println("--Esta de alta? S/N");
                        editorial.setAlta("s".equalsIgnoreCase(input.next()) ? true : false);

                        editorialJpa.edit(editorial);
                        System.out.println("--Editorial modificada exitosamente");
                        edit = false;
                    }
                    if (edit) {
                        throw new Exception("--El editorial con el ID " + modif + " no existe!");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("--Error al capturar sus datos " + e.getMessage());
        }
    }
}
