/*
Registro de Usuarios
En este ejercicio, trabajaremos con una entidad UsuarioMain para realizar operaciones básicas de creación, 
lectura, actualización y eliminación (CRUD).

Crea una entidad UsuarioMain con los atributos id (identificador), nombre (nombre del usuario), email 
(dirección de correo electrónico) y edad (edad del usuario).
Configura JPA en tu proyecto y asegúrate de que la entidad UsuarioMain se pueda mapear 
correctamente a la tabla correspondiente en la base de datos.
Implementa métodos para realizar las siguientes operaciones:
a. Crear un nuevo usuario y guardarlo en la base de datos.
b. Obtener un usuario por su ID.
c. Actualizar los datos de un usuario existente en la base de datos.
d. Eliminar un usuario por su ID.


 */
package Usuario;

import Usuario.Service.UsuarioService;



/**
 *
 * @author JesusNjo
 */
public class UsuarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        UsuarioService user = new UsuarioService();
        
        user.crearUsuarios();
        
    }

}
