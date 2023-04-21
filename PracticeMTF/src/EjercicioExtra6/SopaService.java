/*
Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas
 */
package EjercicioExtra6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class SopaService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public SopaClass crearSopa(){
        SopaClass sopa =new SopaClass();
        char[][] matriz = new char[][] {
            {'p', 'e', 'r', 'r', 'o', 'c', 'a', 't', 'o', 'r'},
            {'a', 's', 'i', 't', 'i', 'o', 'c', 'e', 'r', 'o'},
            {'l', 'e', 'c', 'h', 'e', 'm', 'o', 't', 'o', 'r'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'p', 'e', 'r', 'r', 'o', 'p', 'e', 'r', 'r', 'o'},
            {'a', 's', 'i', 't', 'i', 'o', 'a', 's', 'i', 't'},
            {'l', 'e', 'c', 'h', 'e', 'l', 'e', 'c', 'h', 'e'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'m', 'o', 't', 'o', 'r', 'm', 'o', 't', 'o', 'r'},
            {'r', 'a', 't', 'a', 't', 'a', 'r', 'a', 't', 'a'}
        };
        sopa.setMatriz(matriz);
        System.out.println("Ingrese la palabra");
        sopa.setPalabra(input.next());
        return sopa;
    }
}
