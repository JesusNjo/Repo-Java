/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import Services.ServiciosCompletos;


/**
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas (excepto Préstamo) 
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título. 
11) Búsqueda de un libro/s por nombre de Autor.13
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funciona5lidades de la aplicación: 
• Validar campos obligatorios.
• No ingresar datos duplicados.
* 
* 
* Tareas a realizar
1) Al alumno le toca desarrollar, las siguientes funcionalidades: 
2) Creación de un Cliente nuevo
3) Crear entidad Préstamo
4) Registrar el préstamo de un libro.
5) Devolución de un libro
6) Búsqueda de todos los préstamos de un Cliente.
• Agregar validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados. 
• No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más 
ejemplares de los que hay, ni devolver más de los que se encuentran prestados. 
No se podrán prestar libros con fecha anterior a la fecha actual, etc
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        ServiciosCompletos menu = new ServiciosCompletos();
        
        menu.menu();
    }
    
}
