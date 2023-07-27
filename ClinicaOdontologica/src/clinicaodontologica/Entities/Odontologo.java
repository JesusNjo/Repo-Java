/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodontologica.Entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Odontologo extends Person {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_odontologo;
    private String especialidad;
    @OneToOne
    private Usuario usuario;

   

  

   
    
    
    public Odontologo() {
    }

    public Integer getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(Integer id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
