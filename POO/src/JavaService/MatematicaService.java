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
package JavaService;

import entidades.MatematicaClass;

/**
 *
 * @author JesusNjo
 */
public class MatematicaService {

    MatematicaClass num = new MatematicaClass();

    public double devolverMayor(MatematicaClass n) {

        if (n.getNum1() > n.getNum2()) {
            System.out.println(n.getNum1());
            System.out.println(n.getNum2());

            System.out.println("---------------------------");
            return n.getNum1();
        }
        if (n.getNum2() > n.getNum1()) {
            System.out.println(n.getNum2());
            System.out.println(n.getNum1());

            System.out.println("---------------------------");
            return n.getNum2();
        } else {
            return n.getNum1();
        }
    }

    public double calcularPotencia(MatematicaClass p) {

        p.setNum1(Math.round(p.getNum1()));
        p.setNum2(Math.round(p.getNum2()));
        
        
        if (p.getNum1() > p.getNum2()) {
            System.out.println(p.getNum1());
            System.out.println(p.getNum2());
            return Math.pow(p.getNum1(),p.getNum2());

        } else {
            System.out.println(p.getNum2());
            System.out.println(p.getNum1());
            return Math.pow(p.getNum2(),p.getNum1());
        }
    }

    public double calculaRaiz(MatematicaClass r) {

            if(r.getNum1()>r.getNum2()){
                
                return Math.sqrt(r.getNum1());
            }else{
                
            return Math.sqrt(r.getNum1());
            }
        }
    }

