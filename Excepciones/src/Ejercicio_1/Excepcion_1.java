/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package Ejercicio_1;

/**
 *
 * @author JesusNjo
 */
public class Excepcion_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaClass persona = null;
       PersonaService persona1 = new PersonaService();
       try{
           boolean esMayor = persona1.esMayorDeEdad(persona);
           System.out.println("Bienvenido");
       }catch(NullPointerException e){
           System.out.println("ERROR");
           System.out.println(e.toString());
       }
        
    }
    
}
