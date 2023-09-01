/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistence;

import Libreria.entities.Libro;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class DAOLibro extends DAO<Libro>{
    
    
   public void createBook(Libro libro){
       super.create(libro);
   }
   public void deleteBook(Long id){
       Libro libro = lookForID(id);
       super.delete(libro);
   }

    public Libro lookForID(Long id) {
        conect();
        Libro libro = em.find(Libro.class, id);
       
        return libro;
    }
    
    public List<Libro> lookall(){
        conect();
        List<Libro> listBook = em.createQuery("SELECT a FROM Libro a").getResultList();
        return listBook;
    }
    
}
