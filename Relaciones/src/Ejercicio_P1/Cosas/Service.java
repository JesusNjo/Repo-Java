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
package Ejercicio_P1.Cosas;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Service {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Entidad crearCuenta() {
        Entidad cuent = new Entidad();
        System.out.println("Porfavor ingrese sus datos...");
        System.out.print("Ingrese su nombre: ");
        String nombre = input.next();
        System.out.println("Ingrese su numero de cuenta");
        cuent.setNumC(input.nextInt());
        System.out.println("Ingrese su DNI");
        cuent.setDni(input.nextInt());
        System.out.println("Ingrese su saldo");
        cuent.setSaldoAc(input.nextInt());
        int op =0;
        do{
            
        System.out.println("Indique la operación que desea realizar");
            System.out.println("\n1:Ingresar dinero\n2:Retirar dinero\n3:Metodo rapido\n4:Consultar saldo\n5:Consultar datos\n0:Salir");
            op = input.nextInt();
            
            
            switch(op){
                case 1:ingresar(cuent);break;
                case 2:retirar(cuent);break;
                case 3:metodoRa(cuent);break;
                case 4:consultarS(cuent);break;
                case 5:consultarD(cuent);break;
                case 0:System.out.println("Hasta luego");break;
                default: System.out.println("Opcion invalida");
            }
        }while(op!=0);
      
        
        
        return cuent;
    }

    public double ingresar(Entidad ing) {
        System.out.println("Indique la cantidad que desea agregar a su cuenta");
        double cantidad = input.nextDouble();
        ing.setSaldoAc((int) (cantidad + ing.getSaldoAc()));
        return cantidad + ing.getSaldoAc();
    }

    public double retirar(Entidad reti) {
        System.out.println("Ingrese la cantidad que desea retirar");
        double cantidad = input.nextInt();
        if (cantidad <= reti.getSaldoAc()) {
            reti.setSaldoAc((int) (reti.getSaldoAc()-cantidad));
            System.out.println("Operación exitosa!, saldo actual: " + reti.getSaldoAc());
        } else {
            System.out.println("Usted no tiene suficente dinero para sacar esa cantidad, lo sentimos.");
        }
        return cantidad;
    }

    public void metodoRa(Entidad retR) {
        System.out.println("Bienvenido a retiro rapido, solo puede sacar un maximo de 20% de su saldo");
        System.out.println("Indique la cantidad que desea retirar");
        double cantidad = input.nextInt();

        if (cantidad > retR.getSaldoAc() * 0.20) {
            System.out.println("Lo sentimos, no podemos darle mas del 20% de su saldo");
        } else {

            retR.setSaldoAc((int) (retR.getSaldoAc()-cantidad));
            System.out.println("Operación exitosa!, saldo actual: " + retR.getSaldoAc());

        }
    }
    
    public void consultarS(Entidad cons){
        System.out.println("Su saldo actual es: "+cons.getSaldoAc());
    }
    public void consultarD(Entidad conD){
        System.out.println("Su datos son: ");
        System.out.println("\n"+conD.getNumC()+"\n"+conD.getDni()+"\n"+conD.getSaldoAc());
        
    }
}
