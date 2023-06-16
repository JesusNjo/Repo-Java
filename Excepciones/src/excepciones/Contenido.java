/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JesusNjo
 */
public class Contenido {
    
    
    public void leerArchivo() throws FileNotFoundException{
       
        File archivo = new File("C:\\Users\\JesusNjo\\Documents\\texto");
        
        FileReader fr = new FileReader(archivo);
    }
    
    
    
    public void leerArchivo2() throws IOException{
        leerArchivo();
    }
}
