/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class ServiceToAll {
    
    ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();
    
    
    public void crearListas(Persona n){
        String[] nombresP = {"Rafael","Pedro","Juan","Maria","Petra","Francisco"};
        String[] apellidosP = {"Araujo","Noguera","Naranjo","Ortega","Leon","Jortigo"};
        
        
        
        ArrayList<String> nombresPa= new ArrayList();
        ArrayList<String> apellidosPa= new ArrayList();
        ArrayList<Integer> dniPa = new ArrayList();
        
        Integer[] dni ={234532,213123,12345,332123,456723,332132,123123};
        
        for (int i = 0; i <5; i++) {
         
        nombresPa.add(nombresP[i]);
        apellidosPa.add(apellidosP[i]);
        dniPa.add(dni[i]);
        Collections.shuffle(nombresPa);
        Collections.shuffle(apellidosPa);
        Collections.shuffle(dniPa);
        n = new Persona(nombresPa.get(i),apellidosP[i],dni[i]);
        
        
        }
        
       personas.add(n);
        
        
        for (Persona integer : personas) {
            System.out.println(integer.toString());
        }
        
    }
}
