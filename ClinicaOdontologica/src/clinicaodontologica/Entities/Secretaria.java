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
public class Secretaria extends Person{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_secretaria;
    private String sector;
    @OneToOne
    private Usuario usuario;

    public Secretaria(Integer id_secretaria, String sector, Usuario usuario, Integer id_persona, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id_persona, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_secretaria = id_secretaria;
        this.sector = sector;
        this.usuario = usuario;
    }

    

    public Secretaria() {
    }

    public Integer getId_secretaria() {
        return id_secretaria;
    }

    public void setId_secretaria(Integer id_secretaria) {
        this.id_secretaria = id_secretaria;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
