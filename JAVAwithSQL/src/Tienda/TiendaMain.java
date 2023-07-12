/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Tienda.Service.FabricanteService;
import Tienda.Service.ProductoService;

/**
 *
 * @author JesusNjo
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FabricanteService x = new FabricanteService();
        ProductoService y = new ProductoService();
        
        y.menu();
        
    }
    
}
