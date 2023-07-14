/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import Escuela.Services.AlumnoService;
import Escuela.Services.CarreraService;

/**
 *
 * @author JesusNjo
 */
public class EscuelaMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        CarreraService carrera = new CarreraService();
        AlumnoService alum = new AlumnoService();
        
        alum.crearAlumno();
        
    }
    
}
