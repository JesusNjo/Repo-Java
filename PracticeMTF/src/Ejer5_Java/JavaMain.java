/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer5_Java;

/**
 *
 * @author JesusNjo
 */
public class JavaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaService mes = new JavaService();
        JavaClass n = mes.crearMes();
        
        mes.mesSecreto(n);
    }
    
}
