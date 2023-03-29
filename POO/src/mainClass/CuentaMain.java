/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package mainClass;

import JavaService.CuentaService;
import entidades.CuentaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CuentaService cuenta = new CuentaService();
        CuentaClass c1 = cuenta.crearCuenta();

        int op;

        do {
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1: Depositar");
            System.out.println("2: Retirar");
            System.out.println("3: Extraccion rapida");
            System.out.println("4: Consultar saldo");
            System.out.println("5: Consultar datos");
            System.out.println("6: Salir del menú");
            op = input.nextInt();
            switch (op) {

                case 1:
                    cuenta.ingresar(c1);
                    break;
                case 2:
                    cuenta.retirar(c1);
                    break;
                case 3:
                    cuenta.extracionRadipa(c1);
                    break;
                case 4:
                    cuenta.consultarSaldo(c1);
                    break;
                case 5:
                    cuenta.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Ha salido del menu");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 6);

    }

}
