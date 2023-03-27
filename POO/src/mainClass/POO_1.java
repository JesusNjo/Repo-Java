/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package mainClass;

import entidades.Mascota;
import java.util.Date;

/**
 *
 * @author JesusNjo
 */
public class POO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota p1 = new Mascota("Tommy", "Amigo","Rojizo","Golden", 8,1000);
//        p1.apodo = "Amiguito";
//        p1.edad = 8;
//        p1.pelaje = "Rojiso";
//        p1.raza = "Golden Retriver";
//        
//        System.out.println(p1.apodo);
        p1.setNombre("Tom");
        p1.setApodo("Panita");
        p1.setPelaje("Rojizo");
        p1.setRaza("Golden");
        p1.setEdad(8);
        p1.pasearVueltas(2);
        System.out.println(p1);
        
        Date fecha = new Date();
        System.out.println(fecha);
    }
    
}
