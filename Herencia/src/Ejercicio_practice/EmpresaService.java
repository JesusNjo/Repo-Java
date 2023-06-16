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
public class EmpresaService {

    public void procedimientos() {
        Scanner input = new Scanner(System.in);

        int salarioBaseIngeniero = 1000;
        int salarioBaseVendedor = 800;
        int salarioBaseGerente = 1200;

        System.out.print("Salario base del ingeniero: " + salarioBaseIngeniero + "$\n");
        System.out.print("Salario base del vendedor: " + salarioBaseVendedor + "$\n");
        System.out.print("Salario base del gerente: " + salarioBaseGerente + "$\n\n");
        System.out.println("----------------");

        System.out.println("Ingrese el nombre del ingeniero:");
        String nombreIngeniero = input.nextLine();

        System.out.println("Ingrese la prima de profesión del ingeniero:");
        int primaDeProfesionIngeniero = input.nextInt();
        System.out.println("Ingrese las ganancias extras del ingeniero:");
        int gananciasExtrasIngeniero = input.nextInt();
        Ingeniero ing = new Ingeniero(primaDeProfesionIngeniero, gananciasExtrasIngeniero, nombreIngeniero, salarioBaseIngeniero);
        System.out.println("El salario del ingeniero es: " + ing.calcularSalario() + "$");

        System.out.println("Ingrese el nombre del vendedor:");
        input.nextLine();
        String nombreVendedor = input.nextLine();

        System.out.println("Ingrese las comisiones del vendedor:");
        int comisionesVendedor = input.nextInt();
        Vendedor vend = new Vendedor(comisionesVendedor, nombreVendedor, salarioBaseVendedor);
        System.out.println("El salario del vendedor es: " + vend.calcularSalario());

        System.out.println("Ingrese el nombre del gerente:");
        input.nextLine();
        String nombreGerente = input.nextLine();

        System.out.println("Ingrese la prima de profesión del gerente:");
        int primaProfGerente = input.nextInt();
        System.out.println("Ingrese la bonificación del gerente:");
        int bonificacionGerente = input.nextInt();
        Gerente gerent = new Gerente(primaProfGerente, bonificacionGerente, nombreGerente, salarioBaseGerente);
        System.out.println("El salario del gerente es: " + gerent.calcularSalario());
    }
}
