/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Alumno;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController Jpa = new AlumnoJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void crearAlumno(Alumno alu) throws Exception{
        
        try {
            System.out.println("Ingrese el DNI del alumno");
            alu.setDni(input.next());
            System.out.println("Ingrese el nombre del alumno");
            alu.setNombre(input.next());
            System.out.println("Ingrese el apellido del alumno");
            alu.setApellido(input.next());
            System.out.println("Ingrese el fecha de nacimiento del alumno M-D-A");
            String fecha = input.next() + "/"+input.next()+"/"+input.next();
            
            alu.setFechaNac(new Date(fecha));
            
            Jpa.create(alu);
        } catch (Exception e) {
            throw e;
        }
    }
}
