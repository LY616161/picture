package com.so.picture.movie.controller;

import com.so.picture.movie.entry.Movie;
import com.so.picture.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable("id") int id){
        return movieService.getMovieByID(id);
    }
}
