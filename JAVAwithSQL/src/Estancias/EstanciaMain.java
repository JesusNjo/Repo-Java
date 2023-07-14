/*

 */
package Estancias;

import Estancias.services.ServiceProductivo;

/**
 *
 * @author JesusNjo
 */
public class EstanciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ServiceProductivo x = new ServiceProductivo();
        
        
        x.menu();
        
    }
    
}
