/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Editorial;
import Persistence.EditorialJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EditorialService {

    EditorialJpaController editoJpa = new EditorialJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultarEditorial() {
        try {
            List<Editorial> editorialList = editoJpa.findEditorialEntities();
            System.out.println("Lista de editoriales");
            for (Editorial editorial : editorialList) {
                System.out.println(editorial.getId() + " - " + editorial.getNombre());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearEditorial(Editorial editorial) throws Exception {

        try {
            if (editorial == null) {
                throw new Exception("No puede ir la editorial vacia");
            }

            System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(input.next());
            
            editorial.setAlta(true);

            List<Editorial> editoList = editoJpa.findEditorialEntities();
            boolean editoT = true;
            for (Editorial editorial1 : editoList) {
                if (editorial1.getNombre().equalsIgnoreCase(editorial.getNombre())) {
                    System.out.println("Este editorial ya existe!");
                    editoT = false;
                }
            }
            if (editoT) {
                if(editorial.getNombre().isEmpty() || editorial.getNombre() == null){
                    throw new Exception("No puede ingresar datos vacios");
                }else{
                    
                editoJpa.create(editorial);
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarEditorial() throws NonexistentEntityException {

        try {
            Integer editorial = 0;
            ArrayList<Editorial> editorialBusc = new ArrayList();
            int firstResult = 0;
            boolean hayMasResultados = true;

            while (hayMasResultados) {
                List<Editorial> listaEditorial = editoJpa.findEditorialEntities(0, firstResult);
                if (listaEditorial.isEmpty()) {
                    hayMasResultados = false;
                } else {
                    editorialBusc.addAll(listaEditorial);
                    firstResult += listaEditorial.size();
                }

            }
            System.out.println("Lista del editoriales\n");
            for (Editorial edi : editorialBusc) {
                System.out.println(edi.getId() + " / " + edi.getNombre());
            }
            System.out.println("Indique el ID de la editorial que desea eliminar");
            editorial = input.nextInt();

            editoJpa.destroy(editorial);
        } catch (NonexistentEntityException e) {
            throw e;
        }
    }

    public void editarEditorial() throws Exception {

        try {

            List<Editorial> editorialList = editoJpa.findEditorialEntities();
            System.out.println("Lista de editoriales");
            for (Editorial editorial : editorialList) {
                System.out.println(editorial.getId() + " - " + editorial.getNombre());
            }

            System.out.println("Indique el ID del editorial que desea modificar");
            int editoP = input.nextInt();

            for (Editorial editorial : editorialList) {
                if (editorial.getId() == editoP) {
                    System.out.println("Indique el nuevo nombre de la editorial");
                    editorial.setNombre(input.next());
                    editoJpa.edit(editorial);
                    System.out.println("Editorial modificada con exito !");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
