package web.dao;

import web.entity.Movie;
import web.entity.Performance;

import java.util.List;

public interface movieDao {
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
    List<Performance> getMovieShows(int movieId);
}
