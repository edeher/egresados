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
public enum Estados {

    
    A("Activo"),
    N("No_activo"),
    E("En_espera"),
    D("Registrado en DINA");
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

    private Estados(String nom) {
        this.nom = nom;
    }

}
