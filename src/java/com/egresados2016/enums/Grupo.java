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
public enum Grupo {
    SI("POSITIVA"),
    NO("NEGATIVA");
    
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

    private Grupo(String nom) {
        this.nom = nom;
    }

    
    
}
