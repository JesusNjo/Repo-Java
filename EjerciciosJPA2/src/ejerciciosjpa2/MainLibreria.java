/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjpa2;


import ejerciciosjpa2.Services.Menu;


/**
 *
 * @author JesusNjo
 */
public class MainLibreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Menu crearMenu = new Menu();

        crearMenu.menu();
    }

}
