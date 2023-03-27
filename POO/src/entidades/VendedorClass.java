/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author JesusNjo
 */
public class VendedorClass {
    
    private String nombre;
    private int dni;
    private double sueldoBase;
    private double comisiones;
    private Date antiguedad;
    private double sueldoMensual;
    
    public VendedorClass(){
        
    }
    public VendedorClass(String nombre, int dni, double sueldoBase,double sueldoMensual, double comisiones, Date antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.sueldoMensual = sueldoMensual;
        this.comisiones = comisiones;
        
        this.antiguedad = antiguedad;
    }
    // Gets and Sets;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
    
    
    
}
