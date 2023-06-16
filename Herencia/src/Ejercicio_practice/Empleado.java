/*
Crea una jerarquía de clases para representar una empresa. Comienza con una clase base Empleado 
que tenga propiedades y métodos comunes para todos los empleados, como nombre, salario y calcularSalario(). 
Luego crea subclases para tipos específicos de empleados, como Gerente, Vendedor y Ingeniero, 
que hereden de la clase Empleado y tengan sus propias propiedades y métodos únicos.
 */
package Ejercicio_practice;

/**
 *
 * @author JesusNjo
 */
public class Empleado {
    protected String nombre;
    protected int salario;
    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public int calcularSalario(){
       
        return salario;
    }

    
    
    
}
