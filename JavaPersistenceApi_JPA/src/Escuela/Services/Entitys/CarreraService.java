/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela.Services.Entitys;

import Escuela.Logic.Carrera;
import Escuela.Persistence.CarreraJpaController;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CarreraService {
    
    CarreraJpaController carreJpa = new CarreraJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void crearCarrera(Carrera carrera) {
        carrera = new Carrera();
        System.out.println("Indique el ID de la carrera");
        carrera.setId_carrera(input.nextInt());
        System.out.println("Indique el nombre de la carrera");
        carrera.setNombre_carrera(input.next());
        
        carreJpa.create(carrera);
        System.out.println("Carrera creada exitosamente!!\n");
    }
    
    public void eliminarCarrera(int id) throws Exception {
        
        try {
            
            carreJpa.destroy(id);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarCarrera(int id) {
        
        try {
            
            Carrera carrera = carreJpa.findCarrera(id);
            System.out.println(carrera.getId_carrera() + "/" + carrera.getNombre_carrera());
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public ArrayList<Carrera> mostrarCarreras() {
        
        try {
            ArrayList<Carrera> carreras = new ArrayList();
            int valorMax = 10;
            int inicio = 0;
            boolean hayMas = true;
            
            while (hayMas) {
                List<Carrera> listaCarr = carreJpa.findCarreraEntities(valorMax, inicio);
                if (carreras.isEmpty()) {
                    hayMas = false;
                } else {
                    carreras.addAll(listaCarr);
                    inicio += valorMax;
                }
                
                for (Carrera carrera : listaCarr) {
                    System.out.println(carrera.getId_carrera() + " " + carrera.getNombre_carrera());
                }
            }
            
            return carreras;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarCarrera(Carrera carrera) throws Exception {
        
        try {
            
            ArrayList<Carrera> bus = mostrarCarreras();
            System.out.println("Indique el ID del alumno que desea modificar");
            int idCarrera = input.nextInt();
            
            for (Carrera bu : bus) {
                if (bu.getId_carrera() == idCarrera) {
                    carrera = bu;
                }
            }
            System.out.println("--------------------------------------");
            
            System.out.println("Indique el valor que desea modificar");
            System.out.println("1:Nombre\n2:Todos los datos");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Indique el nuevo nombre");
                    carrera.setNombre_carrera(input.next());
                    break;
                case 2:
                    System.out.println("Indique los nuevos datos de la carrera");
                    
                    eliminarCarrera(idCarrera);
                    crearCarrera(carrera);
                    break;
            }
            carreJpa.edit(carrera);
        } catch (Exception e) {
            throw e;
            
        }
    }
    
}
