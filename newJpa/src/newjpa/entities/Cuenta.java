/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numCuenta;
    private String fechaApertura;
    private Cliente cliente;

    public Cuenta(Long numCuenta, String fechaApertura, Cliente cliente) {
        this.numCuenta = numCuenta;
        this.fechaApertura = fechaApertura;
        this.cliente = cliente;
    }

    public Cuenta() {
    }

    public Long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
