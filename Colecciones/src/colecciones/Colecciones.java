/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author JesusNjo
 */
public class Colecciones {

    //int Integer
    //double Double
    //long Long
    //char Character
    //boolean Boolean
    //String
    /*LISTAS Las listas son un tipo de colección que nos permiten tener un control preciso sobre el lugar que ocupa cada elemento
    . Es decir, sus elementos están ordenados y podemos elegir en qué lugar colocar un elemento mediante su

    índice(lugar queocupa). Esto nos da una de las características más importantes de las listas: pueden guardar elementos duplicados. Es decir, permite que lista[0]
    sea exactamente igual a lista[1].
        
    ARRAYLIST
    Se implementa como un arreglo de tamaño variable. A medida que se agregan más elementos, su
    tamaño aumenta dinámicamente. Es el tipo más común.
    Básicamente es un array o vector de tamaño dinámico, con las características propias de las listas.
    LINKEDLIST

    Se implementa como una lista de doble enlace. Su rendimiento al agregar y quitar es mejor que
    Arraylist, pero peor en los métodos set y get.*/
    public static void main(String[] args) {
        //ArrayList: 
        ArrayList<Integer> numerosA = new ArrayList();
        //LinkedList: 
        LinkedList<Integer> numeroB = new LinkedList();

        //HASH
        //HashSet String
        HashSet<String> nombre = new HashSet();
        //TreeSet Int
        TreeSet<Integer> num = new TreeSet();
        //LinkedHashSet
        LinkedHashSet<String> frases = new LinkedHashSet();
    }
    //Conjuntos
    /*Los conjuntos o en ingles Set modelan una colección de objetos de una misma clase donde cada elemento aparece solo una vez, no puede tener duplicados , a diferencia de una lista donde los
    elementos podían repetirse.El framework trae varias implementaciones de distintos tipos de conjuntos
    :
    HASHSET Se implementa utilizando una tabla hash para darle un valor único a cada elemento y de esa
    manera evitar los duplicados
    . Es decir, el HashSet crea un código hash para cada valor, evitando
    que hayan dos valores iguales o duplicados y a diferencia del TreeSet sus elementos no están
    ordenados.
    ¿Qué es un Hash
    ?
    Una función criptográfica hash - usualmente conocida como “hash ”- es un algoritmo matemático
    que transforma cualquier bloque arbitrario de datos en una nueva serie de caracteres 
    alfanuméricos(mezcla entre letras y números) con una longitud fija. Independientemente de la
    longitud de los datos de entrada, el valor hash de salida tendrá siempre la misma longitud.*/

    /*Mapas
    Los mapas modelan un objeto a través de una llave y un valor.Esto significa que cada valor de
    nuestro mapa, va a tener una llave única para representar dicho valor.Las llaves de nuestro mapa no pueden repetirse, pero los valores sí.Un ejemplo sería una persona que tiene su DNI

    /RUT(llave única)

    y como valor puede ser su nombre completo, puede haber dos personas con el
    mismo nombre, pero nunca con el mismo DNI/RUT.
    Los mapas al tener dos datos, también vamos a tener que especificar el tipo de dato tanto de la
    llave y del valor, pueden ser de tipos de datos distintos. A la hora de crear un mapa tenemos que
    pensar que el primer tipo dato será el de la llave y el segundo el valor.
    Son una de las estructuras de datos importantes del Framework de Collections. Las
    implementaciones de mapas son HashMap, TreeMap, LinkedHashMap y HashTable.*/
    //HASHMAP 
    /*Es un mapa implementado a través de una tabla hash, las llaves se almacenan utilizando un
    algoritmo de hash solo para las llaves y evitar que se repitan.*/
    //HashMap<llave,valor> identificador = new HashMap();
    HashMap<Integer, String> identificador = new HashMap();

    //TreeMap
    //Es un mapa que ordena los elementos de manera ascendente a través de las llaves.
    TreeMap<Integer, String> personaB = new TreeMap();

    //LINKEDHASHMAP
    //Es un HashMap que conserva el orden de inserción.
    LinkedHashMap<Integer, String> personaC = new LinkedHashMap();
    
    
    //AÑADIR UN ELEMENTO A UNA COLECCIÓN
    
    /*Las colecciones constan con funciones para realizar distintas operaciones, en este caso si
    queremos añadir un elemento a las listas o conjuntos vamos a tener que utilizar la función add(T).
    Sólo en el caso de los mapas vamos a utilizar la función put(llave,valor).*/
    
    
    public void Crear(){
    ArrayList<Integer> numeroA = new ArrayList(); //Lista de tipo Integer
    Integer n = 20;
    numeroA.add(n);
        
    }
    HashSet<Integer> numeroB = new HashSet(); 
    Integer y = 20;
    //numeroB.add(y);
    
    HashMap<Integer,String> alumnos = new HashMap();
    int dni = 21156294;
    String nombre = "Francisco Naranjo";
    //alumnos.put(dni,nombre); //Agregamos llave y valor
}
