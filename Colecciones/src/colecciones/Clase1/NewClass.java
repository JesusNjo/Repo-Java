/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.Clase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NewClass {
    
    private List<Mascota> mascotas;
    
    public NewClass(){
        this.mascotas =new ArrayList();
    }
    
    
    public Mascota crearMascota(){
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre");
        String nombre = input.next();
        System.out.println("Ingrese el apodo");
        String apodo = input.next();
        System.out.println("Ingrese el tipo ");
        String tipo = input.next();
        Mascota m = new Mascota(nombre,apodo,tipo);
        mascotas.add(m);
        return m;
    }
    
    
    public void mostrarMascota(){
        
        System.out.println("Las mascotas de la lista son: ");
        
        mascotas.forEach((mascota)->{
            System.out.println(mascota.toString());
        });
        System.out.println("Cantidad de masctoas son: "+mascotas.size());
    }

  
   
    
    public void fabricaMascotas(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            Mascota aux = new Mascota("Pedro","Loe","Canino");
            mascotas.add(aux);
            //mascotas.add(crearMascota());
        }
    }
    
}
