/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjpa.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;


/**
 *
 * @author JesusNjo
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "id_cliente"))
public class Cliente extends Persona implements Serializable {
    
    private String numTelefono;
    private String email;
    private String direccion;

    public Cliente(String numTelefono, String email, String direccion, Integer id, String nombre, String apellido, Integer dni, String fechaNacimiento) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        this.numTelefono = numTelefono;
        this.email = email;
        this.direccion = direccion;
    }

    
    

    public Cliente() {
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
    
    
}
