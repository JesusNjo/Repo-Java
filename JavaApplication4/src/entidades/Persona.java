/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author JesusNjo
 */
public class Persona {
    
    public String nombre;
    public boolean IsDeveloper;  
    public int edad;

    public Persona(String nombre, boolean IsDeveloper, int edad) {
        this.nombre = nombre;
        this.IsDeveloper = IsDeveloper;
        this.edad = edad;
        
    }
        Persona nombreObjeto = new Persona("Pedro",true,26);
}
