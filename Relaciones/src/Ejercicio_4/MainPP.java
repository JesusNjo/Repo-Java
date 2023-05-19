/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Ejercicio_4;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class MainPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros objP = new Perros();
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Perros> perrosList = new ArrayList();
        ArrayList<Personas> personasList = new ArrayList();
        ArrayList<Personas> personasAdop = new ArrayList();
        //Personas
        String[] nombresPersonas = {"Juan", "Pedro", "Maria", "Francisco", "Jesus"};
        String[] apellidosPersonas = {"Hernandez", "Naranjo", "Perez", "Silva", "Noguera"};
        Integer[] edadesPersonas = {15, 24, 18, 19, 25};
        Integer[] dniPersonas = {2547548, 485485, 1245845, 152436, 254854};
        //Perros

        String[] nombresPerros = {"Tommy", "Orion", "Zeus", "Mito", "Bruno"};
        String[] razaPerros = {"Golden Retriver", "Pitbull", "Beagle", "Puddle", "Pastor Aleman"};
        Integer[] edadPerros = {5, 4, 8, 6, 2, 1};
        String[] tamanioPerros = {"Mediano", "Grande", "Pequeño", "Mediano", "Pequeño"};

        for (int i = 0; i < nombresPersonas.length; i++) {
            objP = new Perros();

            objP.setNombreP(nombresPerros[i]);
            objP.setRaza(razaPerros[i]);
            objP.setEdad(edadPerros[i]);
            objP.setTamanio(tamanioPerros[i]);

            perrosList.add(objP);
        }

        for (int i = 0; i < nombresPersonas.length; i++) {
            Personas obj = new Personas();

            obj.setNombre(nombresPersonas[i]);
            obj.setApellido(apellidosPersonas[i]);
            obj.setEdad(edadesPersonas[i]);
            obj.setDocumento(dniPersonas[i]);

            personasList.add(obj);
        }

        System.out.println("--------------");
        System.out.println("Bienvenidos a la adopción de mascotas");
        System.out.println("--------------");
        String continuar = "S";
        do {
            System.out.print("Por favor indique su nombre: ");
            String nombrePersona = input.next();
            boolean personaEncontrada = false;
            for (int i = 0; i < personasList.size(); i++) {
                if (nombrePersona.equalsIgnoreCase(personasList.get(i).getNombre())) {
                    System.out.println("Bienvenido señor: " + personasList.get(i).getNombre());
                    System.out.println("-------");
                    personaEncontrada = true;
                    boolean perroEncontrado = false;
                    System.out.print("Por favor indique el nombre del perro que desea adoptar: ");
                    String nombrePerro = input.next();
                    for (int j = 0; j < perrosList.size(); j++) {
                        if (nombrePerro.equalsIgnoreCase(perrosList.get(j).getNombreP())) {
                            System.out.println("Excelente, ha optado por: " + perrosList.get(j).getNombreP());
                            System.out.println("--------");
                            System.out.println("Estos son los datos de la mascota:");
                            System.out.println(perrosList.get(j).toString());
                            perroEncontrado = true;
                            System.out.print("¿Desea adoptar esta mascota? S/N: ");
                            String adoptar = input.next();
                            if ("S".equalsIgnoreCase(adoptar)) {
                                System.out.println("Ahora " + perrosList.get(j).getNombreP() + " tiene una nueva familia, hasta luego!");
                                Personas personaAd = new Personas(personasList.get(i).getNombre(), personasList.get(i).getApellido(), personasList.get(i).getEdad(), personasList.get(i).getDocumento(), perrosList.get(j));
                                
                                
                                personaAd.setPerro(objP);
                                personasAdop.add(personaAd);
                                perrosList.remove(j);
                                personasList.remove(i);
                                break;
                            }
                        }
                    }
                    if (!perroEncontrado) {
                        System.out.println("Lo siento, no se encontró a ningún perro con ese nombre en la lista de mascotas disponibles para adopción.");
                    }
                    break;
                }
            }
            if (!personaEncontrada) {
                System.out.println("Lo siento, no se encontró a ninguna persona con ese nombre en la lista de interesados.");
            }
            System.out.print("¿Desea continuar con otra adopción? S/N: ");
            continuar = input.next();
        } while ("S".equalsIgnoreCase(continuar));

        System.out.println("\n----------------------");

        System.out.println("Esta es la lista de las personas que adoptaron hoy con su mascota: ");

        for (Personas aux : personasAdop) {
            System.out.println(aux.toString());
            System.out.println("-----");
        }
    }

}
