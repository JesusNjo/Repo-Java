/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package Ejercicio_8;

import java.time.Year;
import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class ServicioFacultad {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void crearFacultad() {
        List<Persona> personal = new ArrayList();
        //Empleados

        personal.add(new Empleado(Year.of(1998), 240, "Javier", "Velazco", "Soltero", 215481));
        personal.add(new Empleado(Year.of(1999), 152, "Pedro", "Perez", "Casado", 148754));
        personal.add(new Empleado(Year.of(2000), 48, "Gerardo", "Noguera", "Viudo", 357452));

        //Estudiantes
        personal.add(new Estudiante("Matematica", "Jose", "Garcia", "Soltero", 584856));
        personal.add(new Estudiante("Logica", "Juan", "Marquez", "Casado", 14856));
        personal.add(new Estudiante("Programacion", "Leo", "Polte", "Casado", 64856));

        //Profesores
        personal.add(new Profesor("Matematica", "Rafael", "Carrillo", "Casado", 218452));
        personal.add(new Profesor("Biologia", "Armando", "Lopez", "Soltero", 118452));
        personal.add(new Profesor("Ciencias", "Jesus", "Casas", "Concubinato", 418452));

        System.out.println("----BASE DE DATOS DEL PERSONA----\n");
        for (Persona persona : personal) {
            System.out.println(persona.toString() + "\n");

        }
        //SWITCH AQUI menu
        int op = 0;
        do {
            System.out.println("Elija la opción que desea realizar\n1: Cambio estado civil\n2: Reasignación de despacho(Empleado)\n3: Matriculación de un estudiante(Estudiante)"
                    + "\n4:Cambio de departamento de un profesor\n5: Traslado personal servicio\n6: Mostrar base de datos\n0: Salir");
            op = input.nextInt();

            switch (op) {
               
                case 1:
                    cambioEdoCivil(personal);
                    break;
                case 2:
                    reasignacionDespacho(personal);
                    break;
                case 3:
                    cambioMatricula(personal);
                    break;
                case 4:
                    cambioDepProf(personal);
                    break;

                case 5:
                    trasladoPS(personal);
                    break;

                case 6:
                    for (Persona persona : personal) {
                        System.out.println(persona.toString() + "\n");
                        break;
                    }
                 case 0: System.out.println("Adios!");break;
                default:
                    System.out.println("Operación invalida..");
            }

        } while (op != 0);
    }

    public void cambioEdoCivil(List<Persona> cambioEDOC) {
        System.out.println("Bienvido, indique su DNI para realizar el cambio de Estado Civil");
        int dni = input.nextInt();

        for (Persona persona : cambioEDOC) {

            if (dni == persona.getDni()) {
                System.out.println("Ingrese su nuevo EDO. Civil");
                String edoCivilAct = persona.getEstadoCivil();
                persona.setEstadoCivil(input.next());
                System.out.println("Operación realizada con exito!\nEdo civil anterior: " + edoCivilAct + "\nEdo civil actual: " + persona.getEstadoCivil());
            }
        }
    }

    public void reasignacionDespacho(List<Persona> reasignacion) {
        System.out.println("Porfavor indique su numero de despacho");
        int numDespacho = input.nextInt();
        boolean empleadoEncontrado = false;
        for (Persona persona : reasignacion) {
            if (persona instanceof Empleado) {
                if (numDespacho == ((Empleado) persona).getNumDespacho()) {
                    empleadoEncontrado = true;
                    int numDespachoAnt = ((Empleado) persona).getNumDespacho();
                    System.out.println("Ingrese su nuevo numero de despacho");
                    ((Empleado) persona).setNumDespacho(input.nextInt());
                    System.out.println("Numero de despacho modificado..\nNumero de despacho anterior: " + numDespachoAnt + "\nNuevo de despacho actual: " + ((Empleado) persona).getNumDespacho());
                }
            }
        }
        if (!empleadoEncontrado) {
            System.out.println("Usted no es empleado");
        }
    }

    public void cambioMatricula(List<Persona> cambioMatricula) {
        System.out.println("Porfavor indique su numero de DNI");
        int dni = input.nextInt();
        boolean estudianteEncontrado = false;
        for (Persona persona : cambioMatricula) {
            if (persona instanceof Estudiante) {
                if (dni == persona.getDni()) {
                    String matriculaAnt = ((Estudiante) persona).getMatricula();

                    System.out.println("Indique la nueva matricula que desea ingresar");
                    ((Estudiante) persona).setMatricula(input.next());

                    System.out.println("Matricula modificada con exito!.. \nMatricula anterior: " + matriculaAnt + "\nMatricula actual: " + ((Estudiante) persona).getMatricula());
                }
            }
        }
        if (!estudianteEncontrado) {
            System.out.println("Usted no es estudiante");
        }

    }

    public void cambioDepProf(List<Persona> cambioDep) {
        System.out.println("Porfavor indique su numero de DNI");
        int dni = input.nextInt();
        boolean profEncontrado = false;
        for (Persona persona : cambioDep) {
            if (persona instanceof Profesor) {
                if (dni == persona.getDni()) {
                    profEncontrado = true;
                    String departAnt = ((Profesor) persona).getDepartamento();
                    System.out.println("Indique el nuevo departamento al que desea cambiar");
                    ((Profesor) persona).setDepartamento(input.next());
                    System.out.println("Cambio de departamento realizado con exito!..\nDepartamento anterior: " + departAnt + "\nNuevo departamento: " + ((Profesor) persona).getDepartamento());
                }
            }
        }
        if (!profEncontrado) {
            System.out.println("Usted no es profesor..");
        }

    }

    public void trasladoPS(List<Persona> traslado) {

        System.out.println("Porfavor indique su numero de DNI");
        int dni = input.nextInt();
        boolean persoS = false;
        for (Persona persona : traslado) {
            if (persona instanceof PersonalServicio) {
                if (dni == persona.getDni()) {
                    persoS = true;
                    String trasA = ((PersonalServicio) persona).getSeccion();
                    System.out.println("Indique la nueva sección a la que desea cambiar");
                    ((PersonalServicio) persona).setSeccion(input.next());
                    System.out.println("Cambio de sección realizado con exito!..\nSección anterior anterior: " + trasA + "\nNueva sección: " + ((PersonalServicio) persona).getSeccion());

                }
            }
        }
        if (!persoS) {
            System.out.println("Usted no es personal de servicio..");
        }
    }
}
