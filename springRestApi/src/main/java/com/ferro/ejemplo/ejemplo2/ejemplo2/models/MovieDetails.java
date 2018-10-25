/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.models;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects.award;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects.imdb;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Objects.tomato;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    /**
 *
 * @author Luis Esteban
 */

@Document(collection = "movieDetails")

public class MovieDetails {
    @Id
    String id;
    String title;
    Integer year;
    String rated;
    Date released;
    Integer runtime;
    String[]countries;
    String[]genres;
    String director;
    String[]writers;
    String[]actors;
    String plot;
    String poster;
    @DBRef imdb imdb;
    @DBRef tomato tomato;
    Integer metacritic;
    @DBRef award awards;
    String type;
    public MovieDetails(
        String title, Integer year, String rated,
        Date released, Integer runtime, String[]countries,
        String[]genres, String director, String[]writers,
        String[]actors, String plot, String poster,
        imdb imdb, tomato tomato, Integer metacritic,
        award awards,String type){
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.countries = countries;
        this.genres = genres;
        this.director = director;
        this.writers = writers;
        this.actors = actors;
        this.plot = plot;
        this.poster = poster;
        this.imdb = imdb;
        this.tomato = tomato;
        this.metacritic = metacritic;
        this.awards = awards;
        this.type = type;
    }
    public MovieDetails(){}
    //Geters
    
    public String getId(){return this.id;}
    public String getTitle(){return this.title;}
    public Integer getYear(){return this.year;}
    public String getRated(){return this.rated;}
    public Date getReleased(){return this.released;}
    public Integer getRuntime(){return this.runtime;}
    public String[] getCountries(){return this.countries;}
    public String[] getGenres(){return this.genres;}
    public String getDirector(){return this.director;}
    public String[] getWriters(){return this.writers;}
    public String[] getActors(){return this.actors;}
    public String getPlot(){return this.plot;}
    public String getPoster(){return this.poster;}
    public imdb getIMDB(){return this.imdb;}
    public tomato getTomato(){return this.tomato;}
    public Integer getMetacritic(){return this.metacritic;}
    public award getAwards(){return this.awards;}
    public String getType(){return this.type;}
    //Seters
    
    public void setId(String id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setYear(Integer year){this.year = year;}
    public void setRated(String rated){this.rated = rated;}
    public void setReleased(Date released){this.released = released;}
    public void setRuntime(Integer runtime){this.runtime = runtime;}
    public void setCountries(String[]countries){this.countries = countries;}
    public void setGenres(String[]genres){this.genres = genres;}
    public void setDirector(String director){this.director = director;}
    public void setWriters(String[]writers){this.writers = writers;}
    public void setActors(String[]actors){this.actors = actors;}
    public void setPlot(String plot){this.plot = plot;}
    public void setPoster(String poster){this.poster = poster;}
    public void setIMDB(imdb imdb){this.imdb = imdb;}
    public void setTomato(tomato tomato){this.tomato = tomato;}
    public void setMetacritic(Integer metacritic){this.metacritic = metacritic;}
    public void setAwards(award awards){this.awards = awards;}
    public void setType(String type){this.type = type;}
    
}
    