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
public class VehiculoCarrera extends VehiculoG {
    
    private int cilindraje;

    public VehiculoCarrera(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    
    
   
    @Override
    public void mostrarInf(){
        System.out.println("Marca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nMatricula: "+getMatricula()+
                "\nCilindraje: "+getCilindraje()+" caballos de fuerza");
    }
    
}
