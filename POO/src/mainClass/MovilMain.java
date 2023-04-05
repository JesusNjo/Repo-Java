/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import JavaService.MovilService;
import entidades.MovilClass;
import java.util.Arrays;

/**
 *
 * @author JesusNjo
 */
public class MovilMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilService movil = new MovilService();
        MovilClass m1 = movil.cargarCelular();
        
        movil.ingresarCodigo(m1);
        System.out.println(m1.toString());
        System.out.println("Codigo del equipo:"+Arrays.toString(m1.getCodigo()));
        
    }
    
}
