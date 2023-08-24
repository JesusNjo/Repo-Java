/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JesusNjo
 */
public class MainIngles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainIngles x = new MainIngles();
        PruebasTec xd = new PruebasTec();

        
        xd.contadorNumeros("ASDASDAS1ASASD2ASDA1");
    }
    
    public int caracter(char x){
       
        switch(x){
            case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
        }
    }
    
    public int esAsi(String Calembre){
        int result = 0;
        
        for (int i = 0; i <Calembre.length(); i++) {
            int value = caracter(Calembre.charAt(i));
            
            if(i<Calembre.length()-1&& value < caracter(Calembre.charAt(i +1))){
                result -= value;
            }else{
                result+=value;
            }
        }
        return result;
    }
    
    
}
