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
public class VehiculoG {
    
    private String matricula;
    private String marca;
    private String modelo;

    public VehiculoG(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public VehiculoG() {
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarInf(){
        System.out.println("Marca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nMatricula: "+getMatricula());
    }
    
}
