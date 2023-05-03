/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccions;

/**
 *
 * @author JesusNjo
 */
public class ColecClass {

    String marca;
    String modelo;
    Integer anio;
    String placa;

    public ColecClass() {
    }

    public ColecClass(String marca, String modelo, Integer anio, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio + "\nPlaca: " + placa;
    }
}
