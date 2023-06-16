/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            //Se intenta hacer una division entre 0
            int compra = 10 / 0;
            System.out.println("Hola");
        } catch (ArithmeticException a) {
            //Si la division falla el programa se va al bloque CATCH y se ejecuta lo que tenga el
            System.out.println("ERROR: División entre 0");
            System.out.println("ERROR: División entre 0" + a.getMessage()); //Devuelve una descripción del error<- BY ZERO
            System.out.println("ERROR: División entre 0" + a.fillInStackTrace()); //Devuelve un objeto throwable que contiene un 
            //seguimiento de pila completo. Este objeto se puede volver lanzar.
            System.out.println("ERROR: División entre 0" + a.toString()); //Devuelve un objeto String 
            //que contiene una descripción completa de la excepción. 
            //Este método lo llama println() cuando se imprime un objetoThrowable.
        }

        /*EL BLOQUE TRY Intentar en inglés Lo primero que hay que hacer para 
        que un método sea capaz de tratar una excepción generada por la máquina virtual Java
        o por el propio programa mediante una instrucción throw es encerrar 
        las instrucciones susceptibles de generarla en un bloque try. En el bloque try vamos a poner una 
        serie de instrucciones que creemos que puede llegar a tirar una excepción durante su ejecución y 
        queremos manejarla para evitar la finalización del programa.
            try {
                Instrucción1;
                Intruscción2;
                Instrucción3;
                Instrucción4
            }
        
    Cualquier excepción que se produzca por alguna instrucción, dentro del bloque try será analizada
    por el bloque o bloques catch. En el momento en que se produzca la excepción, se abandona el
    bloque try, y las instrucciones que sigan al punto donde se produjo la excepción no son
    ejecutadas. Cada bloque try debe tener asociado por lo menos un bloque catch.*/
 /*EL BLOQUE CATCH
        Atrapar en inglés
    Por cada bloque try pueden declararse uno o varios bloques catch, cada uno de ellos capaz de
    tratar un tipo u otro de excepción. Para declarar el tipo de excepción que es capaz de tratar un
    bloque catch, se declara un objeto cuya clase es la clase de la excepción que se desea tratar o
    una de sus superclases.
        try {
            BloqueDeIntrucciones
        } catch (TipoExcepción nombreVariable) {
            BloqueCatch
        } catch (TipoExcepción nombreVariable) {
            BloqueCatch
        }
        
    Al producirse la excepción dentro de un bloque try, la ejecución del programa se pasa al primer
    bloque catch. Si la clase de la excepción se corresponde con la clase o alguna subclase de la
    clase declarada en el bloque catch, se ejecuta el bloque de instrucciones catch y a continuación
    se pasa el control del programa a la primera instrucción a partir de los bloques try-catch. Lo más
    adecuado es utilizar excepciones lo más cercanas al tipo de error previsto, ya que lo que se
    pretende es recuperar al programa de alguna condición de error y si “se meten todas las
    condiciones en la misma bolsa”, seguramente habrá que averiguar después qué condición de
    error se produjo para poder dar una respuesta adecuada.*/
 /*EL BLOQUE FINALLY
             Finalmente en inglés
    El bloque finally se utiliza para ejecutar un bloque de instrucciones sea cual sea la excepción que
    se produzca. Este bloque se ejecutará siempre, incluso si no se produce ninguna excepción. Sirve
    para no tener que repetir código en el bloque try y en los bloques catch. El bloque finally es un
    buen lugar en donde liberar los recursos tomados dentro del bloque de intento.
            try {
                BloqueDeIntrucciones
            } catch (TipoExcepción nombreVariable) {
                MensajeDeError
            } catch (TipoExcepción nombreVariable) {
                MensajeDeError
            } finally {
                CodigoFinal
            }*/
        try {
            //Se intenta hacer una division entre 0
            int compra = 10 / 0;

            System.out.println("Hola");

        } catch (ArithmeticException a) {

            System.out.println("ERROR AL DIVIDIR ENTRE 0");

        } finally {

            //Si el programa hizo la division o no, este SOUT se va a ejecutar igual
            System.out.println("Soy un finally y me ejecuto siempre");
        }
        /*            LA CLAÚSULA THROWS
           Lanza (en presente) en inglés, que lanza algo.
    La cláusula throws lista las excepciones que un método puede lanzar. Los tipos de excepciones
    que lanza el método se especifica después de los paréntesis de un método, con una cláusula
    throws. Un método puede lanzar objetos de la clase indicada o de subclases de la clase indicada.
    Java distingue entre las excepciones verificadas y errores. Las excepciones verificadas deben
    aparecer en la cláusula throws de ese método. Como las RuntimeExceptions y los Errores pueden
    aparecer en cualquier método, no tienen que listarse en la cláusula throws y es por esto que
    decimos que no están verificadas. Todas las excepciones que no son RuntimeException y que un
    método puede lanzar deben listarse en la cláusula throws del método y es por eso que decimos
    que están verificadas. El requisito de atrapar excepciones en Java exige que el programador
    atrape todas las excepciones verificadas o bien las coloque en la cláusula throws de un método.

    Si la excepción no se trata, el manejador de excepciones realiza lo siguiente:
    • Muestra la descripción de la excepción.
    • Muestra la traza de la pila de llamadas.
    • Provoca el final del programa.
    Colocar una excepción en la cláusula throws obliga a otros métodos a ocuparse de la excepción.
    Esto se puede hacer colocando otro throws al método que llama al método, con el tipo de
    excepción que podría tirar o rodear el llamado del método con un try-catch, y de esa manera que
    el try-catch se encargue de manejar la excepción que podría tirar el método.
[acceso][modificador][tipo] nombreFuncion() throws TipoDeExcepcion {
    Bloque de instrucciones
}*/
        Excepciones ext = new Excepciones();
        Contenido cont = new Contenido();
        try {
            System.out.println(ext.division());
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir entre 0");
        }
        
        //Bloque de la palabra THROW
        
        List<Integer> list = new ArrayList();
        try {
            ext.agregarNumeroLista(list, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        cont.leerArchivo2();
}
    public int division() throws ArithmeticException {
        System.out.println("--------------------------------\n");
        
        int division;
        division = 20 / 0;

        return division;
    }
    
/*           LA PALABRA THROW
        Lanzar (en infinitivo) en inglés. Cuando pase algo, lanzar esto.
    
    Los programas escritos en Java pueden lanzar excepciones explícitamente mediante la
    instrucción throw, lo que facilita la devolución de un “código de error” al método que invocó el
    método que causó el error. La cláusula throw debe ir seguida del tipo de excepción que
    queremos que lance el método. Puede lanzarse cualquier tipo de excepción que implemente la
    interfaz Throwable.
    Cuando se lanza una excepción usando la palabra throw, el flujo de ejecución del programa se
    detiene y el control se transfiere al bloque try-catch más cercano que coincida con el tipo de
    excepción lanzada. Si no se encuentra tal coincidencia, el controlador de excepciones
    predeterminado finaliza el programa. La palabra clave throw es útil para lanzar excepciones
    basadas en ciertas condiciones, por ejemplo, si un usuario ingresa datos incorrectos. También es
    útil para lanzar excepciones personalizadas específicas para un programa o aplicación.
    Cuando utilicemos la palabra throw en un método, vamos a tener que agregarle la palabra throws
    al método con la excepción que va a tirar nuestro throw. De esa manera avisamos que cuando se
    llame al método hay que manejar una posible excepción.
    throw new TipoExcepcion(“Mensaje de error”);
    Ejemplo:
    En este método recibimos una lista y un numero para agregar a dicha lista. El método contiene la
    palabra throws para avisar que este método puede tirar una excepción*/
    
    public void agregarNumeroLista(List<Integer> lista,int numero)throws Exception{
        //Validamos si la lista ya tiene el numero a agregar
        System.out.println("AGG NUM");
        if(lista.contains(numero)){
            //Si lo tiene tiramos una excepción de tipo Exeption, poniendole un mensaje entre los parentesis
            
            throw new Exception("El numero ya esta en la lista.");
        }
        lista.add(numero);//Si no contiene el numero lo agregamos a la lista
    }
    
    ;
    
}
