/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services.Entitys;

import Escuela.Logic.Alumno;
import Escuela.Logic.Carrera;
import Escuela.Persistence.AlumnoJpaController;
import Escuela.Persistence.CarreraJpaController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.persistence.Query;

public class AlumnoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AlumnoJpaController alumnJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();

    public void crearAlumno(Alumno alum) throws Exception {

        try {

            if (alum == null) {
                throw new Exception("No puede agregar campos vacios!");
            }

            System.out.println("Indique el ID del alumno");
            alum.setId_alumno(input.next());
            System.out.println("Indique el nombre del alumno");
            alum.setNombre_alumno(input.next());
            System.out.println("Indique el apellido del alumno");
            alum.setApellido_alumno(input.next());
            System.out.println("Indique la fecha de nacimiento del alumno M/D/A");
            String fecha = input.next() + "/" + input.next() + "/" + input.next();
            alum.setFechaNacimiento_alumno(new Date(fecha));
            System.out.println("Indique la carrera que desea cursar");
            int cr = input.nextInt();
            Carrera carrera = carreJpa.getEntityManager().find(Carrera.class, cr);
            alum.setCarrera(carrera);

            alumnJpa.create(alum);
            System.out.println("Alumno creado exitosamente!!\n");
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarAlumno(String id) throws Exception {

        try {

            alumnJpa.destroy(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public Alumno mostrarAlumno(String id) {
        try {
            Alumno alumno = alumnJpa.findAlumno(id);
            System.out.println("Nombre del alumno: " + alumno.getNombre_alumno());
            System.out.println("ID del alumno: " + alumno.getId_alumno());

            return alumno;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Alumno> buscarTodosLosAlumnos() {
        try {
            ArrayList<Alumno> alumnos = new ArrayList();
            int maxResults = 10;
            int firstResult = 0;
            boolean hayMasResultados = true;
            while (hayMasResultados) {
                List<Alumno> listaDeAlumnos = alumnJpa.findAlumnoEntities(maxResults, firstResult);
                if (listaDeAlumnos.isEmpty()) {
                    hayMasResultados = false;
                } else {
                    alumnos.addAll(listaDeAlumnos);
                    firstResult += maxResults;
                }
                int i = 1;
                for (Alumno listaDeAlumno : listaDeAlumnos) {
                    System.out.println((i++) + ": " + listaDeAlumno.getNombre_alumno() + " " + listaDeAlumno.getApellido_alumno());
                }
            }
            return alumnos;
        } catch (Exception e) {
            throw e;
        }
    }

}
