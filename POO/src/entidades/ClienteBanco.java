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
public class ClienteBanco {
    
    private String nombre;
    private String id;
    private double saldo;

    public ClienteBanco(String nombre,String id,double saldo) {
        this.nombre= nombre;
        this.id = id;
        this.saldo = saldo;
        if(saldo>10){
            System.out.println("Bienvenido");
            
        }else{
            System.out.println("Debe ingresar al menos 10$");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
}
