/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.services;

import Libreria.entities.Autor;
import Libreria.persistence.DAOAutor;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class AutorService {

    Autor autor = new Autor();
    DAOAutor autorJpa = new DAOAutor();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void consultar(){
        try {
            System.out.println("Indique el ID del autor que desea consultar");
            Integer id = input.nextInt();
            autor =autorJpa.lookForID(id);
            System.out.println(autor.getNombre());
        } catch (Exception e) {
            System.out.println("Error al consultar el autor: " + e.getMessage());
        }
    }
    public void consultarTodos(){
        try {
            List<Autor> listaAutores = autorJpa.lookAll();
            
           listaAutores.forEach((x)->System.out.println(x.getNombre())) ;
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    public void crearAutor() {
        try {
            System.out.println("Ingrese el nombre del autor");
            autor.setNombre(input.next());
            autor.setAlta(true);
            autorJpa.crearAutor(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarAutor() {

        try {
            System.out.println("Ingrese el ID del autor que desea modificar");
            int valor = input.nextInt();
            autor = autorJpa.lookForID(valor); 
            if(autor == null){
                System.out.println("No exite");
            }else{
               
            System.out.println("Ingrese el nuevo nombre de: "+autor.getNombre());    
            autor.setNombre(input.next());
            System.out.println("¿Esta de alta o de baja? A/B");
            String ab = input.next();
            autor.setAlta("a".equalsIgnoreCase(ab) ? true : "b".equalsIgnoreCase(ab) ? false : null);
            
            autorJpa.modify(autor);
            }
            

        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminar(){
        try {
            System.out.println("Indique el ID del autor que desea eliminar");
            autor = autorJpa.lookForID(input.nextInt());
            System.out.println("Desea eliminar a: "+autor.getId() + " " +autor.getNombre() + "? S/N");
            String resp = input.next();
            if("s".equalsIgnoreCase(resp)){
                autorJpa.deleteAutor(autor.getId());
                System.out.println("Autor eliminado...");
            }else{
                System.out.println("Hasta luego..");
            }
            
        } catch (Exception e) {
            System.out.println("Error al consultar el autor: " + e.getMessage());;
        }
    }

}
