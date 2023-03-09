/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

/**
 *
 * @author JesusNjo
 */
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase (terminada en punto): ");
        String texto = sc.nextLine();

        String textoCodificado = codificarTexto(texto);
        System.out.println("Texto codificado: " + textoCodificado);
    }

    public static String codificarTexto(String texto) {
        String textoCodificado = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            switch (caracter) {
                case 'a':
                    textoCodificado = textoCodificado.concat("@");
                    break;
                case 'e':
                    textoCodificado = textoCodificado.concat("#");
                    break;
                case 'i':
                    textoCodificado = textoCodificado.concat("$");
                    break;
                case 'o':
                    textoCodificado = textoCodificado.concat("%");
                    break;
                case 'u':
                    textoCodificado = textoCodificado.concat("*");
                    break;
                default:
                    textoCodificado = textoCodificado.concat(String.valueOf(caracter));
                    break;
            }
        }
        return textoCodificado;
    }
}
    
