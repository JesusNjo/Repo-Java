/*
. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O.
 */
package Ejerciciox12;

/**
 *
 * @author JesusNjo
 */
public class RS30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RS232 x = new RS232();
        
       
        x.rsO("&&&&&");
    }
    
}
