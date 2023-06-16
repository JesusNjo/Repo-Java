/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package Ejercicio_1;
import java.util.*;
/**
 *
 * @author JesusNjo
 */
public class PersonaService {

    Scanner input = new Scanner(System.in);

    public PersonaClass crearPersona() {
        PersonaClass p1 = new PersonaClass();

        System.out.println("Ingrese su nombre");
        p1.setNombre(input.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(input.nextInt());
        System.out.println("Ingrese su sexo");
        p1.setSexo(input.next().toUpperCase().charAt(0));

        while (p1.getSexo() != 'H' && p1.getSexo() != 'M' && p1.getSexo() != 'O') {
            System.out.println("ERROR. Vuelva a ingresar su sexo(H - Hombre // M - Mujer // O - Otro): ");
            p1.setSexo(input.next().toUpperCase().charAt(0));
        }
        System.out.println("Ingrese su peso");
        p1.setPeso(input.nextDouble());
        System.out.println("Ingrese su altura");
        p1.setAltura(input.nextDouble());
        return p1;
    }

    public double calcularIMC(PersonaClass c) {

        double imc = c.getPeso() / Math.pow(c.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {

            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(PersonaClass e) {

        if(e.getEdad()>=18){
            return true;
        }else{
            return false;
        }

    }
}