/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.Interface;

/**
 *
 * @author JesusNjo
 */
public class Rectangulo implements Interface{

    private double lado;
   
    protected double crearArea() {
        return lado * lado;
    }

    @Override
    public void rotar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
