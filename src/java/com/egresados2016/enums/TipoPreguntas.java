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
public enum TipoPreguntas {
     L("Laboral"),
    A("Academico");
    
    private String nom;

    private TipoPreguntas(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    

    

    
    
}
