/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

/**
 *
 * @author JesusNjo
 */
public class MainSimulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador sim = new Simulador();
        Alumno x = new Alumno();

        sim.crearSimulador(x);
        sim.crearSimuladorDni(x);
        sim.crearLista();
        sim.votacion(x);
    }

}
