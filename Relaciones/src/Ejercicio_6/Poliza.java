/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.

12
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si
 */
package Ejercicio_6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JesusNjo
 */
public class Poliza {

    private int numPoliza;
    private Date fechaI;
    private Date fechaF;
    private int cantCuoutas;
    private String formaPago;
    private int montoT;
    private ArrayList<Cliente> cliente;

    public Poliza(int numPoliza, Date fechaI, Date fechaF, int cantCuoutas, String formaPago, int montoT, ArrayList<Cliente> cliente) {
        this.numPoliza = numPoliza;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.cantCuoutas = cantCuoutas;
        this.formaPago = formaPago;
        this.montoT = montoT;
       
        this.cliente = cliente;
    }

    public Poliza() {
    }

    
    
}
