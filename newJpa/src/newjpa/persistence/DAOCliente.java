/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.persistence;

import java.util.List;
import newjpa.entities.Cliente;

/**
 *
 * @author JesusNjo
 */
public class DAOCliente extends DAO<Cliente>{
    
    public void createCliente(Cliente cliente){
        super.create(cliente);
    }
    public void deleteCliente(Integer id){
        Cliente cliente = lookForId(id);
        super.delete(cliente);
    }

    public Cliente lookForId(Integer id) {
        conected();
        Cliente cliente = em.createQuery("SELECT a FROM Cliente a WHERE a.id = :id",Cliente.class).setParameter("id", id).getSingleResult();
        return cliente;
        
    }
    
    public List<Cliente> lookAll(){
        conected();
        List<Cliente> listaCliente = em.createQuery("SELECT a FROM Cliente a").getResultList();
        return listaCliente;
    }
}
