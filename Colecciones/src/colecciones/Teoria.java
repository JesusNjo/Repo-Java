/*
Colecciones!
representa un grupo de objetos (elementos). restriccion, 
no se puede usar int (tipo primitivo) si no que usaremos integer (objetos).

Son Muchas cajoneras (objetos) en un almacen (coleccion)
Las Clases de java nos dan herramientas(metodos) para almacenar los onbjetos. 
las colecciones crecen de manera dinamica, no necesitamos saber cuantos objetos van a ir a esa coleccion.

java collections framework dentro del paquete de java.util, donde estan las collecciones que usaremos. 
((cuando trabajábamos con un objeto, solo podíamos modificar el atributo de ese objeto,
pero no podíamos crear dos objetos y modificar los datos de los dos. las colecciones nos permiten modificar los atributos de los objetos que querramos
sin necesidad de ponerle un limite como los vectores, seria como un vector que va creciendo a medida que le agregamos objetos.))

java collections framework : imagen pag 4

nos centraremos en las listas, los conjuntos y mapas. veremos el uso del iterable.

LISTAS

Control del lugar donde estan los objetos, pueden guardar elementos duplicados.
 
Arraylist, tamaño variable, se agregan objetos este crece.
/EJ: ArrayList <Interger> nombre = new ArrayList();

linkendlist, lista de doble enlase, se agregan y restan mejor que en arraylist, mal en set y get. permite recorrerla de adelante hacia atras y viceversa.
LinkedList<Interger> nombre = new LinkedList();

CONJUNTOS O SET 

Modelan una coleccion de objetos de la misma clase donde no hay duplicados. 
Tipos de conjuntos:

- hashset : utiliza una tabla hash para darle un valor unico a cada elemento, 
evitando los duplicados. HASHSET CREA UN CODIGO HASH PARA CADA VALOR. no tiene sus elemntos ordenados.
un hash es un algoritmo matematico que transforma cualquier bloque de dato es una nueva serie de caracteres alfanumericos con longitud fija, sin importar la longitud de entrada. 
/EJ: zorro = asdf23d 
/EJ: zorro corre rapido = 23asde2
/EJ CODIGO : HashSet <String> nombre = new HashSet(); (Este es de cadena)

- treeset : utiliza una estructura de arbol, 
la diferencia con el hashset es que el treeset mantiene sus elementos de forma ordenada (ascendente) 
y los metodos de agregar o eliminar son mas lentos (por el ordenamiento), no admite duplicados.
/EJ: TreeSet <String> nombre = new TreeSet();

- linkedhashset : tiene una mezcla de los anteriores, es una tabla hash pero con orden de insercion.
/EJ: LinkedHashSet <String> nombre = new LinkedHashSet();

MAPAS
 
Modelan un objeto con una llave unica (DNI) para cada valor (nombre de persona),
donde ambos valores pueden ser diferentes valores y de distintos tipos, por ellos hay que especificarlos 
(primero la lleve despues el valor). El valor de las llaves no pueden repetirse. 
Tipos de Maps:

- HashMap : Se forma a traves de una tabla hash, donde las llaves se guardan
con un algoritmo hash para evitar que se repitan.
/EJ : HashMap<Tipo llave , tipo valor> nombre = new HasMap();

-TreeMap : ordena los elementos de manera ascendente (de menor a mayor) con los datos de  las llaves.
EJ : igual al HashMap;

-LinkedHashMap : un HashMap que tiene orden de insercion.
EJ : igual al HashMap;

correccion de herrores (pag6-7)

Array<int> listado = new ArrayList;
TreeSet<String> = TreeSet();
HashMap<Integer> personas = new HashMap<>

corregido

ArrayList <Integer> listado = new ArrayList();
TreeSet <String> = new TreeSet();
HashMap <Integer> personas = new HashMap();

AÑADIR UN ELEMENTO A UNA COLECCION

Para añadir un elemento a una lista o conjunto usaremos la funcion add(T), 
en los mapas usaremos la funcion put(llave,valor).
/EJ LISTAS:  ArrayList <Interger> numero = new ArrayList(); 
             int x = 20 ;
		    numero.add(x);
/EJ COLEECCIONES : HashSet <String> nombre = new HashSet();
				String a = "Hola";
				nombre.add(a);
/EJ MAPAS: HashMap<Integer, String> Persona = new HashMap();
         Integer DNI = 42691267;
         String Nombre = "camila";
         Persona.put(DNI, Nombre);

ELIMINAR UN ELEMENTO DE UNA COLECCION

LISTAS : 
Tiene dos metodos:
Remove(int indice): borra el elemento de un indice especifico, y mueve los elementos asi no quedan espacios vacios.
remove(elemento): remueve la primera aparicion de un elemento a borrar en una lista.

CONJUNTOS:
Solo se puede borrar por elemnto ya que no tiene indices. remove(elemento);

MAPAS : 
Podemos remover los elementos por su llave, ya que este los hace unicos. remove(llave).
			
RECORRER UNA COLECCION

para mostrar todos los elementos que tenemos en nuestra coleccion hay que recorrerla. Se utiliza el forEach. Para mapas se usara el MAp.Entry que recorrera las llaves y los elementos, si no se puede usar un forEach para cada una.

ATAJOS!!!!
fore tab (for each)
lka tab (java.util.collection)
St tab String	
asort tab (java.util.arrays)
cs tab swich case 

ITERATOR 

Pertenece al framework de colecciones. nos deja recorrer, ver la info y eliminar un elemento de una coleccion, cosa que no se puede con el forEach. Todas las colecciones tienen un metodo iterator. donde la collecion es recibida por el objeto iterator y usando este objeto podemos iterar en nuestra coleccion (modificamos a traves del objeto iterator nuestra coleccion). Para ello debemos crear el objeto iterator con los mismos datos que nuestra coleccion. 

Los tres metodos utiles del iterator:

Boolean hasNext(): devuelve true si quedan elementos por iterar.

Object Next(): DEvuelve el elemento que sigue en la coleccion (si Boolean es true, nos deja ver el elemento y detectar cual ahay que iterar).

void remove(): elimina el elemnto actual de la coleccion.

/EJ: (main) Iterator interator = lista.iterator(); (creamos el iterator)
		sout ("Elementos de la lista")
		While(iterator.hasNext()){ (si el hasnext devuelve true mostramos los elementos con un while)
		sout (iterator.next());	(cierra el while)

ELIMINAR CON ITERATOR

En los mapas no podemos borrar mientras iteramos, con las demas colecciones si.

/EJ: (main)  LISTAS 
		ArrayList <String> palabras = new ArrayList <>();
		Iterator<String> it = palabras.iterator();
		while (it.hasNext()) {
			if (it.next().equals("hola")) { 
			it.remove();
(cierre de while e if)
 
/EJ: (main)  CONJUNTOS 
		HashSet <Integer> numset = new HashSet<>();
		Iterator <Integer> it2 = numset.iterator();
		while (it2.hasNext()) {
			if (it2.next() == 3) {
			it2.remove();
(cierre de while e if)

ORDENAR UNA COLECCION 

Los elementos que vamos guardando se almacenan en la coleccion como uno los va agregando, si necesitamos mostrarlos o tenerlos ordenados usamos la suncion Collection.sort(coleccion), lo que hace es recibir los elementos y ordenarlos de manera ascendente. Los conjuntos o mapas no pueden usar sort(). Por ejemplo el HashSet maneja valores Hash que el sort() no sabe ordenar (aparte de que ya se ordenan cuando se crea el conjunto), con los mapas el sort() se confunde ya que tiene dos datos (llaves,elementos) y no sabe por cual de los dos tatos ordenar. Entonces para ordenarlos vamos a convertir a los conjuntos en listas, y a los mapas vamos a cambiarlos de HashMap a un TreeMap(que se ordena solo).

/EJ: LISTAS
	ArrayList <Integer> num = new ArrayList();
	Collections.sort(num);
/EJ: CONJUNTOS 
	HashSet <Integer> numSet = new HashSet();
	ArrayList <Integer> numLista = new ArrayList(numSet);
	Collections.sort(numLista);
/EJ: MAPAS 
	HashMap<Integer, String> alumnos = new HashMap();
	TreeMap<Integer,String> alumnostree = new TreeMap();

COLECCIONES CON OBJETOS CREADOS POR NOSOTROS

Crearemos una coleccion con objetos creados por nosotros, nos permite majenar varios objetos a la ves y acceder a ellos de una forma mas facil. EJ una lista Alumnos, llenandola por objetos Alumno con sus atributos.

AÑADIR UN OBJETO A UNA COLECCION

LISTAS

ArrayList<Libro (nombre de la clase objeto)> libros = new ArrayList();
Libro libro = new Libro(); (llamamos a la clase del objeto libro)
libros.add(libro); (añadimos los libros que iremos creando a la lista)

CONJUNTOS

HashSet<Perro> perros = new HashSet(); (creamos la lista)
Perro p1 = new Perro(); (llamamos a la clase del objeto libro)
perros.add(p1); (añadimos los libros que iremos creando a la lista)

MAPAS

HashMap<Integer,String> alumnos = new HashMap();
int dni = 258369147;
Alumno al = new Alumno(nombre,apellido); 
alumnos.put(dni,al);

RECORRER UNA COLECCION CON OBJETOS: Se utilizaran los mismos metodos pero al mostrar el objeto con el sout no vamos a ver sus atributos sino que vamos a ver el nombre de la clase, el del objeto, un @ y un codigo hash.

/EJ:  ArrayList <Libro> libross = new ArrayList();
	Libro li = new Libro;
	libros.add(li);
	for ( Libro Ejemplar : libross) {
	sout (ejemplar);
(cierre del forEach)

Por consola se ve : Libreria.Libro@1df5ds5

Para evitar esto vamos a utilizar el toString de la clase del objeto, que devuelve una cadena con los atributos del objeto.

	
COMPARATOR

no podemos usar sort() para ordenar nuestros objetos ya que este sirve para ordenar valores uniformes, nuestro obtetos pueden tener atributos de distinto clase por eso usaremos compare() en nuestra clase entidad.

si tenemos un bojeto perro, donde los atributos son su nombre y edad, y queremos ordenarlos por edad usamos un comare() de edades 


public static Comparator<Perro> compararEdad = new Caomparator<Perro>() {
	@Override
	public int compare (Perro p1, Perro p2) {
		return p2.getEdad().compareTo(p1.getEdad());
(cierre de ambas clases)

como el comparator se usa para ordenar las colecciones se una en el main en el sort().

/EJ: LISTAS
	ArrayList <Perro> perros= new ArrayList();
	perros.sort(Perro.CompararEdad);

/EJ: CONJUNTOS
	HashSet<Perro> perrosSet = nee HashSet<>();
	ArrayList<Perro> perrosLista = new ArrayList(perrosSet);
	perrosLista.sort(Perro.compararEdad);

COMPARATOR CON TREESET

a este conjunto necesitamos crearlo con un comparator ya que se ordena solo, pero le tenemos que decir bajo que parametros tiene que ordenarce.

/EJ: TREESET
	TreeSet<Perro> perrosconjunto = new TreeSet( Perro.compararEdad);
	Perro perro = new Perro();
	Perros.add(perro);
COMPARATOR EN MAPAS

/EJ: 
	HasMap<Integer,String> map = new HasMap();
	ArrayList<Alumnos> nombres = new ArrayList(map.values());
	nombres.sort(Alumno.compararDni);

COLECCIONES EN FUNCIONES

 debemos poner en los parametros el tipo de dato de la coleccion y que tipo de coleccion es.

/EJ: LISTAS
	public void llenarLista ( ArrayList<Integer> numeros){
	numeros.add(20)
(cierre de clase)
PARA LLAMARLA AL MAIN
		ArrayList<Interger> notas = new ArrayList();
		service.llenarLista(notas);
/EJ: CONJUNTOS
	public void llenarhashSet ( HashSet<Integer> numeros){
	numeros.add(20)
(cierre de clase)
PARA LLAMARLA AL MAIN
		HashSet<Interger> notas = new HashSet();
		service.llenarhashSet(notas);
/EJ: MAPAS
	public void llenarMap ( HashMap<Integer,String> alumnos){
	alumnos.put(1,"cami");
(cierre de clase)
PARA LLAMAR AL MAIN 
		HashMap<Integer,String> alumnos = new HashMap();
		service.llenarMap(alumnos);

DEVOLVER LA COLECCION EN FUNCIONES

Para esto necesitamos que el tipo de nuestra funcion sea la coleccion que queremos devolver y el tipo de dato con el que llenaremos dicha coleccion.

/EJ: LISTAS
	public ArrayList<Integer> llenarLista(){
		ArrayList<Integer> num = new ArrayList();
		num.add(20);
		return num;
/EJ: COLECCIONES
	public HashSet<String> llenarHashSet(){
		HashSet<String> pal = new HashSet();
		palabras.add("hola");
		return pal;
/EJ: MAPAS
	public HashMap<Integer,String> llenarMap(){
		HashMap<Integer,String> alumnos = new HashMap();
		alumnos.put(1,"cami");
		return alumnos;

***********CLASE COLLECTION***************

--frequency(Collection<T> 
coleccion, Objeto objeto)
Este método retorna la cantidad de veces que se encuentra 
un elemento especifico en una colección.
--reverse(List<T> lista) Este método invierte el orden de los elementos de una lista.
--reverseOrder() Este método retorna un comparator que invierte el orden de 
los elementos de una colección
--sort(List<T> lista) Este método ordena los elementos de una lista de manera 
ascendente.

**********EXTRAS (METODOS COLECCIONES)*********


---size()-- Este método retorna el tamaño de una lista / conjunto / mapa.
---clear()-- Este método se usa para remover todos los elementos de una 
lista / conjunto / MAPA.
---get(int índice)-- Este método retorna un elemento de la lista según un índice 
de la lista.
---get(Llave)-- Este método retorna un elemento del mapa según una llave 
dentro del mapa.
---set(int índice, elemento)-- Este método guarda un elemento en la lista en un índice 
especifico
---isEmpty()-- Este método retorna verdadero si la lista / conjunto / mapa está vacío 
y falso si no lo está
---contains(elemento) / containsKey(llave) / containsValue(valor)--
Este método recibe un elemento, llave o valor dado por el usuario y revisa 
si el elemento se encuentra en la lista o no. Si el elemento se 
encuentra retorna verdadero y si no falso
---values()
Este método crea una colección según los valores del mapa. 
Ósea, que retorna una lista, por ejemplo, con todos los 
valores del mapa

VIDEOS 
     video iterar y recorrer
para recorrer una coleccion y borrar un elemento se utiliza el for comun.
para recorrerla y mostrarla el foreach.

otra manera : nombres.forEach((e) -> sout (e)); (muestra)

min 13:00 explica como actualizar y eliminar un dato con funciones de colecciones a travez del for comun usando en ves de lenght el size.

     video comparator
sort ordena listas y conjuntos, aunque los conjuntos se ordenan.
shuffle mezcla listas. 
matris con colecciones : CODIGO
ArrayList(columnas)<ArrayList(filas)<String>> matriz = new ArrayList();

crear paquete de utilidades y clase comparadores, añadir un atributo statico.
CODIGO clase comparadores
public static Comparator<cualquiercosaacomparar> ordenarporcualquiercosa = new comparator<cualquiercosaacomparar> (control + spacio)
en el return ponemos la comparacion.
toma el primer objeto con el segundo, como en el video que compara nombres.
De esta manera en esta clase especifica podemos crear los comparadores que querramos.

para reordenar los elementos  de la lista:
collections.sort(mascotas, comparadores.ordenarpornombre);

shuffle hay uno comun, con este desordena aleatorio, se modifica cada ves que corremos el codigo.

     videos conjuntos set 


metodo de la clase objeto (equals and hashcode ) compara objetos, este genera un valor numerico que se le asigna a un objeto por sus atributos para.
equals compara las clases cuando entran a un conjunto, asi no se repiten.
TREESET (compara para ordenar)
en en nombre de la clase podemos agregar implement comparable<mascota> nos asigna un compareTo en la clase mascota por atributo pasamos la mascota y una variable del datoo nuevo y en el return comparamos el this.nombre(puede ser cualquiera) con el dato que ingresa pasado como parametro en el metodo como o en el video.

      videos Mapass

el mas usado hashmap. 
for + ctrl + espacio (for para mapas)
form +tab
dentro del for usamos dos variables una para la llave y otra para el valor y despues con un sout la mostramos por pantalla.
para usar mapas en la clase objeto tenemos que tenes el hashcode el equals y el compareble. de este modo dejamos completa nuestra clase objeto, asi en el main no salta tanto error.
 
 */
package colecciones;

/**
 *
 * @author JesusNjo
 */
public class Teoria {
    
}
