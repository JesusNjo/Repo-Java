/*
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package EjercicioExtra3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PassService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public PassClass crearPass() {
        PassClass n = new PassClass();
        System.out.println("Bienvenido");
        System.out.println(n.getNombre() + " - " + n.getDni());

        return n;
    }

    public void analizarPass(PassClass c) {
        int contA = 0;
        int contZ = 0;
        System.out.println("Ingrese su contraseña");
        do {
            c.setPass(input.next());
            if (c.getPass().length() > 9 && c.getPass().length() <= 10) {
                for (int i = 0; i < c.getPass().length(); i++) {
                    if ("z".equals(c.getPass().substring(i, i + 1))) {
                        contZ++;
                    }
                    if ("a".equals(c.getPass().substring(i, i + 1))) {
                        contA++;
                    }

                }
                if (contZ > 0 && contA < 2) {
                    System.out.println("Contraseña de nivel MEDIO");
                    modificarDatos(c);
                } else if (contZ > 0 && contA > 1) {
                    System.out.println("Contraseña de nivel ALTO");
                    modificarDatos(c);

                } else {
                    System.out.println("Contraseña de nivel BAJO");
                    modificarDatos(c);

                }
            } else {
                System.out.println("La contraseña debe tener 10 caracteres");
                System.out.println("Ingrese la contraseña nuevamente....");
            }
        } while (c.getPass().length() != 10);

    }

    public void modificarDatos(PassClass m) {
        boolean comprobar = false;
        String clave = m.getPass();
        String nombre = m.getNombre();
        int dni = m.getDni();
        int op = 0;
        System.out.println("\n\nBienvenido al sistema!");
        System.out.println("Para ingresar al menú de modificaciones debe ingresar nuevamente su contraseña"
                + "\nPorfavor, ingrese su contraseña para entrar al menú de cambios");

        m.setPass(input.next());
        do {
            if (m.getPass().equals(clave)) {

                System.out.println("\n1: Cambiar nombre de Usuario"
                        + "\n2: Cambiar numero de DNI"
                        + "\n3: Cambiar contraseña"
                        + "\n4: Salir del menú");
                op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese la contraseña para efectuar cambios del nombre de usuario");
                        m.setPass(input.next());
                        if (m.getPass().equals(clave)) {
                            System.out.println("Ingrese el nuevo nombre de usuario");
                            m.setNombre(input.next());
                            System.out.println("Usuario modificado."
                                    + "\nEl usuario: " + nombre + " ha sido cambiado por " + m.getNombre());
                        } else {
                            System.out.println("Clave invalida, volverá al menú de opciones");
                            m.setPass(clave);
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese la contraseña para efectuar cambios del DNI");
                        m.setPass(input.next());

                        if (m.getPass().equals(clave)) {
                            System.out.println("Ingrese el nuevo numero de DNI");
                            m.setDni(input.nextInt());
                            System.out.println("Numero de identificación modificado."
                                    + "\nEl numero de DNI: " + dni + " ha sido cambiado por " + m.getDni());
                        } else {
                            System.out.println("Clave invalida, volverá al menú de opciones");
                            m.setPass(clave);
                        }
                        break;
                    case 3:
                        do {
                            System.out.println("Ingrese su nueva contraseña");
                            m.setPass(input.next());
                            if (m.getPass().equals(clave)) {
                                System.out.println("La contraseña se repite, porfavor ingrese nuevamente su contraseña");
                            } else if (m.getPass().length() == 10 && !m.getPass().equals(clave)) {
                                System.out.println("Contraseña modificada."
                                        + "\nLa contraseña: " + clave + " ha sido cambiado por " + m.getPass());
                            } else {
                                System.out.println("La contraseña debe tener al menos 10 caracteres");
                            }
                        } while (m.getPass().length() != 10 || m.getPass().equals(clave));

                        clave = m.getPass();
                        break;
                    case 4:
                        System.out.println("Hasta luego!");
                }
            } else {
                System.out.println("Contraseña invalida, ingrese de nuevo la contraseña");
                m.setPass(input.next());
            }
        } while (op != 4);
        System.out.println("\nNombre de usuario: " + m.getNombre()
                + "\nNumero de identificación: " + m.getDni()
                + "\nContraseña: " + m.getPass());
    }

}
