/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjpa2.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JesusNjo
 */
@Entity
@Table(name = "Editorial")
public class Editorial implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_editorial")
    private Integer id_editorial;
    @Column(name="nombre_editorial")
    private String nombre;
    @Column(name="alta")
    private boolean alta;

    public Editorial(Integer id_editorial, String nombre, boolean alta) {
        this.id_editorial = id_editorial;
        this.nombre = nombre;
        this.alta = alta;
    }


    
    

    public Editorial() {
    }
    public Integer getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(Integer id_editorial) {
        this.id_editorial = id_editorial;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    
    

}
