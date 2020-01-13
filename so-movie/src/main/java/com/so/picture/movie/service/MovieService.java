package com.so.picture.movie.service;

import com.so.picture.movie.entry.Movie;
import com.so.picture.movie.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieMapper movieMapper;

    public Movie getMovieByID(int movieId){
        return movieMapper.queryMovieById(movieId);
    }
}
