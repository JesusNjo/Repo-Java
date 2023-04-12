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
public class VehiculoTurismo extends VehiculoG {
    
    private int puertas;

    public VehiculoTurismo(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
     @Override
    public void mostrarInf(){
        System.out.println("Marca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nMatricula: "+getMatricula()+
                "\nPuertas: "+getPuertas());
    }
}
