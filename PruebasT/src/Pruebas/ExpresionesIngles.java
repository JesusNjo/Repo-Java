/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author JesusNjo
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ExpresionesIngles {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void expresiones() {
        List<String> listaExpresiones = new ArrayList();
        listaExpresiones.add("You are the company you keep");
        listaExpresiones.add("Dont put all eggs in one basket");
        listaExpresiones.add("I cant stomash this pizza");
        listaExpresiones.add("I cant stomash her");
        listaExpresiones.add("I have to shoulder this burden");
        listaExpresiones.add("I dont need to shoulder this burden");
        listaExpresiones.add("Curiosity killed the cat");
        listaExpresiones.add("Take precedence over");
        listaExpresiones.add("Suit you");
        listaExpresiones.add("at my mother's knee");
        listaExpresiones.add("Back on one's feet");
        listaExpresiones.add("A big head");
        listaExpresiones.add("Bite your lips");
        listaExpresiones.add("Bury the head in the sand");
        listaExpresiones.add("That being said");
        listaExpresiones.add("Cut him some slack");
        listaExpresiones.add("Knock yourself out");
        listaExpresiones.add("Your comment was uncalled for");
        listaExpresiones.add("I nodded of");
        listaExpresiones.add("keep it under wraps");
        listaExpresiones.add("Stop floffing around");
        listaExpresiones.add("I have the world on a string");
        listaExpresiones.add("What comes around goes around");
        listaExpresiones.add("Knock me flat on my ass");

        List<String> expresionesS = new ArrayList();
        expresionesS.add("Dime con quien andas y te dire quien eres");
        expresionesS.add("No pongas todas tus oportunidades en una sola");
        expresionesS.add("No tolerar una situación");
        expresionesS.add("No la tolero");
        expresionesS.add("Tengo que asumirlo");
        expresionesS.add("No necesito asumirlo");
        expresionesS.add("La curiosidad mato al gato");
        expresionesS.add("Cuando algo es mas importante que otra");
        expresionesS.add("Te conviene");
        expresionesS.add("Desde que era pequeño");
        expresionesS.add("Recuperarse de una situacion");
        expresionesS.add("Una persona arrogante");
        expresionesS.add("Callar algo que querias decir");
        expresionesS.add("Hacerse el loco");
        expresionesS.add("Dicho esto");
        expresionesS.add("No seas tan rudo con el");
        expresionesS.add("Ponerse los pantalones");
        expresionesS.add("Tu comentario fue innapropiado");
        expresionesS.add("Me quede dormido");
        expresionesS.add("Mantenlo en secreto");
        expresionesS.add("Perder tiempo");
        expresionesS.add("Tengo el mundo en mis manos");
        expresionesS.add("Lo que facil viene facil se va");
        expresionesS.add("Ponerlo en su lugar");

        for (String auxIng : listaExpresiones) {
            System.out.println(auxIng);
            System.out.println("Escriba la traducción");
            String tradu = input.next();
            if (tradu.isEmpty()) {
                System.out.println("-----Traducción incorrecta-----");
                continue;
            }
            
            for (String string : expresionesS) {
                if (string.equalsIgnoreCase(tradu)) {
                    System.out.println(string);
                    System.out.println("-----Traducción correcta-----");
                    
                    break;
                }
                if (!string.equalsIgnoreCase(tradu)) {
                    System.out.println(string);
                    System.out.println("-----Traducción incorrecta-----");
                    
                    break;
                }
            }
            
        }

    }
}
