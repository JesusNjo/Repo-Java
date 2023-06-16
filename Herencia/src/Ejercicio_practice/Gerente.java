/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_practice;
import java.util.*;
/**
 *
 * @author JesusNjo
 */
public class Gerente extends Empleado {
    private int primaProf;
    private int bonificacion;

    public Gerente(int primaProf, int bonificacion, String nombre, int salario) {
        super(nombre, salario);
        this.primaProf = primaProf;
        this.bonificacion = bonificacion;
    }

    public Gerente() {
    }

    public int getPrimaProf() {
        return primaProf;
    }

    public void setPrimaProf(int primaProf) {
        this.primaProf = primaProf;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    @Override
    public int calcularSalario(){
        
        return salario+primaProf+bonificacion;
    }
    
    
}
