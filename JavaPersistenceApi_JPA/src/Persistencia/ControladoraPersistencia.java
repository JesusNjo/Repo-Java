/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Alumno;

/**
 *
 * @author JesusNjo
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController Jpa = new AlumnoJpaController();
    
    
    public void crearAlumno(Alumno alu) throws Exception{
        
        try {
            Jpa.create(alu);
        } catch (Exception e) {
            throw e;
        }
    }
}
