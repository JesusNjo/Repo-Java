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
public class Vendedor extends Empleado {

    private int comisiones;
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Vendedor(int comisiones, String nombre, int salario) {
        super(nombre, salario);
        this.comisiones = comisiones;
    }

    public Vendedor() {
    }

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    @Override
    public int calcularSalario() {

        return salario + comisiones;
    }

}
