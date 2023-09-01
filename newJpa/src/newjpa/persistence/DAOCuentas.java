/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.persistence;

import java.util.List;
import newjpa.entities.Cuenta;

/**
 *
 * @author JesusNjo
 */
public class DAOCuentas extends DAO<Cuenta> {
    
    
    
    public void createAcc(Cuenta cuenta){
        super.create(cuenta);
    }
    public void deleteAcc(Long id){
        Cuenta cuenta = lookForAcc(id);
        super.delete(cuenta);
    }

    public Cuenta lookForAcc(Long id) {
        conected();
        Cuenta cuenta = em.createQuery("SELECT a FROM Cuenta a WHERE a.numCuenta = :numCuenta",Cuenta.class).setParameter("numCuenta", id).getSingleResult();
        
        return cuenta;
    }
    
    public List<Cuenta> lookAll(){
        conected();
        List<Cuenta> cuentaList= em.createQuery("SELECT a FROM Cuenta a").getResultList();
        
        return cuentaList;
    }
}
