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
public class Mascota {
    
    private String nombre;
    private String apodo;
    private String pelaje;
    private String raza;
    private int edad;
    private int energia;
    
    public Mascota(String nombre,String apodo,String pelaje,String raza,int edad, int energia){
        this.nombre = nombre;
        this.apodo = apodo;
        this.pelaje = pelaje;
        this.raza = raza;
        this.edad = edad;
        this.energia = energia;

    }

//   Set o Setear;
    public void setNombre(String nombre){
        if(nombre.length()>0){
            
        this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
//   Get o Getter (Obtener);
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    public int getEnergia() {
        return energia;
    }
    
// Funciones
    public int pasear(int energiaV){
        
        energia -= energiaV;
        return energia;
        
    }
    public int pasearVueltas(int energiaV){
        for(int i = 0; i<energiaV;i++){
            
        }
        return energia;
    }
//  toString o Creación del retorno;

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", pelaje=" + pelaje + ", raza=" + raza + ", edad=" + edad + ", energia=" + energia + '}';
    }

    
    
    
    
}
