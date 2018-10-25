/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Luis Esteban
 */
@Document
public class imdb {
    @Id
    String id;
    double rating;
    Integer votes;
    public imdb(String id, double rating, Integer votes){
        this.id = id;
        this.rating = rating;
        this.votes = votes;
    }
    public imdb(){}
    //Geters
    public String getId(){return this.id;}
    public double getRating(){return this.rating;}
    public Integer getVotes(){return this.votes;}
    //Seters
    public void setId(String id){this.id = id;}
    public void setRating(double rating){this.rating = rating;}
    public void setVotes(Integer votes){this.votes = votes;}
}
