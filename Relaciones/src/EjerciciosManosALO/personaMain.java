/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosManosALO;

/**
         *
         * @author JesusNjo
         */


public class personaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dni n = new dni('V', 21156294);

        persona p = new persona("Francisco", "Naranjo", n);
        
        System.out.println(p.toString());

    }

}
