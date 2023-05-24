/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas_EJ1;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Locale;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class FabricaPerros {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    ArrayList<Persona> arrayPers = new ArrayList();
    ArrayList<Perro> arrayPerr = new ArrayList();
    ArrayList<Persona> arrayPersN = new ArrayList();

    String[] nombresPersonas = {"Juan", "Pedro", "Maria", "Francisco", "Jesus"};
    String[] apellidosPersonas = {"Hernandez", "Naranjo", "Perez", "Silva", "Noguera"};
    Integer[] edadesPersonas = {15, 24, 18, 19, 25};
    Integer[] dniPersonas = {2547548, 485485, 1245845, 152436, 254854};
    //Perros

    String[] nombresPerros = {"Tommy", "Orion", "Zeus", "Mito", "Bruno"};
    String[] razaPerros = {"Golden Retriver", "Pitbull", "Beagle", "Puddle", "Pastor Aleman"};
    Integer[] edadPerros = {5, 4, 8, 6, 2, 1};
    String[] tamanioPerros = {"Mediano", "Grande", "Pequeño", "Mediano", "Pequeño"};

    public void crearPersona() {

        for (int i = 0; i < nombresPersonas.length; i++) {
            Persona persona = new Persona();
            persona.setNombre(nombresPersonas[i]);
            persona.setApellido(apellidosPersonas[i]);
            persona.setEdad(edadesPersonas[i]);
            persona.setDocumento(dniPersonas[i]);

            arrayPers.add(persona);

        }
        Collections.shuffle(arrayPers);
    }

    public void crearPerro() {

        for (int i = 0; i < nombresPerros.length; i++) {
            Perro perro = new Perro();
            perro.setNombre(nombresPerros[i]);
            perro.setRaza(razaPerros[i]);
            perro.setEdad(edadPerros[i]);
            perro.setTamanio(tamanioPerros[i]);

            arrayPerr.add(perro);

        }
        Collections.shuffle(arrayPerr);

    }

    public void asignarPerro() {
        crearPersona();
        crearPerro();
         String op = null;
        do{
            System.out.println("Indique su nombre porfavor: ");
        String nombre = input.next();
        int cont = 0;
        String cond = null;
        boolean condi = true;
       
        for (int i = 0; i < arrayPers.size(); i++) {
            if (nombre.equalsIgnoreCase(arrayPers.get(i).getNombre())) {
                condi = false;
                System.out.println("Bienvenido señor " + nombre);
                System.out.println("La lista de las mascotas son :");
                cont = i;
                for (Perro arrayPer : arrayPerr) {
                    System.out.println(arrayPer.toString());
                }
            }

        }if(condi){
            System.out.println("Su nombre no esta en la lista!");
        }
        System.out.println("Indique la mascota que desea adoptar: ");
        String nombreP = input.next();
        for (int i = 0; i < arrayPerr.size(); i++) {

            if (nombreP.equalsIgnoreCase(arrayPerr.get(i).getNombre())) {
                System.out.println("Los datos del perro son : ");
                System.out.println(arrayPerr.get(i).toString());

                System.out.println("Desea adoptar el perro?");
                cond = input.next();

                if ("s".equalsIgnoreCase(cond)) {
                    System.out.println("Usted ha adoptado a: " + arrayPerr.get(i).getNombre() + " :D");
                    Persona n = new Persona(arrayPers.get(cont).getNombre(),arrayPers.get(cont).getApellido(),arrayPers.get(cont).getEdad(),arrayPers.get(cont).getDocumento(),arrayPerr.get(i));
                    arrayPerr.remove(i);
                    arrayPersN.add(n);
                }
                System.out.println("¿Otra persona desea adoptar ?");
                op = input.next();
            }
        }
        
        }while("s".equalsIgnoreCase(op));
        
        System.out.println("--------------------");
        System.out.println("DATOS DE ADOPCIONES");
        for (Persona arrayPer : arrayPersN) {
            System.out.println(arrayPer.toString());
        }
        
    }

}
