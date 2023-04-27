/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PracticaService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public PracticaClass crearMascota(){
        PracticaClass mascota = new PracticaClass();
        
        System.out.println("Ingrese la cantidad de mascota que desea agregar");
        int op =input.nextInt();
        
        List<PracticaClass> mascotas = new ArrayList();
        for(int i=0; i<op;i++){
        System.out.println("Ingrese el nombre");
        mascota.setNombre(input.next());
        System.out.println("Ingrese apodo");
        mascota.setApodo(input.next());
        System.out.println("Ingrese el tipo de mascota");
        mascota.setTipo(input.next());
        mascotas.add(mascota);
        }
        System.out.println(mascotas.size());
        System.out.println(mascotas.toString());

        
        return mascota;
        
        
    }
    
}
