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
public class VehiculoCarga extends VehiculoG {
    
    private int carga;

    public VehiculoCarga(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    
    
     @Override
    public void mostrarInf(){
        System.out.println("Marca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nMatricula: "+getMatricula()+
                "\nCarga: "+getCarga()+"Kg");
    }
}
