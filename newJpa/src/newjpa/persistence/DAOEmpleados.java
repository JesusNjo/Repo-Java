/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.persistence;

import java.util.List;
import newjpa.entities.Empleado;

/**
 *
 * @author JesusNjo
 */
public class DAOEmpleados extends DAO<Empleado> {
    
    public void createEmple(Empleado empleado){
        super.create(empleado);
    }
    public void deleteEmpleado(Integer id){
        Empleado empleado = lookForID(id);
        super.delete(empleado);
    }

    public Empleado lookForID(Integer id) {
        conected();
        Empleado empleado = em.createQuery("SELECT c FROM Cliente c WHERE c.id = :id",Empleado.class).setParameter("id", id).getSingleResult();
        return empleado;
    }
    public List<Empleado> lookAll(){
        conected();
        List<Empleado> listEmpleado = em.createQuery("SELECT c FROM Cliente c").getResultList();
        return listEmpleado;
    }
}
