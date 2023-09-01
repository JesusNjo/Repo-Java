/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistence;

import Libreria.entities.Editorial;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class DAOEditorial extends DAO<Editorial> {
    
    
  
    public void createEdit(Editorial editorial){
        super.create(editorial);
    }
    public void deleteEdit(Integer id){
        Editorial editorial = lookForID(id);
        super.delete(editorial);
    }
    
     public Editorial lookForID(Integer id) {
         conect();
         Editorial editorial = em.find(Editorial.class, id);
        
         return editorial;
    }
     
     public List<Editorial> lookAll(){
         conect();
         List<Editorial> editorList = em.createQuery("SELECT a FROM Editorial a").getResultList();
         
         
         return editorList;
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    
//      public void create(Editorial editorial){
//        super.create(editorial);
//    }
//    
//    public void delete(Integer id){
//        Editorial editorial = lookForID(id);
//        super.delete(editorial);
//    }
//
//    public Editorial lookForID(Integer id) {
//        conect();
//        Editorial editorial = em.find(Editorial.class, id);
//        disconect();
//        
//        return editorial;
//    }
//    
//    public List<Editorial> lookAll(){
//        conect();
//        List<Editorial> listEdito = em.createQuery("SELECT e FROM editorial e").getResultList();
//        disconect();
//        return listEdito;
//    }

   
    
}
