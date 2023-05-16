/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package EjerciciosManosALO;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class persona{
    private String nombre;
    private String apellido;
    private dni rela;

    public persona(String nombre, String apellido, dni rela) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rela = rela;
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

    public dni getRela() {
        return rela;
    }

    public void setRela(dni rela) {
        this.rela = rela;
    }

   
    @Override
    public String toString() {
        return "\nNombre: " + nombre+"\nApellido: " +apellido +"\nDNI: " +rela.getSerie()+"-"+rela.getNum();
    }
    
    
    
    
}

