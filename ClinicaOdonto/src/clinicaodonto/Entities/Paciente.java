/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodonto.Entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author JesusNjo
 */
@Entity
public class Paciente extends Persona implements Serializable{
    
    private boolean tiene_so;
    private String tipo_sangre;

    public Paciente(boolean tiene_so, String tipo_sangre, Integer id, Integer dni, String nombre, String apellido) {
        super(id, dni, nombre, apellido);
        this.tiene_so = tiene_so;
        this.tipo_sangre = tipo_sangre;
    }

    public Paciente() {
    }

    public boolean isTiene_so() {
        return tiene_so;
    }

    public void setTiene_so(boolean tiene_so) {
        this.tiene_so = tiene_so;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
    
}
