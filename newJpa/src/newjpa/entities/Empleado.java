/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.entities;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JesusNjo
 */
@Entity
@AttributeOverride(name = "id",column = @Column(name = "id_empleado"))
public class Empleado extends Persona{
    
    private String cargo;
    
    private String fechaIngreso;

    public Empleado(String cargo, String fechaIngreso, Integer id, String nombre, String apellido, Integer dni, String fechaNacimiento) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    
    
  
    

   
    

    public Empleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    

    
    
    
}
