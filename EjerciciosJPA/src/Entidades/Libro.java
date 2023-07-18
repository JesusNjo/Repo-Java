/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long isbn;
    @Basic
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplares_prestados;
    private Integer ejemplares_restantes;
    private boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplares_prestados, Integer ejemplares_restantes, boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
        this.ejemplares_restantes = ejemplares_restantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    

 


    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(Integer ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public Integer getEjemplares_restantes() {
        return ejemplares_restantes;
    }

    public void setEjemplares_restantes(Integer ejemplares_restantes) {
        this.ejemplares_restantes = ejemplares_restantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    
    
    
    
}
