/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author JesusNjo
 */
public class VehiculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VehiculoG v = new VehiculoG("AXGCX26", "Hundai", "500ac");
        VehiculoCarrera vC = new VehiculoCarrera(12, "F5848S", "Ferrari", "Enzo 45");
        VehiculoCarga vdC = new VehiculoCarga(500, "AS525X", "Volkswagen", "Furgo12");
        VehiculoTurismo vT = new VehiculoTurismo(4, "56s84s5", "Tukipon", "JampX4");

        System.out.println("   ----VEHICULO GENERAL----    \n");
        
        v.mostrarInf();
        System.out.println();

        System.out.println("   ----VEHICULO DE CARRERA----    \n");

        vC.mostrarInf();
        System.out.println();

        System.out.println("   ----VEHICULO DE CARGA----    \n");

        vdC.mostrarInf();
        System.out.println();

        System.out.println("   ----VEHICULO DE TURISMO----    \n");

        vT.mostrarInf();
        System.out.println();
    }

}
