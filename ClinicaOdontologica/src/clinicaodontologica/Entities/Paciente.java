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

/**
 *
 * @author JesusNjo
 */
@Entity
public class Paciente extends Person{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id_paciente;
    private boolean tiene_os;
    private String tipo_sangre;

    public Paciente(Integer id_paciente, boolean tiene_os, String tipo_sangre, Integer id_persona, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id_persona, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_paciente = id_paciente;
        this.tiene_os = tiene_os;
        this.tipo_sangre = tipo_sangre;
    }

    

    public Paciente() {
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isTiene_os() {
        return tiene_os;
    }

    public void setTiene_os(boolean tiene_os) {
        this.tiene_os = tiene_os;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
}
