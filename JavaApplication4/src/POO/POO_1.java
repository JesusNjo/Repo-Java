/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import entidades.Mascota;

/**
 *
 * @author JesusNjo
 */
public class POO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota p1 = new Mascota("Tommy", "Amigo","Rojizo","Golden", 8,1000);
//        p1.apodo = "Amiguito";
//        p1.edad = 8;
//        p1.pelaje = "Rojiso";
//        p1.raza = "Golden Retriver";
//        
//        System.out.println(p1.apodo);
        p1.setNombre("Tom");
        p1.setApodo("Panita");
        p1.setPelaje("Rojizo");
        p1.setRaza("Golden");
        p1.setEdad(8);
        p1.pasearVueltas(2);
        System.out.println(p1);
        
        
    }
    
}
