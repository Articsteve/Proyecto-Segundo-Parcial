/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Luis Esteban
 */
@Document
public class award {
    Integer wins;
    Integer nominations;
    String text;
    public award(Integer wins, Integer nominations, String text){
        this.wins = wins;
        this.nominations = nominations;
        this.text = text;
    }
    public award(){}
    //Geters
    public Integer getWins(){return this.wins;}
    public Integer getNominations(){return this.nominations;}
    public String getText(){return this.text;}
    //Seters
    public void setWins(Integer wins){this.wins = wins;}
    public void setNominations(Integer nominations){this.nominations = nominations;}
    public void setText(String text){this.text = text;}
}
