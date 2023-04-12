/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author JesusNjo
 */
public class ProductosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductosService prod = new ProductosService();
        Productos p1 = prod.almacenarComidaS();
        
        
       prod.calcularElPrecio(p1);
    }
    
}
