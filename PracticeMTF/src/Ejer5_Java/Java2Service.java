/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!.
 */
package Ejer5_Java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Java2Service {

    public Java2Class crearMes() {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        Java2Class mes = new Java2Class();
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mes.setMeses(meses);
        mes.setMesSecreto(mes.getMeses()[0]);
        System.out.println("Ingrese el mes que crea es el secreto");

        String mesSecreto = null;
        do {
            mesSecreto = input.next();
            if (mes.getMesSecreto().equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("Mes equivocado, intentelo de nuevo");
            }
        } while (!mes.getMesSecreto().equals(mesSecreto));
        return mes;
    }
}
