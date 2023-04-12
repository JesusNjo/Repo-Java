/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author JesusNjo
 */
public class Productos {
    
    private String[] comidaSeca;
    private String[] carnes;
    private double[] comidaPrecios;
    private double[] carnePrecios;

    public Productos(String[] comidaSeca, String[] carnes, double[] comidaPrecios, double[] carnePrecios) {
        this.comidaSeca = comidaSeca;
        this.carnes = carnes;
        this.comidaPrecios = comidaPrecios;
        this.carnePrecios = carnePrecios;
    }

    public Productos() {
    }

    public String[] getComidaSeca() {
        return comidaSeca;
    }

    public void setComidaSeca(String[] comidaSeca) {
        this.comidaSeca = comidaSeca;
    }

    public String[] getCarnes() {
        return carnes;
    }

    public void setCarnes(String[] carnes) {
        this.carnes = carnes;
    }

    public double[] getComidaPrecios() {
        return comidaPrecios;
    }

    public void setComidaPrecios(double[] comidaPrecios) {
        this.comidaPrecios = comidaPrecios;
    }

    public double[] getCarnePrecios() {
        return carnePrecios;
    }

    public void setCarnePrecios(double[] carnePrecios) {
        this.carnePrecios = carnePrecios;
    }

   
    
    
    
}
