/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services.Entitys;

import Escuela.Logic.Carrera;
import Escuela.Logic.Profesor;
import Escuela.Persistence.CarreraJpaController;
import Escuela.Persistence.ProfesorJpaController;
import Escuela.Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ProfesorService {

    CarreraJpaController carreJpa = new CarreraJpaController();
    ProfesorJpaController profJpa = new ProfesorJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void crearProfesor(Profesor profesor) {
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
    
    public void eliminarProfesor(int id) throws Exception {

        try {
            
            profJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            throw e;
        }
    }
    
    public void mostrarProfesor(int id){
        try {
            Profesor profesor = profJpa.findProfesor(id);
            System.out.println(profesor.getNombre_profesor() + " "+profesor.getApellido_profesor());
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public ArrayList<Profesor> mostrarProfesores(){
        
        try {
            ArrayList<Profesor> profesores = new ArrayList();
            int valueMaxi = 10;
            int valueMinimo = 0;
            boolean hayMasoQue= true;
            
            while(hayMasoQue){
                List<Profesor> buscarProf = profJpa.findProfesorEntities(valueMaxi,valueMinimo);
                if(profesores.isEmpty()){
                    hayMasoQue = false;
                }else{
                    profesores.addAll(buscarProf);
                    valueMinimo += valueMaxi;
                }
                
                for (Profesor profesor : buscarProf) {
                    System.out.println(profesor.getId_profesor() + " "+profesor.getNombre_profesor() + " "+profesor.getApellido_profesor());
                    
                }
            }
            return profesores;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProfesor(Profesor profesor) throws Exception {

        try {

            ArrayList<Profesor> bus = mostrarProfesores();
            System.out.println("Indique el ID del alumno que desea modificar");
           int idProf = input.nextInt();

            for (Profesor prof : bus) {
                if(prof.getId_profesor() == idProf){
                    profesor = prof;
                }
            }
         

            System.out.println("Indique el valor que desea modificar");
            System.out.println("1:Nombre\n2:Apellido\n3:DNI profesor\n4:Carrera\n5:Todos los datos");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Indique el nuevo nombre");
                   profesor.setNombre_profesor(input.next());
                    break;
                case 2:
                    System.out.println("Indique el nuevo apellido");
                    profesor.setNombre_profesor(input.next());
                    break;
                case 3:
                    System.out.println("Indique el nuevo DNI");
                   
                    profesor.setDni_profesor(input.nextLong());
                    break;
                case 4:
                    System.out.println("Indique la carrera que desea cursar");
                    int cr = input.nextInt();
                    Carrera carrera = carreJpa.getEntityManager().find(Carrera.class, cr);
                    profesor.setCarrera(carrera);
                    break;

                case 5:
                    eliminarProfesor(idProf);
                   
                    crearProfesor(profesor);
                    break;

            }
            profJpa.edit(profesor);
        } catch (Exception e) {
            throw e;

        }
    }
}
