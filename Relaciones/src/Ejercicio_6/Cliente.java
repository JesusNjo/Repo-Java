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



/**
 *
 * @author JesusNjo
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String mail;
    private String domicilio;
    private long documendo;
    private int telefono;
    private Vehiculo vehiculo;

    public Cliente(String nombre, String apellido, String mail, String domicilio, long documendo, int telefono, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.documendo = documendo;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
    }

    

    public Cliente() {
    }

  


   /* public ArrayList<Cliente> crearCliente() {
       
        ArrayList<Cliente> clientes = new ArrayList();
        String[] nombres = {"Francisco", "Juan", "Pedro", "Maria", "Petra"};
        String[] apellidos = {"Hernandez", "Naranjo", "Gonzalez", "Ponse", "Perez"};
        String[] emails = {"JesusNjo@hotmail.com", "Ptxd@gmail.com", "JuaxNj@gmail.com", "LolPes@gmail.com", "Leito24@hotmail.com"};
        String[] domicilios = {"PMA","PTA MARAVEN","PUNTO FIJO","MARAVEN","ANTIGUO AEROPUERTO"};
        long[] documentos ={21156294,24222344,23334455,23444353,1444584};
        int[] numTelef={412446,4145484,4245484,4168488,416848441};
        
        for (int i = 0; i <nombres.length; i++) {
        
            Cliente cliente = new Cliente();
            cliente.setNombre(nombres[i]);
            cliente.setApellido(apellidos[i]);
            cliente.setMail(emails[i]);
            cliente.setDocumendo(documentos[i]);
            cliente.setTelefono(numTelef[i]);
            cliente.setDomicilio(domicilios[i]);
            
            clientes.add(cliente);
            
        }
        
        for (Cliente cliente1 : clientes) {
            System.out.println(cliente1);
        }
        
        return clientes;
    }*/
}
