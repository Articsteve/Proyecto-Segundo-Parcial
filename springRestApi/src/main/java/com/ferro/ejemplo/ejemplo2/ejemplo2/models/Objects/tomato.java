/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
    

/**
 *
 * @author Luis Esteban
 */
@Document
public class tomato {
    Integer meter;
    String image;
    double rating;
    Integer reviews;
    Integer fresh;
    String consensus;
    Integer userMeter;
    double userRating;
    Integer userReviews;
    public tomato(Integer meter, String image, double rating, Integer reviews,
                  Integer fresh, String consensus, Integer userMeter, double userRating,
                  Integer userReviews){
        this.meter = meter;
        this.image = image;
        this.rating = rating;
        this.reviews = reviews;
        this.fresh = fresh;
        this.consensus = consensus;
        this.userMeter = userMeter;
        this.userRating = userRating;
        this.userReviews = userReviews;
    }
    public tomato(){}
    //Geters
    public Integer getMeter(){return this.meter;}
    public String getImage(){return this.image;}
    public double getRating(){return this.rating;}
    public Integer getReviews(){return this.reviews;}
    public Integer getFresh(){return this.fresh;}
    public String getConsensus(){return this.consensus;}
    public Integer getUserMeter(){return this.userMeter;}
    public double getUserRating(){return this.userRating;}
    public Integer getUserReviews(){return this.userReviews;}
    //Seters
    public void setMeter(Integer meter){this.meter = meter;}
    public void setImage(String image){this.image = image;}
    public void setRating(double rating){this.rating = rating;}
    public void setReviews(Integer reviews){this.reviews = reviews;}
    public void setFresh(Integer fresh){this.fresh = fresh;}
    public void setConsensus(String consensus){this.consensus = consensus;}
    public void setUserMeter(Integer userMeter){this.userMeter = userMeter;}
    public void setUserRating(double userRating){this.userRating = userRating;}
    public void setUserReviews(Integer userReviews){this.userReviews = userReviews;}
}
