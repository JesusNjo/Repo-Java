/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services;

import Escuela.Logic.Alumno;
import Escuela.Logic.Carrera;
import Escuela.Logic.Profesor;
import Escuela.Services.Entitys.AlumnoService;
import Escuela.Services.Entitys.CarreraService;
import Escuela.Services.Entitys.ProfesorService;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ServiceAcciones {

    // Services
    AlumnoService modifAlum = new AlumnoService();
    CarreraService modifCarr = new CarreraService();
    ProfesorService modifProf = new ProfesorService();
    //Entitys
    Alumno alumno = new Alumno();
    Profesor profesor = new Profesor();
    Carrera carrera = new Carrera();
    //Funcionalidades
    ArrayList<String> lista = new ArrayList();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    int operacion = 0;

    public void menu() throws Exception {
        int op = 0;

        do {
            System.out.println("-----Seleccione una opción del menú-----");
            System.out.println("1:Crear Alumno,Carrera o Profesor\n2:Eliminar Alumno,Carrera o Profesor\n3:Mostrar un Alumno,Carrera o Profesor\n4:Mostrar Alumnos,Carreras o Profesores\n5:Modificar alumno\n6:");
            op = input.nextInt();
            switch (op) {
                case 1:

                    System.out.println("Elija que desea crea\n1:Alumno\n2:Carrera\n3:Profesor");
                    operacion = input.nextInt();
                    if (operacion == 1) {

                        modifAlum.crearAlumno(alumno);
                    }
                    if (operacion == 2) {

                        modifCarr.crearCarrera(carrera);

                    }
                    if (operacion == 3) {

                        modifProf.crearProfesor(profesor);
                    }
                    break;

                case 2:
                    System.out.println("Elija que desea eliminar\n1:Alumno\n2:Carrera\n3:Profesor");

                    operacion = input.nextInt();

                    if (operacion == 1) {
                        System.out.println("Indique el ID del alumno que desea eliminar");
                        String id = input.next();
                        modifAlum.eliminarAlumno(id);
                        System.out.println("Alumno eliminado con exito!");
                    }
                    if (operacion == 2) {
                        System.out.println("Indique el ID de la carrera que desea eliminar");
                        int id = input.nextInt();
                        modifCarr.eliminarCarrera(id);
                        System.out.println("Carrera eliminada con exito!");
                    }
                    if (operacion == 3) {
                        System.out.println("Indique el ID del profesor que desea eliminar");
                        int id = input.nextInt();
                        modifProf.eliminarProfesor(id);
                        System.out.println("Profesor eliminado con exito!");
                    }
                    break;

                case 3:
                    System.out.println("Elija que desea verificar\n1:Alumno\n2:Carrera\n3:Profesor");

                    operacion = input.nextInt();
                    if (operacion == 1) {

                        System.out.println("Indique el id del alumno");
                        String id = input.next();
                        modifAlum.mostrarAlumno(id);
                    }
                    if (operacion == 2) {
                        System.out.println("Indique el id de la carrera");
                        int it = input.nextInt();
                        modifCarr.mostrarCarrera(it);
                    }
                    if (operacion == 3) {
                        System.out.println("Indique el id del profesor");
                        int it = input.nextInt();
                        modifProf.mostrarProfesor(it);
                    }
                    break;

                case 4:
                    System.out.println("Elija que lista desea verificar\n1:Alumnos\n2:Carreras\n3:Profesores");
                    operacion = input.nextInt();
                    if (operacion == 1) {
                        System.out.println("---Lista de Alumnos---");
                        modifAlum.buscarTodosLosAlumnos();
                    }
                    if (operacion == 2) {
                        System.out.println("--Lista de Carreras---");
                        modifCarr.mostrarCarreras();
                    }
                    if (operacion == 3) {
                        System.out.println("--Lista de Profesores---");
                        modifProf.mostrarProfesores();
                    }

                    break;

                case 5:

                    modifAlum.modificarAlumno(alumno);
            }

        } while (op != 0);
    }

}
