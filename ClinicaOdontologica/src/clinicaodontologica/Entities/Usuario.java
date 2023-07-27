/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodontologica.Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_usuario;
    private String nombre_us;
    private String contrasenia;
    private String tipo_us;

    public Usuario(Integer id_usuario, String nombre_us, String contrasenia, String tipo_us) {
        this.id_usuario = id_usuario;
        this.nombre_us = nombre_us;
        this.contrasenia = contrasenia;
        this.tipo_us = tipo_us;
    }

    public Usuario() {
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_us() {
        return nombre_us;
    }

    public void setNombre_us(String nombre_us) {
        this.nombre_us = nombre_us;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo_us() {
        return tipo_us;
    }

    public void setTipo_us(String tipo_us) {
        this.tipo_us = tipo_us;
    }
    
    
}
