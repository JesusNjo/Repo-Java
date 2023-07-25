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

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;
/**
 *
 * @author JesusNjo
 */
@Entity

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id_usuario;
    @Basic
    private String nombre;
    private String email;
    private String edad;

    public Usuario(String id_usuario, String nombre, String email, String edad) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

  
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public Usuario() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
}
