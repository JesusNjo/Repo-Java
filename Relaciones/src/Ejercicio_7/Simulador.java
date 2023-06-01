/*

• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.


• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
package Ejercicio_7;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Simulador {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    ArrayList<Alumno> alumnos = new ArrayList();
    List<Alumno> dniA = new ArrayList();
    ArrayList<Alumno> complet = new ArrayList();
    int cant = 0;

    public ArrayList<Alumno> crearSimulador(Alumno s) {
        System.out.println("Ingrese la cantidad de alumnos");
        cant = input.nextInt();

        String[] nombres = {"Fabian", "Oriana", "Daniela", "Hector", "Adonis"};
        String[] apellidos = {"Candamil", "Gonzalez", "Navas", "Naranjo", "Hernandez"};

        for (int i = 0; i < cant; i++) {
            int ran = (int) (Math.random() * 4) + 1;
            int ran2 = (int) (Math.random() * 4) + 1;

            s = new Alumno();
            s.setNombreCOmpleto(nombres[ran] + " " + apellidos[ran2]);

            alumnos.add(s);
        }

        return alumnos;
    }

    public List<Alumno> crearSimuladorDni(Alumno d) {

        for (int i = 0; i < cant; i++) {
            long ran = (long) (Math.random() * 20000000) + 1;
            d = new Alumno();
            d.setDni(ran);

            dniA.add(d);
        }
        return dniA;
    }

    public ArrayList<Alumno> crearLista() {
       
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno1 = new Alumno(alumnos.get(i).getNombreCOmpleto(), dniA.get(i).getDni(), 0);
//           

            complet.add(alumno1);
        }

        return complet;
    }

    public void votacion(Alumno ad) {
        Votos votaciones = new Votos();
        System.out.println("Lista de alumnos :");
        ArrayList<Alumno> voto = new ArrayList();
        
        
        System.out.println("Indique el nombre del alumno que desea votar...");
        complet.forEach((x)->System.out.println(x.toString()));
        for (int i = 0; i <complet.size(); i++) {
            //System.out.println(complet.get(i).toString());
            String name= input.next();
            
            
            for (int j = 0; j <complet.size(); j++) {
                
            if(complet.get(j).getNombreCOmpleto().equalsIgnoreCase(name)){
                int cont =0;
                complet.get(j).setCantV(++cont);
                ad = new Alumno(complet.get(j).getNombreCOmpleto(),complet.get(j).getDni(),complet.get(j).getCantV());
                voto.add(ad);
                
                votaciones.setAlumno(ad);
            }
            }
        }
            voto.forEach((d)->System.out.println(d.toString())) ;
    }
}
