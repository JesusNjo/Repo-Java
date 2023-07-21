/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

/**
 *
 * @author JesusNjo
 * 
 * Con esta funcion puedes crear un temporizador
 */
public class CrearTemporizador {

    private static void segundo(){
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){}        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
