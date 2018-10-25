/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.repositories;

import com.ferro.ejemplo.ejemplo2.ejemplo2.models.MovieDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Luis Esteban
 */
public interface MovieDetailsRepository extends MongoRepository<MovieDetails, String>{
    @Override
    public Optional<MovieDetails> findById(String id);
    @Override
    void delete(MovieDetails deleted);
}
