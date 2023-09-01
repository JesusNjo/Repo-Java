/*
Crea una consulta JPQL que devuelva el nombre y el apellido de todos los clientes ordenados alfabéticamente.
Crea una consulta JPQL que devuelva el número de empleados que trabajan en cada departamento.
Crea una consulta JPQL que devuelva el saldo promedio de las cuentas bancarias de los clientes.
Crea una consulta JPQL que devuelva el nombre y el apellido del empleado que tiene el mayor salario.
Crea una consulta JPQL que devuelva el nombre y el apellido de los clientes que tienen más de una cuenta bancaria.
Crea una consulta JPQL que devuelva el nombre y el apellido de los empleados que trabajan en el mismo departamento que un empleado dado.
Crea una consulta JPQL que devuelva el nombre y el apellido de los clientes que tienen una cuenta bancaria con un saldo negativo.
Crea una consulta JPQL que devuelva el nombre y el apellido de los empleados que tienen un salario mayor al promedio de su departamento.
Crea una consulta JPQL que devuelva el nombre y el apellido de los clientes que tienen una cuenta bancaria en el mismo banco que un cliente dado.
Crea una consulta JPQL que devuelva el nombre y el apellido de los empleados que trabajan en más de un departamento.
 */
package newjpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import newjpa.entities.Cliente;
import newjpa.persistence.DAOCliente;

/**
 *
 * @author JesusNjo
 */
public class NewJpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Cliente cliente = new Cliente();
        DAOCliente clienteJpa = new DAOCliente();
        cliente = clienteJpa.lookForId(1);
       
        clienteJpa.deleteCliente(cliente.getId());
        

    }

}
