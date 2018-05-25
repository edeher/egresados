/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.modelo;

/**
 *
 * @author Mi Laptop
 */
public class Estadistica {
    private String descripcion;
    private int valor;

    public Estadistica(String descripcion, int valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public Estadistica() {
    }

    @Override
    public String toString() {
        return "estadistica{" + "descripcion=" + descripcion + ", valor=" + valor + '}';
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
