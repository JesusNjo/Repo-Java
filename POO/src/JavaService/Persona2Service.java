/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package JavaService;

import entidades.Persona2Class;
import java.util.Date;
import java.util.Scanner;

public class Persona2Service {

    Persona2Class p = new Persona2Class();

    Scanner input = new Scanner(System.in);

    public Persona2Class crearPersona() {
        System.out.println("Ingrese su nombre");
        p.setNombre(input.nextLine());
        System.out.println("Ingrese su fecha de nacimiento (DD/MM/YYYY)");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();
        Date fechaN = new Date(anio - 1900, mes - 1, dia);

        p.setFechaDeNacimiento(fechaN);
        return p;

    }

    public int calcularEdad(Persona2Class c) {

        Date hoy = new Date();
        int edad = (hoy.getYear() - c.getFechaDeNacimiento().getYear());

        return edad;
    }

    public boolean menorQue(Persona2Class e) {

        System.out.println("Que edad tiene la nueva persona");
        int edad = input.nextInt();
        
        System.out.print("¿La nueva persona es menor "+e.getNombre()+"? ");
        return calcularEdad(e) > edad;
    }
    
    public String mostrarPersona(Persona2Class p){
        
        return p.toString();
    }
}
