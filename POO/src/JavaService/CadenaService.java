/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package JavaService;

import entidades.CadenaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CadenaService {

    Scanner input = new Scanner(System.in);

    public CadenaClass crearFrase() {

        CadenaClass frase = new CadenaClass();
        System.out.println("Ingrese su frase");
        frase.setFrase(input.nextLine());
        frase.setLongitud(frase.getFrase().length());
        return frase;
    }
    
    public void mostrarVocales(CadenaClass f){
        
        int contador = 0;
        for(int i = 0 ; i<f.getLongitud();i++){
            
        if("a".equalsIgnoreCase(f.getFrase().substring(i, i+1)) || "e".equalsIgnoreCase(f.getFrase().substring(i, i+1)) || "i".equalsIgnoreCase(f.getFrase().substring(i, i+1)) || "o".equalsIgnoreCase(f.getFrase().substring(i, i+1))||"u".equalsIgnoreCase(f.getFrase().substring(i, i+1))){
            contador++;
        }
        }
        System.out.println("Se contaron "+contador+" vocales");
    }
    
    public void invertirFrase(CadenaClass f){
        
        String inversion = "";
        for(int i= f.getLongitud()-1; i>=0; i--){
        
        inversion+= f.getFrase().substring(i,i+1);
        
    }
            System.out.println("La frase invertida es: "+inversion);
    }
    
    public void vecesRepetido(CadenaClass l){
        System.out.println("Ingrese el caracter que desea verificar si se repite");
        String carac = input.nextLine();
        int cont = 0;
        for(int i = 0; i<l.getLongitud();i++){
        
        if(l.getFrase().substring(i, i+1).equals(carac)){
            cont++;
        }
            
        }
        System.out.println("Se contabilizo la letra: ("+carac.toUpperCase()+") " +cont+" veces");
    }
    
    public void compararLongitud(CadenaClass c){
        Scanner input = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la nueva frase");
        frase=input.nextLine();
        
        if(frase.length() == c.getLongitud()){
            System.out.println("Las frases tienen la misma longitud");
        }else{
            System.out.println("Las frases tienen distintas longitudes");
        }
        String frase2 = c.getFrase();
        System.out.println(unirFrases(frase2,frase));
    }
    
    public String unirFrases(String frase1,String frase2){
        return frase1 + " / " + frase2; 
    }
    
    public void reemplazar(CadenaClass r){
        System.out.println("Ingrese el simbolo con lo que desea reemplazar la 'a'");
        String letra;
        letra = input.next();
        
        String cambio = r.getFrase().replace("a", letra);
        System.out.println("La nueva frase es :"+cambio);
   
    }
    
    public void contiene(CadenaClass c){
        boolean confirmacion = false;
        String letra;
        System.out.println("Ingrese la letra que desea detectar");
        letra = input.next();
        
        for(int i=0; i<c.getLongitud();i++){
        
            if(letra.equals(c.getFrase().substring(i, i+1))){
                confirmacion = true;
            }
            
    }
            System.out.println("Contiene la letra: ("+letra+")? ->"+confirmacion);
    }
}
