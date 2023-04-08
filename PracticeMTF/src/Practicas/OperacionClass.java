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

// CREAMOS EL OBJETO
public class OperacionClass {
    
    // INICIALIZAMOS LOS VALORES DEL OBJETO
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;
    // CREAMOS SU CONSTRUCTOR CON VALORES
    public OperacionClass(int num1,int num2, int suma, int resta, int multiplicacion, int division){
        
        this.num1 = num1;
        this.num2 = num2;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }
    // CREAMOS SU CONSTRUCTOR VACIO
    public OperacionClass() {
    }
    // INICIALIZAMOS LOS GETTERS Y SETTERS
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
    
}
