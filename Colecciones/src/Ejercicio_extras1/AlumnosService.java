/*
Ejercicio1 (utilizar ArrayList)
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y 
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
Necesidades:
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los 
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , 
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
apellido de forma ascendente. 
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
nombre de forma descendente. 
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo 
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas, 
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA.
 */
package Ejercicio_extras1;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class AlumnosService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    int contV = 0;
    int contA = 0;
    int contC = 0;

    public List<AlumnosClass> crearAlumnos() {
        List<AlumnosClass> list = new ArrayList();

        System.out.println("----------Alumnos ingresados----------");

        Calendar n = Calendar.getInstance();

        n.set(1994, Calendar.JANUARY, 4);
        list.add(new AlumnosClass("Francisco", "Naranjo", "Venezolana", n));
        n.set(1995, Calendar.FEBRUARY, 4);
        list.add(new AlumnosClass("Jesus", "Noguera", "Argentina", n));
        n.set(1995, Calendar.FEBRUARY, 4);
        list.add(new AlumnosClass("Pipe", "Pascal", "Chilena", n));
        n.set(2000, Calendar.FEBRUARY, 6);
        list.add(new AlumnosClass("Leonardo", "Li Caprio", "Venezolana", n));
        n.set(1992, Calendar.MARCH, 16);
        list.add(new AlumnosClass("Arturo", "Vidal", "Chilena", n));
        n.set(2000, Calendar.FEBRUARY, 6);
        list.add(new AlumnosClass("Juan", "Arango", "Venezolana", n));
        n.set(1986, Calendar.JULY, 10);
        list.add(new AlumnosClass("Leonel", "Messi", "Argentina", n));
        n.set(1984, Calendar.FEBRUARY, 12);
        list.add(new AlumnosClass("Wilfrido", "Vargas", "Venezolana", n));
        n.set(1996, Calendar.OCTOBER, 14);
        list.add(new AlumnosClass("Pedro", "Escobar", "Chilena", n));
        n.set(2005, Calendar.DECEMBER, 25);
        list.add(new AlumnosClass("Rafael", "Galicia", "Argentina", n));
        n.set(2008, Calendar.NOVEMBER, 4);
        list.add(new AlumnosClass("Quentin", "Tarantino", "Venezolana", n));
        n.set(1984, Calendar.MAY, 6);
        list.add(new AlumnosClass("Ernesto", "Lopez", "Venezolana", n));
        n.set(1999, Calendar.APRIL, 24);
        list.add(new AlumnosClass("Librado", "Julio", "Chilena", n));
        n.set(1995, Calendar.JULY, 17);
        list.add(new AlumnosClass("Edgar", "Carbo", "Argentina", n));
        n.set(2010, Calendar.JANUARY, 31);
        list.add(new AlumnosClass("Lito", "Hernandez", "Chilena", n));
        n.set(2014, Calendar.AUGUST, 29);
        list.add(new AlumnosClass("Leopoldo", "Perez", "Argentina", n));
        n.set(1984, Calendar.SEPTEMBER, 10);
        list.add(new AlumnosClass("Hugo", "Lhavez", "Venezolana", n));
        n.set(1977, Calendar.DECEMBER, 12);
        list.add(new AlumnosClass("Uni", "Macri", "Argentina", n));
        n.set(2001, Calendar.SEPTEMBER, 15);
        list.add(new AlumnosClass("Ibai", "Llanos", "Venezolana", n));
        n.set(2004, Calendar.APRIL, 26);
        list.add(new AlumnosClass("Julian", "Rodriguez", "Chilena", n));
        n.set(2008, Calendar.JANUARY, 17);

        String op = null;
        System.out.println("¿Desea agregar un alumno nuevo? S/N");
        op = input.next();
        if ("s".equalsIgnoreCase(op)) {

            alta(list, new AlumnosClass());
        }
       
        System.out.println("¿Desea elimar un alumno nuevo? S/N");
        op = input.next();
        if ("s".equalsIgnoreCase(op)) {
            baja(list, new AlumnosClass());
        }
        System.out.println("¿Desea modificar un alumno nuevo? S/N");
        op = input.next();
        if ("s".equalsIgnoreCase(op)) {
            modificacion(list, new AlumnosClass());
        }

        mostrarDes(list);
        System.out.println("\n---------------------");
        mostrarAs(list);
        System.out.println("\n---------------------");
        mostrarEd(list);
        System.out.println("\n---------------------");
        nacionalidad(list);
        System.out.println("\n---------------------");
        reporteFinal(list);

        return list;
    }

    public void alta(List<AlumnosClass> lista, AlumnosClass nuevoA) {
        System.out.println("--Ingrese los datos del nuevo alumno--");
        Calendar n = Calendar.getInstance();
        System.out.print("Ingrese el nombre del nuevo alumno: ");
        String nombre = input.next();
        System.out.print("Ingrese el apellido del nuevo alumno: ");
        String apellido = input.next();
        System.out.println("Indique su nacionalidad:\n 1: Venezolano, \n2: Argentino, \n3:Chileno");
                String datoNa= null;
                int op = input.nextInt();
                switch(op){
                    case 1: datoNa = "Venezolana";break;
                    case 2: datoNa= "Argentina";break;
                    case 3: datoNa= "Chilena";break;
                }
        
        System.out.println("Ingrese su fecha de nacimiento: YYYY/MM/DD");
        n.set(input.nextInt(), input.nextInt(), input.nextInt() - 1);

        nuevoA = new AlumnosClass(nombre, apellido, datoNa, n);
        lista.add(nuevoA);
    }

    public void baja(List<AlumnosClass> lista, AlumnosClass alumno) {
        System.out.println("Ingrese el nombre del alumno que desea eliminar");
        String nombre = input.next();
        boolean it = true;
        for (int i = 0; i < lista.size(); i++) {
            if (nombre.equalsIgnoreCase(lista.get(i).getNombre())) {

                lista.remove(lista.remove(i));
                System.out.println("Estudiante eliminado :)");
                it = false;
            }
        }
        if (it) {
            System.out.println("Estudiante no encontrado...");
        }

    }

    public void modificacion(List<AlumnosClass> lista, AlumnosClass alumnoNuevo) {
        //NOTA: Queda así por ahora pero hay que hacerle modificaciones!!!!!!!
        System.out.println("Indique el nombre del alumno que desea moficicar: ");
        String nombre = input.next();
 Calendar n = Calendar.getInstance();
        for (int i = 0; i < lista.size(); i++) {
            if (nombre.equalsIgnoreCase(lista.get(i).getNombre())) {
                lista.remove(i);
                
                System.out.println("Usuario encontrado....");
                System.out.println("Porfavor, indique los nuevos datos del usuario");

                System.out.print("Nombre: ");
                String datoN = input.next();
                System.out.print("Apellido: ");
                String datoA = input.next();
                System.out.print("Nacionalidad: ");
                System.out.println("Indique su nacionalidad:\n 1: Venezolano, \n2: Argentino, \n3:Chileno");
                String datoNa= null;
                int op = input.nextInt();
                switch(op){
                    case 1: datoNa = "Venezolana";break;
                    case 2: datoNa= "Argentina";break;
                    case 3: datoNa= "Chilena";break;
                }
                System.out.println("Ingrese su fecha de nacimiento: YYYY/MM/DD");
                n.set(input.nextInt(), input.nextInt(), input.nextInt() - 1);

        alumnoNuevo = new AlumnosClass(datoN, datoA, datoNa, n);
                System.out.println("Alumno modificado :)");
        break;
            }
        }
        lista.add(alumnoNuevo);
        

    }

    public void mostrarAs(List<AlumnosClass> list) {
        Collections.sort(list, ordenarN);
        System.out.println("Orden acendente por nombre");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getNombre() + " " + list.get(i).getApellido() + " -"
                    + list.get(i).getNacionalidad() + " ["
                    + (list.get(i).getFechaN().getTime().getYear() + 1900) + "/"
                    + (list.get(i).getFechaN().getTime().getMonth() + 1) + "/"
                    + list.get(i).getFechaN().getTime().getDate() + "]");

        }
    }

    public void mostrarDes(List<AlumnosClass> list) {
        System.out.println("");
        System.out.println("Orden decendente por apellido");
        Collections.sort(list, ordenarA.reversed());
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getNombre() + " " + list.get(i).getApellido() + " -"
                    + list.get(i).getNacionalidad() + " ["
                    + (list.get(i).getFechaN().getTime().getYear() + 1900) + "/"
                    + (list.get(i).getFechaN().getTime().getMonth() + 1) + "/"
                    + list.get(i).getFechaN().getTime().getDate() + "]");

        }
    }

    public void mostrarEd(List<AlumnosClass> mostrar) {
        System.out.println("\nIngrese el nombre del alumno que desea saber la edad");
        String nombre = input.next();
        boolean conf = true;
        Calendar fechaActual = Calendar.getInstance();

        int anio = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) + 1;

        for (int i = 0; i < mostrar.size(); i++) {

            if (nombre.equalsIgnoreCase(mostrar.get(i).getNombre())) {
                int fec = mostrar.get(i).getFechaN().get(Calendar.YEAR);
                int mesB = mostrar.get(i).getFechaN().get(Calendar.MONTH);
                int edad = anio - fec;
                conf = false;
                if (mes < mesB) {
                    edad--;
                }
                System.out.println(nombre + " tiene: " + edad);
            }
        }
        if (conf) {
            System.out.println("Usuario no encontrado.....");
        }
    }

    public void nacionalidad(List<AlumnosClass> naci) {

        System.out.println("\nVenezolanos: ");
        System.out.println("****");
        for (int i = 0; i < naci.size(); i++) {

            if ("venezolana".equalsIgnoreCase(naci.get(i).getNacionalidad())) {
                System.out.println("[" + naci.get(i).getNombre() + " " + naci.get(i).getApellido() + "]");
                contV++;
            }
        }

        System.out.println("\nChilenos: ");
        System.out.println("****");
        for (int i = 0; i < naci.size(); i++) {
            if ("chilena".equalsIgnoreCase(naci.get(i).getNacionalidad())) {
                System.out.println("[" + naci.get(i).getNombre() + " " + naci.get(i).getApellido() + "]");
                contC++;
            }
        }
        System.out.println("\nArgentinos: ");
        System.out.println("****");
        for (int i = 0; i < naci.size(); i++) {
            if ("argentina".equalsIgnoreCase(naci.get(i).getNacionalidad())) {
                System.out.println("[" + naci.get(i).getNombre() + " " + naci.get(i).getApellido() + "]");
                contA++;
            }
        }

    }

    public void reporteFinal(List<AlumnosClass> reporte) {
        System.out.println("\n-----Reporte Final-----");
        int contP = 0;
        int contL = 0;
        Calendar fechaActual = Calendar.getInstance();
        System.out.println("\nMayores de 25");
        int anio = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) + 1;
        for (int i = 0; i < reporte.size(); i++) {

            if (anio - reporte.get(i).getFechaN().getTime().getYear() > 25) {
                int fec = reporte.get(i).getFechaN().get(Calendar.YEAR);
                int mesB = reporte.get(i).getFechaN().get(Calendar.MONTH);
                int edad = anio - fec;
                if (mes < mesB) {
                    edad--;
                }

                if (edad > 25) {
                    System.out.println(reporte.get(i).getNombre() + " " + reporte.get(i).getApellido() + " :" + edad);
                }

                if ((reporte.get(i).getApellido().charAt(0) == 'L')) {

                    contL++;
                } else if (reporte.get(i).getApellido().charAt(0) == 'P') {
                    contP++;

                }
            }

        }
        System.out.println("La cantidad de personas con apellidos por (L) son: " + contL);
        System.out.println("La cantidad de personas con apellidos por (P) son: " + contP);
        System.out.println("------------------------");
        System.out.println("---Venezolanos totales: " + contV + "---");
        System.out.println("---Chilenos totales: " + contC + "---");
        System.out.println("---Argentinos totales: " + contA + "---");

    }
    public static Comparator<AlumnosClass> ordenarN = (AlumnosClass t, AlumnosClass t1) -> t.getNombre().compareTo(t1.getNombre());
    public static Comparator<AlumnosClass> ordenarA = (AlumnosClass t, AlumnosClass t1) -> t.getApellido().compareTo(t1.getApellido());

}
