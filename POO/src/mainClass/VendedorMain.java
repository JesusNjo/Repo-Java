/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import JavaService.VendedorService;
import entidades.VendedorClass;

/**
 *
 * @author JesusNjo
 */
public class VendedorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VendedorService vs = new VendedorService();
        VendedorClass v1 = vs.altaVendedor();
        vs.Sueldo(v1);
        vs.Vacaciones(v1);
        
        
    }
    
}
