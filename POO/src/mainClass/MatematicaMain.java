/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package mainClass;

import JavaService.MatematicaService;
import entidades.MatematicaClass;

/**
 *
 * @author JesusNjo
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaService n = new MatematicaService();
        MatematicaClass n1 = new MatematicaClass();
        
        n1.setNum1 (Math.random()*10);
        n1.setNum2(Math.random()*10);
        
        System.out.println("Devolver los valores");
        System.out.println(n.devolverMayor(n1));
        System.out.println();
        System.out.println();
        System.out.println("Calcular la potencia de los valores");
        System.out.println(n.calcularPotencia(n1));
        System.out.println();
        System.out.println();
        System.out.println("Devolver la raiz del mas bajo");
        System.out.println(n.calculaRaiz(n1));
    }
    
}
