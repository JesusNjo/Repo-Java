/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar.Entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Cotizacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_cambio")
    private String tipoCambio;
    @Column(name ="valor")
    private Double tipoValor;
    @Column(name="fechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    public Cotizacion(Long id, String tipoCambio, Double tipoValor, Date fechaRegistro) {
        this.id = id;
        this.tipoCambio = tipoCambio;
        this.tipoValor = tipoValor;
        this.fechaRegistro = fechaRegistro;
    }

    public Cotizacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Double getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(Double tipoValor) {
        this.tipoValor = tipoValor;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "\nId:" + id + "\nTipo de cambio: " + tipoCambio + "\nTipo de valor: " + tipoValor + "\nFecha de registro: " + fechaRegistro;
    }
    
    
       
}
