/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicemtf;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        Scanner input = new Scanner(System.in);
        // INICIAMOS EL SERVICIO DANDOLE EL VALOR A LA VARIABLE DE ESTE TIPO DE DATO

        OperacionService n = new OperacionService();
        //CREAMOS UNA VARIABLE DE TIPO OPERACIONCLASS PARA EXTRAER DE LA OPERACIONSERVICE LOS METODOS
        OperacionClass nV = n.CrearOperacion();

        System.out.println("Indique el tipo de operacion que desea realizar");
        System.out.println("SUMAR: 1, RESTAR: 2, MULTIPLICAR: 3, DIVIDIR: 4");
        op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println(n.suma(nV));break;
            case 2:
                System.out.println(n.resta(nV));break;
            case 3:
                if (nV.getNum1() == 0 || nV.getNum2() == 0) {
                    System.out.println("No puede multiplicar con 0");
                } else {
                    System.out.println(n.multi(nV));
                }break;
            case 4:
                if (nV.getNum1() == 0 || nV.getNum2() == 0) {
                    System.out.println("No puede dividir con 0");
                } else {
                    System.out.println(n.divi(nV));
                }break;
            default: System.out.println("El valor que indico no es valido");
        }

    }

}
