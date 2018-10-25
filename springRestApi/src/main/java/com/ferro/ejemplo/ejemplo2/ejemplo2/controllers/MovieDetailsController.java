/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;
import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.MovieDetailsRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.MovieDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis Esteban
 */

@RestController
public class MovieDetailsController {
    @Autowired
    MovieDetailsRepository MovieDetailsRepository;

    @RequestMapping(method=RequestMethod.GET, value="/api/movieDetails")
    public Iterable<MovieDetails> product() {
        return MovieDetailsRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/api/movieDetails")
    public String save(@RequestBody MovieDetails md) {
        MovieDetailsRepository.save(md);

        return md.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/api/movieDetails/{id}")
    public MovieDetails show(@PathVariable String id) {
        return MovieDetailsRepository.findById(id).get();
    }
    

    @RequestMapping(method=RequestMethod.PUT, value="/api/movieDetails/{id}")
    public MovieDetails update(@PathVariable String id, @RequestBody MovieDetails md) {
        MovieDetails movDet = MovieDetailsRepository.findById(id).get();
        if(md.getTitle() != null)
            movDet.setTitle(md.getTitle());
        if(md.getYear() != null)
            movDet.setYear(md.getYear());
        if(md.getRated() != null)
            movDet.setRated(md.getRated());
        if(md.getReleased() != null)
            movDet.setReleased(md.getReleased());
        if(md.getRuntime() != null)
            movDet.setRuntime(md.getRuntime());
        if(md.getCountries() != null)
            movDet.setCountries(md.getCountries());
        if(md.getGenres() != null)
            movDet.setGenres(md.getGenres());
        if(md.getDirector() != null)
            movDet.setDirector(md.getDirector());
        if(md.getWriters() != null)
            movDet.setWriters(md.getWriters());
        if(md.getActors() != null)
            movDet.setActors(md.getActors());
        if(md.getPlot() != null)
            movDet.setPlot(md.getPlot());
        if(md.getPoster() != null)
            movDet.setPoster(md.getPoster());
        if(md.getIMDB() != null)
            movDet.setIMDB(md.getIMDB());
        if(md.getTomato() != null)
            movDet.setTomato(md.getTomato());
        if(md.getMetacritic() != null)
            movDet.setMetacritic(md.getMetacritic());
        if(md.getAwards() != null)
            movDet.setAwards(md.getAwards());
        if(md.getType() != null)
            movDet.setType(md.getType());
        MovieDetailsRepository.save(movDet);
        return movDet;
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/api/moviesDetails/{id}")
    public String delete(@PathVariable String id) {
        MovieDetails movDet = MovieDetailsRepository.findById(id).get();
        MovieDetailsRepository.delete(movDet);
        return "movie details deleted";
    }
}
