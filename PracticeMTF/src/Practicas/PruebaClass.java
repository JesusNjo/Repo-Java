/*
Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia.

La clase Cuenta debe tener los siguientes atributos:
titular: el titular de la cuenta (String).
cantidad: la cantidad de dinero que tiene la cuenta (double).
Y los siguientes métodos:
ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
transferir(Cuenta destino, double cantidad): se transfiere una cantidad desde la cuenta actual a otra cuenta destino.
 */
package Practicas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class PruebaClass {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    private String titular;
    private double cantidad;

    public PruebaClass() {
    }

    public PruebaClass(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public PruebaClass crearCuenta() {
        PruebaClass clienteNuevo = new PruebaClass();
        System.out.println("Ingrese el nombre del cliente");
        clienteNuevo.setTitular(input.next());
        do {

            System.out.println("Ingrese la cantidad que ingresara a la cuenta");
            clienteNuevo.setCantidad(input.nextDouble());
            if(clienteNuevo.getCantidad()<=0){
                System.out.println("El monto debe ser mayor que 0");
            }
        } while (clienteNuevo.getCantidad() <= 0);

        int op = 0;

        do {

            System.out.println("Ingrese la operacion que desea realizar:"
                    + "\n1: Ingresar dinero"
                    + "\n2: Retirar dinero"
                    + "\n3: Transferir"
                    + "\n4: Salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    ingresar(clienteNuevo);
                    break;
                case 2:
                    retirar(clienteNuevo);
                    break;
                case 3:
                    transferir(clienteNuevo, clienteNuevo.getCantidad());
                    break;
                case 4: System.out.println("SALIO DEL MENU!");break;
                
                default: System.out.println("Opcion no valida");

            }
        } while (op != 4);

        return clienteNuevo;
    }

    public void ingresar(PruebaClass c) {
        
            System.out.println("Ingrese el monto que desea ingresar a su cuenta");
            double cantidad = input.nextDouble();
            System.out.println("Dinero ingresado.\nActualmente posee: " + (cantidad + c.getCantidad()));
            c.setCantidad(cantidad + c.getCantidad());
        
    }

    public void retirar(PruebaClass r) {
        System.out.println("Ingrese la cantidad que desea retirar..");
        double retiro = input.nextDouble();

        if (retiro > r.getCantidad()) {
             
            System.out.println("Transsaccion fallida, saldo insuficiente");
        } else if (retiro < r.getCantidad()) {
            r.setCantidad(r.getCantidad()-retiro);

            System.out.println("Retiro realizado exitosamente\nCantidad disponible: " + r.getCantidad());
            
        }else{
             r.setCantidad(r.getCantidad()-retiro);
            System.out.println("Retiro realizado exitosamente\nCantidad disponible: " + r.getCantidad());
        }
    }

    public void transferir(PruebaClass destino, double cantidad) {
        System.out.print("Ingrese el monto a transferir: ");
        cantidad = input.nextDouble();
        if(cantidad > destino.getCantidad()){
            System.out.println("No posee suficiente dinero para transferir esa cantidad");
        }else{
            
        System.out.println("Transferencia exitosa, se ha transferido el monto total de: " + cantidad);
        destino.setCantidad(destino.getCantidad() - cantidad);
        System.out.println("Dinero disponible en su cuenta: " + destino.getCantidad());
        }
        
        
    }

    @Override
    public String toString() {
        System.out.println("Operacion finalizada..");
        return "Titular de la cuenta: V-" + titular + "\nCantidad de dinero disponible: " + cantidad+"$";
    }
}
