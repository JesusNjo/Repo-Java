/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;

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
        
        Alumno alum = new Alumno("2848","Fernando","Gutierrez",new Date("1/7/1984"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        control.crearAlumno(alum);
    }
    
}
