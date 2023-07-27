/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodontologica;

import clinicaodontologica.Entities.Paciente;
import clinicaodontologica.Entities.Usuario;
import clinicaodontologica.Persistence.PacienteJpaController;
import clinicaodontologica.Persistence.UsuarioJpaController;
import java.util.Date;

/**
 *
 * @author JesusNjo
 */
public class ClinicaOdontologica {

    /**
     * <property name="hibernate.hbm2ddl.auto" value="create" />

     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PacienteJpaController pasx = new PacienteJpaController();
        Paciente pass = new Paciente(2,true, "o+", 1, "juan", "perez", "48484", "Urb pma", new Date("14/2/1994"));

        
        pasx.create(pass);
        
        
    }
    
}
