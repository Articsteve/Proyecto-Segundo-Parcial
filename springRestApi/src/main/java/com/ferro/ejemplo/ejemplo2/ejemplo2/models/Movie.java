/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Luis Esteban
 */

@Document(collection = "movies")

public class Movie {
    @Id
    String id;
    String title;
    Integer year;
    String imdb;
    String type;
    public Movie(){}
    public Movie(String title, Integer year, String imdb, String type){
        this.title = title;
        this.year = year;
        this.imdb = imdb;
        this.type = type;
    }
    
    //Geters
    public String getId(){ return this.id;}
    public String getTitle(){return this.title;}
    public Integer getYear(){return this.year;}
    public String getIMDB(){return this.imdb;}
    public String getType(){return this.type;}
    
    //Seters
    public void setId(String id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setYear(Integer year){this.year = year;}
    public void setIMDB(String imdb){this.imdb = imdb;}
    public void setType(String type){this.type = type;}
}
