/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services;

import Escuela.Entidades.Alumno;
import Escuela.Entidades.Carrera;
import Escuela.Persistence.AlumnoJpaController;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class AlumnoService {
    
    AlumnoJpaController alumJpa = new AlumnoJpaController();
    
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void crearAlumno() throws Exception{
        
        try {
            Alumno alu = new Alumno();
            Carrera ca = new Carrera();
            System.out.println("Ingrese el DNI del alumno");
            alu.setId(input.nextInt());
            System.out.println("Ingrese el nombre del alumno");
            alu.setNombre(input.next());
            System.out.println("Ingrese el apellido del alumno");
            alu.setApellido(input.next());
            System.out.println("Ingrese el fecha de nacimiento del alumno M-D-A");
            String fecha = input.next()+"/"+input.next()+"/"+input.next();
            alu.setFechaNacimiento(new Date(fecha));
            
            alu.setCarrera(ca);
            alumJpa.create(alu);
        } catch (Exception e) {
            throw e;
        }
    }
}
