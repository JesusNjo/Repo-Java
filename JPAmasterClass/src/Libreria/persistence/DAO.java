/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author JesusNjo
 * @param <T>
 */
public class DAO<T> {

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrePU");
    protected EntityManager em = emf.createEntityManager();

    public DAO() {
    }

    public void conect() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    public void disconect() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void create(T object) {
        conect();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }finally{
            disconect();
        }
    }
    
    public void modify(T object){
            conect();
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }finally{
            disconect();
        }
    }
    
    public void delete(T object){
        conect();
        try {
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }finally{
            disconect();
        }
    }
    
    
//    protected EntityManagerFactory emf =Persistence.createEntityManagerFactory("LibrePU");
//    protected EntityManager em = emf.createEntityManager();
//
//    public DAO() {
//    }
//    
//    public void conect(){
//        if(!em.isOpen()){
//            em = emf.createEntityManager();
//        }
//    }
//    public void disconect(){
//        if(em.isOpen()){
//            em.close();
//        }
//    }
//    
//    public void create(T object){
//        try {
//            conect();
//            em.getTransaction().begin();
//            em.persist(object);
//            em.getTransaction().commit();
//            disconect();
//        } catch (Exception e) {
//            throw e;
//        }
//        
//    }
//    
//    public void modify(T object){
//        try {
//            conect();
//            em.getTransaction().begin();
//            em.merge(object);
//            em.getTransaction().commit();
//            disconect();
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
//    public void delete(T object){
//        try {
//            conect();
//            em.getTransaction().begin();
//            em.remove(object);
//            em.getTransaction().commit();
//            disconect();
//        } catch (Exception e) {
//            throw e;
//        }
//    }
}
