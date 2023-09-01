/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistence;

import Libreria.entities.Autor;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class DAOAutor extends DAO<Autor> {

    public void crearAutor(Autor autor) {
        super.create(autor);
    }

    public void deleteAutor(Integer id) {
        Autor autor = lookForID(id);
        super.delete(autor);
        
    }

    public Autor lookForID(Integer id) {
        conect();
        try {
            Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.id = :id", Autor.class).setParameter("id", id).getSingleResult();
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Autor> lookAll() {
        conect();
        List<Autor> listAut = em.createQuery("SELECT a FROM Autor a").getResultList();
        
        return listAut;
    }

}
