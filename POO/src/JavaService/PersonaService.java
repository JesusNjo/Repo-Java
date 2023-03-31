/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package JavaService;

import entidades.PersonaClass;
import java.util.Scanner;

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
