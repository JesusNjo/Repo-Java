/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author JesusNjo
 */
public class Herencia2Class extends HerenciaClass {
    
    private int codigoEstudiante;
    private double notaFinal;

    
    //Constructor;
    public Herencia2Class(int codigoEstudiante, double notaFinal, String nombreEstudiante, String apellidoEstudiante, int edad) {
        super(nombreEstudiante, apellidoEstudiante, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombreEstudiante()+"\nApellido: "+getApellidoEstudiante()+"\nEdad: "+getEdad()
        +"\nCodigo estudiante: "+codigoEstudiante + "\nNota final: "+notaFinal);
    }
    
    
    
    
}
