/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio_P1.Cosas;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Service {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void mostrarVocales(Entidad obj) {
        int cont = 0;
        obj.setLongitud(obj.getFrase().length());
        for (int i = 0; i < obj.getFrase().length(); i++) {
            if ("a".equals(obj.getFrase().substring(i, (i + 1))) || "e".equals(obj.getFrase().substring(i, (i + 1))) || "i".equals(obj.getFrase().substring(i, (i + 1))) || "e".equals(obj.getFrase().substring(i, (i + 1))) || "o".equals(obj.getFrase().substring(i, (i + 1))) || "u".equals(obj.getFrase().substring(i, (i + 1)))) {
                cont++;

            }
        }

        System.out.println("La palabra tiene (" + cont + ") vocales");
    }

    public void invertirFrase(Entidad obj) {

        String invertida = "";

        obj.setLongitud(obj.getFrase().length());
        for (int i = obj.getLongitud() - 1; i >= 0; i--) {

            invertida += obj.getFrase().substring(i, (i + 1));

        }

        System.out.println("La frase invertida es: " + invertida);
    }

    public void vecesRepetidor(String letra, Entidad obj) {
        System.out.println("Ingrese el caracter que desea saber cuanto se repite");

        int cont = 0;

        for (int i = 0; i < obj.getLongitud(); i++) {

            if (obj.getFrase().substring(i, (i + 1)).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("Letra consiguida (" + cont + ") vez/es");

    }

    public void compararLong(String frase, Entidad obj) {

        if (frase.length() == obj.getLongitud()) {
            System.out.println("Misma longitud: (" + obj.getLongitud() + ") caracteres");
        } else {
            System.out.println("Distintas longitudes: ");
            System.out.println("Frase nueva: " + frase.length());
            System.out.println("Frase vieja: " + obj.getLongitud());
        }
    }

    public void unirFrase(String frase, Entidad obj) {

        System.out.println("Frases unidas: ");

        System.out.println(frase + "/" + obj.getFrase());
    }

    public void reemplazar(Entidad obj) {
        System.out.println("Indique la letra que desea reemplazar ");
        String letr = input.next();

        String cambio = obj.getFrase().replace(letr, "#");

        System.out.println(cambio);
    }

    public boolean contieneLetra(Entidad bol) {
        System.out.println("Verificar letra, Ingrese la letra");
        String letr = input.next();
        for (int i = 0; i < bol.getLongitud(); i++) {
            if (bol.getFrase().substring(i, (i + 1)).equalsIgnoreCase(letr)) {
                return true;
            }
        }
        return false;

    }
}
