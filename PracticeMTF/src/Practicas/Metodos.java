/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JesusNjo
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Metodos MATH
        double raiz = Math.sqrt(15.5); //Raices cuadradas (Funciona con double)
        double resultado = Math.pow(2, 3/*base,exponente*/); //Elevar a la potencia
        int redondear = (int) Math.round(raiz); //Redondear un valor
        double random = Math.random(); //Crea un numero random desde 0 a 1;

        //Para transformar un String a Entero(int)
        String hola = "12";
        int transformacion = Integer.parseInt(hola);

        //Para crear un prompt en JAVA
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); //Para crear prompt en JAVA
        System.out.println(num);

        // Para crear un confirm en java
        // CONFIRM DE TIPO SI O NO;
        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            // Código si se selecciona "Sí"
        } else if (opcion == JOptionPane.NO_OPTION) {
            // Código si se selecciona "No"
        }
        // CONFIRM DE VALORES DEFINIDOS

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Título del cuadro de diálogo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        if (opcionSeleccionada == 0) {
            // Código si se selecciona "Opción 1"
        } else if (opcionSeleccionada == 1) {
            // Código si se selecciona "Opción 2"
        } else if (opcionSeleccionada == 2) {
            // Código si se selecciona "Opción 3"
        }

//Arreglos (Arrays) Vectores
        //Formas de crear los arreglos
        int[] datos = new int[3];
        int[] numeros = {5, 6, 7};
        //Para las matrices

        int[][] matrizV = new int[2][2];
        int[][] matriz = {{2, 3, 4, 5, 6}, {18, 3, 4, 5, 6}};

//Bucle forEach o for mejorado
        for (int elemento : numeros) {
            System.out.println(elemento);
        }
    }

}
