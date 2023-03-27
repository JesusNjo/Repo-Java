/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaService;

import entidades.VendedorClass;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class VendedorService {
     Scanner input = new Scanner(System.in);

    
    public VendedorClass altaVendedor(){
        
        //Llamando al constructor vacio;
        
       //Instanciar un objeto vendedor
        VendedorClass v1 = new VendedorClass();
        
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(input.nextLine());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(input.nextInt());
        System.out.println("Ingrese el sueldo basico");
        v1.setSueldoBase(input.nextDouble());
        System.out.println("Ingrese el dia que ingreso a trabajar");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes que ingreso a trabajar");
        int mes = input.nextInt();
        System.out.println("Ingrese el año que ingreso a trabajar");
        int anio = input.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        v1.setAntiguedad(fecha);
        
        
        
        return v1;
    }
    public void Sueldo(VendedorClass v1){
        
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        double ventas = input.nextDouble();
        v1.setComisiones(ventas*1.15);
        v1.setSueldoMensual(v1.getSueldoBase() + v1.getComisiones());
        System.out.println("Vendedor : "+
        v1.getNombre() + " C.I: "+v1.getDni() + " neto a comprar este mes: "+v1.getSueldoMensual());
        
        
    }
    public void Vacaciones(VendedorClass v1){
        Date hoy = new Date();
        double antiguedad = hoy.getYear() - v1.getAntiguedad().getYear();
        
        if(antiguedad<5){
            System.out.println("Le corresponde 14 días de vacaciones");
        }else if(antiguedad<10){
            System.out.println("Le corresponde 21 días de vacaciones");

        }
        else if(antiguedad<20){
            System.out.println("Le corresponde 28 días de vacaciones");

        }else if(antiguedad>20){
            System.out.println("Le corresponde 35 días de vacaciones");

        }else{
            System.out.println("Vaciones proporcionadas");
        }
    }
}
