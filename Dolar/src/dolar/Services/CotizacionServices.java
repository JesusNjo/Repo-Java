/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar.Services;

import dolar.Entities.Cotizacion;
import dolar.Persistence.CotizacionDAO;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CotizacionServices {
    Cotizacion cotizacion = new Cotizacion();
    CotizacionDAO cotizacionJpa = new CotizacionDAO();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void mostrarCotizaciones(){
        try {
            System.out.println("Indique el ID de la cotización");
        Long id = input.nextLong();
        cotizacionJpa.lookForId(id);
        System.out.println("--Datos requeridos: ");
        System.out.println(cotizacion.toString());
        } catch (Exception e) {
            throw e;
        }
    }
    public void mostrarTodas(){
        try {
             System.out.println("Lista de cotizaciones: ");
             List<Cotizacion> cotizaciones = cotizacionJpa.lookForAll();
             
             for (Cotizacion cotizacione : cotizaciones) {
                 System.out.println(cotizacione);
            }
        } catch (Exception e) {
        }
    }
    
    public void createCotizacion(){
        try {
            System.out.println("Ingrese los siguientes datos para crear una cotización...");
            System.out.println("Ingrese el tipo de cambio");
            cotizacion.setTipoCambio(input.next());
            System.out.println("Ingrese el tipo de valor");
            cotizacion.setTipoValor(input.nextDouble());
            System.out.println("Ingrese la fecha de registro MM/DD/AAAA");
            String fecha = input.next() + "/"+input.next() + "/"+input.next();
            cotizacion.setFechaRegistro(new Date(fecha));
            
            cotizacionJpa.createCo(cotizacion);
            
        } catch (Exception e) {
        }
    }
}
