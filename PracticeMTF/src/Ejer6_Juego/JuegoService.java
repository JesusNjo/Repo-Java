/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer6_Juego;

import Ejer6_Juego.JuegoClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class JuegoService {
    
    
    public void crearJuego(JuegoClass juego){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad la palabra");
        String[] vec = new String[5];
        juego.setBuscar(vec);
        
        
        
    }
}
