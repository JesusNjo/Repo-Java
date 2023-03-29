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
//SE CREA LA CLASE
public class OperacionService {

    // DE INICIA EL SCANNER PARA PEDIR DATOS
    Scanner input = new Scanner(System.in);

    // CREAMOS LA FUNCION DE TIPO OPERACIONCLASS
    public OperacionClass CrearOperacion() {

        // CREAMOS LA VARIABLE DE TIPO OBJETO CON OPERACIONCLASS
        OperacionClass n = new OperacionClass();

        // PEDIMOS DATOS AL USUARIO
        System.out.println("Ingrese el primer digito");

        // GENERAMOS LOS SET PARA GUARDAS LOS VALORES EN LA VARIABLE
        // N.SETNUM1 GUARDARA EL VALOR DEL OBJETO NUM1;
        n.setNum1(input.nextInt());
        System.out.println("Ingrese el segundo digito");
        // N.SETNUM1 GUARDARA EL VALOR DEL OBJETO NUM2;

        n.setNum2(input.nextInt());
        // RETORNAMOS EL OBJETO EN LOS VALORES ASIGNADOS
        return n;
    }
    // SALIMOS DEL METODO PRINCIPAL DE GUARDAR VALORES Y CREAMOS LAS FUNCIONES ARITMETICAS
    
                    //CREAMOS EL ATRIBUTO N DE TIPO OPERACIONCLASS
                    //ESTO HARÁ QUE PUEDA ACCEDER A LOS SETTERS Y GETTERS
    public int suma(OperacionClass n){
       // CREAMOS LA SUMA CON SET PARA QUE GUARDE LOS VALORES DE LA SUMA ENTRE NUM1 Y NUM2;
       // EXTRAEMOS LOS VALORES DE NUM1 Y NUM2 UTILIZANDO EL METODO GET
       n.setSuma(n.getNum1() + n.getNum2());
       // RETORNAMOS EL VALOR DE SUMA CON UN GET
        return n.getSuma();
    }
    public int resta(OperacionClass n){
       // CREAMOS LA RESTA CON SET PARA QUE GUARDE LOS VALORES DE LA RESTA ENTRE NUM1 Y NUM2;
       // EXTRAEMOS LOS VALORES DE NUM1 Y NUM2 UTILIZANDO EL METODO GET
       n.setResta(n.getNum1() - n.getNum2());
       // RETORNAMOS EL VALOR DE RESTA CON UN GET
        return n.getResta();
    }
    public int multi(OperacionClass n){
       // CREAMOS LA MULTIPLICACION CON SET PARA QUE GUARDE LOS VALORES DE LA MULTIPLICACION ENTRE NUM1 Y NUM2;
       // EXTRAEMOS LOS VALORES DE NUM1 Y NUM2 UTILIZANDO EL METODO GET
       n.setMultiplicacion(n.getNum1() * n.getNum2());
       // RETORNAMOS EL VALOR DE MULTIPLICACION CON UN GET
        return n.getMultiplicacion();
    }
    public int divi(OperacionClass n){
       // CREAMOS LA DIVISION CON SET PARA QUE GUARDE LOS VALORES DE LA DIVISION ENTRE NUM1 Y NUM2;
       // EXTRAEMOS LOS VALORES DE NUM1 Y NUM2 UTILIZANDO EL METODO GET
       n.setDivision(n.getNum1() / n.getNum2());
       // RETORNAMOS EL VALOR DE DIVISION CON UN GET
        return n.getDivision();
    }
}
