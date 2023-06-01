/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author JesusNjo
 */
public class Rectangulo extends Abstract {

    private double lado;
    
    @Override
    protected double crearArea() {
        return lado * lado;
    }
    
}
