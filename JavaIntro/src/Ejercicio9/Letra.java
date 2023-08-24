/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
investigar la función Substring y equals() de Java
 */
package Ejercicio9;

/**
 *
 * @author JesusNjo
 */
public class Letra {
    
    
    public void letra(String letra){
        
        for (int i = 0; i <letra.length(); i++) {
            if(letra.charAt(i) == 'A' || letra.charAt(i) == 'a'){
                System.out.println("CORRECTO");
                break;
            }else{
                System.out.println("INCORRECTO");
                break;
            }
        }
        
    }
    
    
    public void letraS(String letraS){
        
        
        if("A".equalsIgnoreCase(letraS.substring(0,(0+1)))){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        for (int i = 0; i <letraS.length(); i++) {
            
            if("a".equalsIgnoreCase(letraS.substring(i, (i+1)))){
                System.out.println("CORRECTO");
                break;
            }else{
                System.out.println("INCORRECTO");
                break;
            }
            
            
        
        }
    }
    
   
    
}
