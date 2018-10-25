/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;

import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.ReviewRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Review;
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
public class ReviewerController {
    @Autowired
    ReviewRepository reviewRepository;
    
    
    @RequestMapping(method=RequestMethod.GET, value="/api/review")
    public Iterable<Review> product() {
        return reviewRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/api/review")
    public String save(@RequestBody Review product) {
        reviewRepository.save(product);
        return product.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/api/review/{id}")
    public Review show(@PathVariable String id) {
        return reviewRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/api/review/{id}")
    public Review update(@PathVariable String id, @RequestBody Review review) {
        Review rev = reviewRepository.findById(id).get();
        if(review.getId() != null)
            rev.setId(review.getId());
        if(review.getRating() != null)
            rev.setRating(review.getRating());
        if(review.getReviewer() != null)
            rev.setReviewer(review.getReviewer());
        if(review.getText() != null)
            rev.setText(review.getText());
        reviewRepository.save(rev);
        return rev;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/api/review/{id}")
    public String delete(@PathVariable String id) {
        Review rev = reviewRepository.findById(id).get();
        reviewRepository.delete(rev);

        return "review deleted";
    }

}
