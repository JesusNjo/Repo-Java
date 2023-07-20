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

    public void crearEditorial(Editorial editorial) throws Exception {

        try {
            if (editorial == null) {
                throw new Exception("No puede ir la editorial vacia");
            }
            System.out.println("Indique la cantidad de editoriales que desea crear");
            int cant = input.nextInt();
            for (int i = 0; i <cant; i++) {
            System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(input.next());
            editorial.setAlta(true);
            editoJpa.create(editorial);
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
}
