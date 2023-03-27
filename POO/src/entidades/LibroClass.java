/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package entidades;

/**
 *
 * @author JesusNjo
 */
public class LibroClass {
    
    String ISBN;
    String titulo;
    String autor;
    String paginas;

    public LibroClass() {
    }
    
    
    public LibroClass(String ISBN, String titulo, String autor, String paginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        
    }
    public void regresarInfo(String ISBN, String autor, String titulo, String paginas)    {
        
    }
    @Override
    public String toString() {
        return "Libro:" + "ISBN:" + ISBN + ", Titulo:" + titulo + ", Autor:" + autor + ", Paginas:" + paginas + '}';
    }
    
}
