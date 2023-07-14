/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services;

import Escuela.Logic.Alumno;
import Escuela.Logic.Carrera;
import Escuela.Logic.Profesor;
import Escuela.Persistence.AlumnoJpaController;
import Escuela.Persistence.CarreraJpaController;
import Escuela.Persistence.ProfesorJpaController;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.persistence.TypedQuery;

/**
 *
 * @author JesusNjo
 */
public class ServiceAcciones {

    ArrayList<String> lista = new ArrayList();
    Alumno alumno = null;
    Carrera carrera = null;
    Profesor profesor = null;
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AlumnoJpaController alumnJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    ProfesorJpaController profJpa = new ProfesorJpaController();

    public void menu() throws Exception {
        int op = 0;

        do {
            System.out.println("-----Seleccione una opción del menú-----");
            System.out.println("1:Crear Alumno,Carrera o Profesor\n2:\n3:\n4:\n5:\n6:");
            op = input.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Elija que desea crea\n1:Alumno\n2:Carrera\n3:Profesor");
                    int operacion = input.nextInt();
                    if (operacion == 1) {
                        alumno = new Alumno();
                        System.out.println("Indique el ID del alumno");
                        alumno.setId_alumno(input.next());
                        System.out.println("Indique el nombre del alumno");
                        alumno.setNombre_alumno(input.next());
                        System.out.println("Indique el apellido del alumno");
                        alumno.setApellido_alumno(input.next());
                        System.out.println("Indique la fecha de nacimiento del alumno M/D/A");
                        String fecha = input.next() + "/" + input.next() + "/" + input.next();
                        alumno.setFechaNacimiento_alumno(new Date(fecha));
                        System.out.println("Indique la carrera que desea cursar");
                        int cr = input.nextInt();
                        Carrera carrera = carreJpa.getEntityManager().find(Carrera.class, cr);
                        alumno.setCarrera(carrera);

                        alumnJpa.create(alumno);
                        System.out.println("Alumno creado exitosamente!!\n");
                    }
                    if (operacion == 2) {
                        carrera = new Carrera();
                        System.out.println("Indique el ID de la carrera");
                        carrera.setId_carrera(input.nextInt());
                        System.out.println("Indique el nombre de la carrera");
                        carrera.setNombre_carrera(input.next());

                        carreJpa.create(carrera);
                        System.out.println("Carrera creada exitosamente!!\n");

                    }
                    if (operacion == 3) {
                        profesor = new Profesor();
                        System.out.println("Indique el ID del profesor");
                        profesor.setId_profesor(input.nextInt());
                        System.out.println("Indique el DNI del profesor");
                        profesor.setDni_profesor(input.nextLong());
                        System.out.println("Indique el nombre del profesor");
                        profesor.setNombre_profesor(input.next());
                        System.out.println("Indique el apellido del profesor");
                        profesor.setApellido_profesor(input.next());
                        System.out.println("Indique la carrera que dará el profesor");
                        int c = input.nextInt();
                        Carrera carrera = carreJpa.getEntityManager().find(Carrera.class, c);

                        profesor.setCarrera(carrera);
                        profJpa.create(profesor);
                        System.out.println("Profesor creado exitosamente!!\n");
                    }
                    break;
            }

        } while (op != 0);
    }

}
