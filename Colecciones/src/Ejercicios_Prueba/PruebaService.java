/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Ejercicios_Prueba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PruebaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<PruebaClass> crearAlumno() {
        PruebaClass o = new PruebaClass();
        ArrayList<PruebaClass> alum = new ArrayList();
        int op = 0;

        do {
            System.out.println("  Menú\n1: Agregar nuevo alumno\n2:Salir");
            op = input.nextInt();

            switch (op) {
                case 1:
                    List<Integer> notas = new ArrayList();
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nAlum = input.next();
                    o.setNombre(nAlum);
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Agrege la nota " + (i + 1) + " de " + o.getNombre());
                        notas.add(input.nextInt());

                    }
                    alum.add(new PruebaClass(nAlum, notas));
                    o.setNotas(notas);
                    break;
                case 2:
                    System.out.println("Salio del sistema, Adios");
                    break;
                default:
                    System.out.println("Opción no valida....");
            }
            
        } while (op != 2);
        System.out.println("Alumnos: ");
        alum.forEach((x) -> System.out.println(x.getNombre() + " " + x.getNotas()));
        
        
        
        return alum;
    }
    
    
    public double notaFinal(ArrayList<PruebaClass> nf){
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String nombreB= input.next();
        double suma = 0;
        Iterator<PruebaClass> it = nf.iterator();
        
        while(it.hasNext()){
            PruebaClass aux = it.next();

            
            if(aux.getNombre().equals(nombreB)){
                
                for (int x = 0; x < 3; x++) {
                
                suma+= aux.getNotas().get(x);
                }
            }
                
        }
        
        
        
        
        
        return suma/3;
    }
}
