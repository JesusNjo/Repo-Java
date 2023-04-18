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
public class JavaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public JavaClass crearMes() {
        JavaClass mes = new JavaClass();
        String[] opciones = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mes.setMeses(opciones);

        return mes;
    }

    public void mesSecreto(JavaClass m) {
        int mesAlt= (int) (Math.random()*10);
        m.setMesSecreto(m.getMeses()[mesAlt]);
        System.out.println(mesAlt);
        String mesS= null;
        
        
        do {
            System.out.println("Ingrese el mes que cree que sea el SECRETO");
            mesS = input.next();
            
           
            if (m.getMesSecreto().equals(mesS)) {
                System.out.println("¡Ha acertado!");
                
            
            } else {
                System.out.println("No es el mes, vuelva a intentarlo");
            }

        } while (!m.getMesSecreto().equals(mesS));

    }
}
