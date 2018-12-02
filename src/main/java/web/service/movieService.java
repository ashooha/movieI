package web.service;

import web.entity.Movie;
import web.entity.Performance;

import java.util.List;

public interface movieService {
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
    List<Performance> getMovieShows(int movieId);
}
