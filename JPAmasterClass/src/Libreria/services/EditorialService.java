/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.services;

import Libreria.entities.Editorial;
import Libreria.persistence.DAOEditorial;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EditorialService {
    Editorial editorial = new Editorial();
    DAOEditorial editorialJpa = new DAOEditorial();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void consultarEditorial(){
        try {
            System.out.println("Ingrese el ID de la editorial que desea consultar");
            editorial = editorialJpa.lookForID(input.nextInt());
            System.out.println(editorial.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void consultarTodosEdit(){
        try {
            List<Editorial> listaEdit = editorialJpa.lookAll();
            listaEdit.forEach((x)->System.out.println(x.getId() + "/" +x.getNombre()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void createEditorial(){
        try {
            System.out.println("Ingrese el nombre del nuevo editorial");
            editorial.setNombre(input.next());
            if(editorial.getNombre().trim().isEmpty()){
                System.out.println("El nombre no puede estar vacio");
            }else{
                editorial.setAlta(true);
                editorialJpa.create(editorial);
                System.out.println("Editorial creado con exito!");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void modifyEditorial(){
        try {
            System.out.println("Lista de editoriales");
            consultarTodosEdit();
            System.out.println("Indique el ID del editorial que desea modificar");
            Integer modi = input.nextInt();
            editorial = editorialJpa.lookForID(modi);
            if(modi == null || modi == 0){
                System.out.println("El editorial no existe!");
            }else{
                System.out.println("Ingrese el nuevo nombre de la editorial" + editorial.getNombre());
                editorial.setNombre(input.next());
                System.out.println("¿El editorial esta de alta o de baja? A/B");
                String alt= input.next();
                editorial.setAlta("a".equalsIgnoreCase(alt)?true: "b".equalsIgnoreCase(alt) ? false:null);
                if(editorial.getNombre().trim().isEmpty() || editorial == null){
                    System.out.println("Debe ingresar un nombre a la editorial");
                }else{
                    editorialJpa.modify(editorial);
                }
                
            }
        } catch (Exception e) {
        }
    }
    public void deleteEditorial(){
        try {
            System.out.println("Lista de editoriales");
            consultarTodosEdit();
            System.out.println("Indique el ID de la editorial que desea eliminar");
            Integer edit = input.nextInt();
            editorial = editorialJpa.lookForID(edit);
            if(edit == null || edit <=0){
                System.out.println("Debe ingresar un ID");
            }else{
                editorialJpa.delete(editorial);
                System.out.println("Editorial eliminada con exito!");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
