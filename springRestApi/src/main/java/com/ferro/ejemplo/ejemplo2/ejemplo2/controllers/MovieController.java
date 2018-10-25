/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;
import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.MovieRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Movie;
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
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(method=RequestMethod.GET, value="/api/movies")
    public Iterable<Movie> product() {
        return movieRepository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/api/movies")
    public String save(@RequestBody Movie movie) {
        movieRepository.save(movie);

        return movie.getId();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/api/movies/{id}")
    public Movie show(@PathVariable String id) {
        return movieRepository.findById(id).get();
    }
    

    @RequestMapping(method=RequestMethod.PUT, value="/api/movies/{id}")
    public Movie update(@PathVariable String id, @RequestBody Movie movie) {
        Movie mov = movieRepository.findById(id).get();
        if(movie.getTitle() != null)
            mov.setTitle(mov.getTitle());
            //prod.setProdName(product.getProdName());
        if(movie.getYear() != null)
            mov.setYear(movie.getYear());
        if(movie.getIMDB() != null)
            mov.setIMDB(movie.getIMDB());
        if(movie.getType() != null)
            mov.setType(movie.getType());
        movieRepository.save(mov);
        return mov;
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/api/movies/{id}")
    public String delete(@PathVariable String id) {
        Movie movie = movieRepository.findById(id).get();
        movieRepository.delete(movie);
        return "movie deleted";
    }
    
}
