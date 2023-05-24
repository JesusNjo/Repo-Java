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
public class PerrPerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Listas y objetos
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        List<Persona> arrayPersona = new ArrayList();
        List<Perro> arrayPerro = new ArrayList();
        Map<Persona, Perro> mapa = new HashMap();
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

        int contador = 0;
        int limite = 100;
        do {
            for (int i = 0; i < nombresPersonas.length; i++) {
                int AlePers = (int) ((Math.random() * 5));
                int AlePerr = (int) ((Math.random() * 5));

                if (nombresPersonas[AlePers] == null || nombresPerros[AlePerr] == null) {
                    continue;
                }
                Persona x = new Persona(nombresPersonas[AlePers], apellidosPersonas[AlePerr], edadesPersonas[AlePerr], dniPersonas[AlePers]);
                Perro y = new Perro(nombresPerros[AlePerr], razaPerros[AlePers], edadPerros[AlePerr], tamanioPerros[AlePers]);
                nombresPersonas[AlePers] = null;
                nombresPerros[AlePerr] = null;
                arrayPersona.add(x);
                arrayPerro.add(y);

            }
            contador++;
        } while (arrayPersona.size() < nombresPersonas.length && arrayPerro.size() < nombresPerros.length && contador < limite);

        System.out.println(arrayPersona.size());
        for (Persona aux : arrayPersona) {
            System.out.println(aux.toString());

        }
        System.out.println("--------------");
        System.out.println("Bienvenidos a la adopción de mascotas");
        System.out.println("--------------");
        String opx = null;
        int pos = 0;
        do {
            System.out.print("Porfavor indique su nombre :");
            String nombre = input.next();

            for (int i = 0; i < arrayPersona.size(); i++) {
                if (nombre.equalsIgnoreCase(arrayPersona.get(i).getNombre())) {
                    System.out.println("Bievenido señor " + arrayPersona.get(i).getNombre());
                    System.out.println("*********");
                    System.out.println("Datos de la persona: ");
                    System.out.println(arrayPersona.get(i).toString());
                    pos = i;

                }
            }
            System.out.print("Porfavor indique el nombre de la mascota que desea adoptar :");
            String nombreM = input.next();
            boolean disponible = true;
            for (int i = 0; i < arrayPerro.size(); i++) {

                if (nombreM.equalsIgnoreCase(arrayPerro.get(i).getNombre())) {
                    System.out.println("Usted indicó que quiere adoptar a " + arrayPerro.get(i).getNombre());
                    System.out.println("*********");
                    System.out.println("Las caracteristicas de esta mascota son: ");
                    System.out.println(arrayPerro.get(i).toString());
                    System.out.println("¿Desea adoptar esta mascota? S/N");
                    String op = input.next();
                    disponible = false;
                    if ("s".equalsIgnoreCase(op)) {
                        System.out.println("Ahora " + arrayPerro.get(i).getNombre() + " tiene una nueva familia, hasta luego!");
                        mapa.put(arrayPersona.get(pos), arrayPerro.get(i));
                        arrayPerro.remove(i);
                        arrayPersona.remove(pos);
                        i--;  
                    }
                }
            }
            if (disponible) {
                System.out.println("Esa mascota no se encuentra disponible, lo sentimos..");
            }
            System.out.println("¿Hay otra persona que desea adoptar?S/N");
            opx = input.next();

         

        } while ("s".equalsIgnoreCase(opx));

        System.out.println("Adopciones: ");

        for (Map.Entry<Persona, Perro> entry : mapa.entrySet()) {
            Persona key = entry.getKey();
            Perro value = entry.getValue();

            System.out.println("Dueño["+key.toString()+"]" + "\nMascota[" + value.toString()+"]");
            System.out.println("----------");
            System.out.println("----------");
        }

    }
}
