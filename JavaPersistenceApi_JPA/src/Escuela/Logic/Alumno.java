/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Logic;

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
    private String id_alumno;
    @Basic
    private String nombre_alumno;
    private String apellido_alumno;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento_alumno;
    @OneToOne
    private Carrera carrera;

    public Alumno(String id_alumno, String nombre_alumno, String apellido_alumno, Date fechaNacimiento_alumno, Carrera carrera) {
        this.id_alumno = id_alumno;
        this.nombre_alumno = nombre_alumno;
        this.apellido_alumno = apellido_alumno;
        this.fechaNacimiento_alumno = fechaNacimiento_alumno;
        this.carrera = carrera;
    }

    public Alumno() {
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getApellido_alumno() {
        return apellido_alumno;
    }

    public void setApellido_alumno(String apellido_alumno) {
        this.apellido_alumno = apellido_alumno;
    }

    public Date getFechaNacimiento_alumno() {
        return fechaNacimiento_alumno;
    }

    public void setFechaNacimiento_alumno(Date fechaNacimiento_alumno) {
        this.fechaNacimiento_alumno = fechaNacimiento_alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    
}
