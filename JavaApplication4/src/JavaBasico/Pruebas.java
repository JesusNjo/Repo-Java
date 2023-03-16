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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = (int) (Math.random() * 10);
        int num = 0;
        int[] tamanoVector = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {

            n = i + 1;
            System.out.println(tamanoVector[i]);
        }

    }

}
