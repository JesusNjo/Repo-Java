/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.services;

import Estancias.entidades.Casas;
import Estancias.entidades.Estancias;
import Estancias.persistencia.DAOSentencias;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ServiceProductivo {
    DAOSentencias sente= new DAOSentencias();
    Estancias estancia = null;
    
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    
    
    public void menu() throws Exception{
    ArrayList<String> lista = new ArrayList();
        int op = 0;
        
        do {            
            System.out.println("\n-----Ingrese una opción del menú-----");  
            System.out.println("1:Familias con más de 3 hijos\n2:Casas disp entre (1 agosto y 31 agosto 2020) Reino unido"
            +"\n3:Familias hotmail\n4:Disponibilidad por fecha y dia\n5:Datos de todos los clientes con alojamientos"
            +"\n6:Datos de estancias(Clientes y casas)\n7:Aumento de 5% en Reino Unido\n8: Cantidad y Pais de casas"
                    + "\n9:Comentario Reino Unido casa limpia\n10:Agregar nueva estancia\n0:Salir");
            op = input.nextInt();
            switch(op){
                case 1:
                    sente.familiasMasTresH(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
                    
                case 2: sente.casasDispFecha(lista);
                    for (String string : lista) {
                        System.out.println(string);
                        
                    }
                    break;
                    
                case 3: sente.familiasHotmail(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Indique la fecha que desea consultar: A-M-D");
                    String anio = input.next();
                    String mes = input.next();
                    String dia = input.next();
                    
                    String fecha =anio+"-"+mes+"-"+dia;
                    
                    System.out.println(fecha);
                    System.out.println("Indique los dias de disponibilidad");
                    String dias = input.next();
                    
                    sente.fechaYnumD(lista, fecha, dias);
                    
                    for (String string : lista) {
                        System.out.println(string);
                    }
                  break;  
              
                case 5:
                    sente.listaClientesAlojados(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                   break;
                   
                case 6:
                  
                    sente.listarInfoClienteYCasa(lista);
                    for (String string : lista) {
                        System.out.println(string);
                       
                    }
                    break;
                case 7:
                    sente.preciosActualizados(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
                    
                case 8:
                    sente.listaDeCasas(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
                    
                case 9:
                    sente.casaLimpiaRU(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
                    
                case 10:
                    estancia = new Estancias();
                    System.out.println("Indique ID de estancia >=9");
                    estancia.setId_estancia(input.nextInt());
                    System.out.println("Identifique con su ID cliente");
                    estancia.setId_cliente(input.nextInt());
                    System.out.println("Identifique el ID de la casa");
                    estancia.setId_casa(input.nextInt());
                    System.out.println("Indique su nombre");
                    estancia.setNombre_huesped(input.next());
                    
                    System.out.println("Indique la fecha de entrada A-M-D");
                    String aniox = input.next();
                    String mesx = input.next();
                    String diax = input.next();
                 
                    estancia.setFecha_desde(aniox+"-"+mesx+"-"+diax);
                    System.out.println("Indique la fecha de salida A-M-D");
                    String anioxx = input.next();
                    String mesxx = input.next();
                    String diaxx = input.next();
                 
                    estancia.setFecha_hasta(anioxx+"-"+mesxx+"-"+diaxx);
                    
                    sente.agregarEstancia(estancia);
                    System.out.println("Estancia registrada exitosamente!");
                    break;
                    
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción invalida");
                    
            }
        } while (op != 0);
    }
}

