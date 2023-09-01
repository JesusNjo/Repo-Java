/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JesusNjo
 */
public class API {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String json = "";
       
       String linea = "";
        BufferedReader br = new BufferedReader(new FileReader("ejemplo.json"));
        
       while((linea = br.readLine()) != null){
           json+= linea;
       }
       
        System.out.println(json);
    }
    
}
