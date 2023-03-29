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
package JavaService;

import entidades.CuentaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CuentaService {
    Scanner input = new Scanner(System.in);
    
    
    
    public CuentaClass crear(){
        CuentaClass cuenta = new CuentaClass();
        System.out.println("Ingrese su DNI");
        cuenta.setDNI(input.nextLong());
        System.out.println("Ingrese su numero de cuenta");
        cuenta.setNumeroCuenta(input.nextInt());
        System.out.println("Deposite la cantidad para aperturar su cuenta");
        cuenta.setSaldoActual(input.nextInt());
        
        
        return cuenta;
    }
    
    public void ingresar(CuentaClass r){
        int ingreso = 0;
        System.out.println("Indique la cantidad que desea ingresa");
        ingreso = input.nextInt();   
        r.setSaldoActual(r.getSaldoActual() + ingreso);
    }
    public void retirar(CuentaClass r){
        int retiro = 0;
        System.out.println("Indique la cantidad que desea retirar");
        retiro = input.nextInt();   
        r.setSaldoActual(r.getSaldoActual() - retiro);
        
        if(retiro>r.getSaldoActual()){
            System.out.println("Saldo insuficiente");
            r.setSaldoActual(0);
        }
    }
    
    public void extracionRadipa(CuentaClass r){
        
        int retiro =0;
        System.out.println("Ingrese la cantidad que desea retirar");
        retiro = input.nextInt();
        
        if(r.getSaldoActual()*0.2< retiro){
            System.out.println("No puede retirar más de 20%");
        }else{
            r.setSaldoActual(r.getSaldoActual() - retiro);
        }
    }
    
    
    
    
}
