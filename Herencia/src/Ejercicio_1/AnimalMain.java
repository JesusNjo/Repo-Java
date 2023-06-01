/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author JesusNjo
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Bruno","Perrarina",4,"Pastor ingles");
        perro1.alimentarse();
        
        Animal caballo1 = new Caballo("Hourse","Aflecho",6,"Pura sangre");
        caballo1.alimentarse();
        
        Animal gato1 = new Gato("Minino","Leche",3,"Naranjoso");
        gato1.alimentarse();
    }
    
}
