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
public class Circulo implements Interface, Rotable,Dibujable{

    private double radio;
    
    
    protected double crearArea() {
        
        return Math.PI * radio * radio;
    }

    @Override
    public void rotar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
// implements