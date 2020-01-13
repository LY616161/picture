package com.so.picture.movie.mapper;

import com.so.picture.movie.entry.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MovieMapper {
    @Select("SELECT movie_name movieName,movie_director movieDirector,release_date releaseDate FROM movie_info where movie_id = #{movieId}")
    Movie queryMovieById(@Param("movieId") int movieId);
}
