/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egresados2016.enums;

/**
 *
 * @author Mi Laptop
 */
public enum TipoJornada {
    JC("JORNADA A TIEMPO COMPLETO"),
    JP("JORNADA A TIEMPO PARCIAL O MEDIO TIEMPO"),
    JH("JORNADA PARCIAL POR HORAS");
    private String nom;

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    private TipoJornada(String nom) {
        this.nom = nom;
    }
    
}
