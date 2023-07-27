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
@Table(name = "Autor")
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name ="id_autor")
    private Integer id_autor;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="alta")
    private boolean alta;

    public Autor(String nombre) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.alta = true;
    }

    public Autor() {
    }

    public Integer getId_autor() {
        return id_autor;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
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
