/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3_Raices;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RaicesService {

    public RaicesClass datos() {
        RaicesClass r = new RaicesClass();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el valor de a: ");
        r.setA(input.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        r.setB(input.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        r.setC(input.nextDouble());
        
        
        r.setDiscriminante(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());    //(b^2)-4*a*c
        return r;
    }
    public void obtenerRaices(RaicesClass o) {
        double x1 = (-o.getB() + Math.sqrt(o.getDiscriminante())) / (2 * o.getA());
        double x2 = (-o.getB() - Math.sqrt(o.getDiscriminante())) / (2 * o.getA());

        System.out.print("Solucion x1: ");
        System.out.println(x1);
        System.out.print("Solucion x2: ");
        System.out.println(x2);
    }

    public void obtenerRaiz(RaicesClass r) {

        double x = (-r.getB()) / (2 * r.getA());
        System.out.println("Unica solucion");
        System.out.println(x);
    }

    

    public boolean tieneRaices() {
        RaicesClass d = new RaicesClass();
        return d.getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        RaicesClass d = new RaicesClass();
        return d.getDiscriminante() == 0;

    }

    public void calcular(RaicesClass v) {

        if (tieneRaices()) {
            obtenerRaices(v);
        } else if (tieneRaiz()) {
            obtenerRaiz(v);
        } else {
            System.out.println("No tiene raiz/s");
        }

    }
}
