/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
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

/**
 *
 * @author JesusNjo
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private int numMot;
    private int chasis;
    private String color;
    private String tipo;
    

    public Vehiculo(String marca, String modelo, int anio, int numMot, int chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMot = numMot;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        
    }

    

    public Vehiculo() {
    }

   

    
   /* public ArrayList<Vehiculo> crearVehiculo(Vehiculo v){
        ArrayList<Vehiculo> vehi = new ArrayList();
        
        String[] marca ={"Chevrolet","Volswagen","Toyota","Hyundai","Mazda"};
        String[] modelo = {"Aveo","Fox","Corolla","Elantra","Tuctuz"};
        int[] anio ={2012,2008,2016,2009,2000};
        int[] numMot = {542141,452541,548723,452145,321452};
        int[] chasis= {1414,5456,2134,1523,1484};
        String[] color={"Blanco","Rojo","Negro","Azul","Verde"};
        String[] tipo ={"Particular","Vehiculo","Camioneta","Brindado","Truck"};
        
        
        for (int i = 0; i <marca.length; i++) {
            v = new Vehiculo();
            v.setMarca(marca[i]);
            v.setModelo(modelo[i]);
            v.setAnio(anio[i]);
            v.setNumMot(numMot[i]);
            v.setChasis(chasis[i]);
            v.setColor(color[i]);
            v.setTipo(tipo[i]);
            
            vehi.add(v);
        }
        for (Vehiculo vehiculo : vehi) {
            System.out.println(vehiculo);
        }
        return vehi;
    }*/
}
