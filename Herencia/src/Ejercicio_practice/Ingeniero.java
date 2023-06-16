/*
Crea una jerarquía de clases para representar una empresa. Comienza con una clase base Empleado 
que tenga propiedades y métodos comunes para todos los empleados, como nombre, salario y calcularSalario(). 
Luego crea subclases para tipos específicos de empleados, como Gerente, Vendedor y Ingeniero, 
que hereden de la clase Empleado y tengan sus propias propiedades y métodos únicos.
 */
package Ejercicio_practice;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Ingeniero extends Empleado {

    private int primaDeProfesion;
    private int ganaciasExtras;

    public Ingeniero(int primaDeProfesion, int ganaciasExtras, String nombre, int salario) {
        super(nombre, salario);
        this.primaDeProfesion = primaDeProfesion;
        this.ganaciasExtras = ganaciasExtras;
    }

    public Ingeniero() {
    }

    public int getPrimaDeProfesion() {
        return primaDeProfesion;
    }

    public void setPrimaDeProfesion(int primaDeProfesion) {
        this.primaDeProfesion = primaDeProfesion;
    }

    public int getGanaciasExtras() {
        return ganaciasExtras;
    }

    public void setGanaciasExtras(int ganaciasExtras) {
        this.ganaciasExtras = ganaciasExtras;
    }

    @Override
    public int calcularSalario() {

        return salario + primaDeProfesion + ganaciasExtras;
    }

   

}
