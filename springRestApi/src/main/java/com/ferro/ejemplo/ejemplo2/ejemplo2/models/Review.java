/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Luis Esteban
 */
@Document(collection = "reviews")

public class Review {
    @Id
    String id;
    Integer rating;
    Date date;
    String reviewer;
    String text;
    public Review(){}
    
    //Getters
    public String getId(){return this.id;}
    public Integer getRating(){return this.rating;}
    public Date getDate(){return this.date;}
    public String getReviewer(){return this.reviewer;}
    public String getText(){return this.text;}
    
    //Setters
    public void setId(String id){this.id = id;}
    public void setRating(Integer rating){this.rating = rating;}
    public void setDate(Date date){this.date = date;}
    public void setReviewer(String reviewer){this.reviewer = reviewer;}
    public void setText(String text){this.text = text;}
    
}
