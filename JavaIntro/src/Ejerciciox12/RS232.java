/*
. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O.
 */
package Ejerciciox12;

/**
 *
 * @author JesusNjo
 */
public class RS232 {

    public void rs(String cadena) {
        boolean bandera = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!bandera) {
                break;
            }
            for (int j = cadena.length() - 1; j < cadena.length(); j++) {
                if (cadena.length() == 5) {
                    if (cadena.charAt(0) == 'X' && cadena.charAt(j) == 'O') {
                        System.out.println("CORRECTO");
                        bandera = false;
                    } else {
                        System.out.println("INCORRECTO");
                        bandera = false;

                    }
                } else {
                    System.out.println("Debe tener 5 caracteres la cadena");
                }
            }
        }
    }

    public void rsO(String cadena) {

        int aux = cadena.length();
        int i = 0;
        int j = aux - 1;

        if (cadena.length() != 5 || cadena.equalsIgnoreCase("&&&&&")) {
            System.out.println("LA CADENA TIENE QUE TENER 5 CARACTERES O ES INCORRECTA");
        } else {

            if ("x".equalsIgnoreCase(cadena.substring(i, (i + 1))) && "o".equalsIgnoreCase(cadena.substring(j, (j + 1)))) {
                System.out.println("CORRECTO");

            } else {
                System.out.println("INCORRECTO");
            }
        }
    }

}
