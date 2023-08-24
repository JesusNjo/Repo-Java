/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodonto.Entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    
    private String especialidad;

    public Odontologo(String especialidad, Integer id, Integer dni, String nombre, String apellido) {
        super(id, dni, nombre, apellido);
        this.especialidad = especialidad;
    }

    public Odontologo() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
