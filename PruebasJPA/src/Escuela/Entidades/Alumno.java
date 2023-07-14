/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Alumno implements Serializable {
    @Id
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE)
    private Date FechaNacimiento;
    
    @OneToOne
    private Carrera carrera;

    public Alumno(int id, String nombre, String apellido, Date FechaNacimiento, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNacimiento = FechaNacimiento;
        this.carrera = carrera;
    }

    

    
    

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

  
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
