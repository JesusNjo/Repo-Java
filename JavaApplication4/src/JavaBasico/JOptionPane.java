/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;
//import java.util.Scanner;
/**
 *
 * @author JesusNjo
 */
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena = javax.swing.JOptionPane.showInputDialog("Ingrese su cadena");
       int entero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un entero"));
       boolean boleano = Boolean.parseBoolean(javax.swing.JOptionPane.showInputDialog("Boolean"));
       char caracter = javax.swing.JOptionPane.showInputDialog("Ingrese su caracter").toUpperCase().charAt(0);
       double decimal = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Ingrese su decimal"));
       
       
       //Mostrar en consoloa
       
        System.out.println(cadena);
        System.out.println(entero);
        System.out.println(boleano);
        System.out.println(caracter);
        System.out.println(decimal);
        
        
        //Mostrar en ventana
        
        javax.swing.JOptionPane.showMessageDialog(null, cadena);
        javax.swing.JOptionPane.showMessageDialog(null, entero);
        javax.swing.JOptionPane.showMessageDialog(null, boleano);
        javax.swing.JOptionPane.showMessageDialog(null, caracter);
        javax.swing.JOptionPane.showMessageDialog(null, decimal);
    }
    
}
