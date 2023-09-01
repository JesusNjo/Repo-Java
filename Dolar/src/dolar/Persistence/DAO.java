/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JesusNjo
 */
public abstract class DAO<T> {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DolarPU");
    EntityManager em = emf.createEntityManager();
    

    
    public void conected(){
        if(!em.isOpen()){
            em = emf.createEntityManager();
        }
    }
     
    public void disconected(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    public void create(T object){
        conected();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }finally{
            disconected();
        }
    }
    
    public void modify(T object){
        conected();
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }finally{
            disconected();
        }
    }
    
    public void delete(T object){
        conected();
        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }finally{
            disconected();
        }
    }
}

