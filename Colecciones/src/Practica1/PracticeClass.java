/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

/**
 *
 * @author JesusNjo
 */
public class PracticeClass {
    
    private String nombreCliente;
    private int cuentaCliente;
    private int saldoCliente;

    public PracticeClass() {
    }
    
    
    public PracticeClass(String nombreCliente,int cuentaCliente, int saldoCliente){
        this.nombreCliente = nombreCliente;
        this.cuentaCliente = cuentaCliente;
        this.saldoCliente = saldoCliente;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public int getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(int cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }

    public int getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(int saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
    
    @Override
    public String toString() {
        return "\n:Nombre cliente " +nombreCliente +"\n:Nº de cuenta " +cuentaCliente +"\n:Saldo disponible " +saldoCliente;
    }
}
