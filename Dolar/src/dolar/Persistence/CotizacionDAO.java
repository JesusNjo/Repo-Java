/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar.Persistence;

import dolar.Entities.Cotizacion;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class CotizacionDAO extends DAO<Cotizacion>{
    
    
    
    public void createCo(Cotizacion cotizacion){
        super.create(cotizacion);
    }
    public void deleteC(Long id){
        Cotizacion cotizacion = lookForId(id);
        super.delete(cotizacion);
    }

    public Cotizacion lookForId(Long id) {
        conected();
        Cotizacion cotizacion = em.find(Cotizacion.class, id);
        
        return cotizacion;
    }
    
    public List<Cotizacion> lookForAll(){
        conected();
        List<Cotizacion> cotizaciones = em.createQuery("SELECT a FROM Cotizacion a").getResultList();
        
        return cotizaciones;
    }
    
}
