/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Logic;

import java.io.Serializable;
import javax.persistence.Basic;
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

public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_profesor;
    @Basic
    private Long dni_profesor;
    @Basic
    private String nombre_profesor;
    @Basic
    private String apellido_profesor;
    @OneToOne
    private Carrera carrera;
    
    public Profesor() {
    }

    public Profesor(int id_profesor, Long dni_profesor, String nombre_profesor, String apellido_profesor, Carrera carrera) {
        this.id_profesor = id_profesor;
        this.dni_profesor = dni_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellido_profesor = apellido_profesor;
        this.carrera = carrera;
    }

   
    

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Long getDni_profesor() {
        return dni_profesor;
    }

    public void setDni_profesor(Long dni_profesor) {
        this.dni_profesor = dni_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getApellido_profesor() {
        return apellido_profesor;
    }

    public void setApellido_profesor(String apellido_profesor) {
        this.apellido_profesor = apellido_profesor;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
