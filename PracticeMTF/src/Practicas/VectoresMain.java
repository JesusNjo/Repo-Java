/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;
import java.util.Arrays;
/**
 *
 * @author JesusNjo
 */
public class VectoresMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VectoresService n = new VectoresService();
       VectoresClass n1 = n.crearVector();
       
        
        n.ordenarVector(n1);
    }
    
}
