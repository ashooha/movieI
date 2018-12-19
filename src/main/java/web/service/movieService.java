package web.service;

import web.entity.tMovie;
import web.entity.tPerformance;
import web.pageModle.Movie;
import web.pageModle.Performance;

import java.util.List;

public interface movieService {
    tMovie getMovieById(int movieId);
    List<Movie> getAllMovies();
    List<Performance> getMovieShows(int movieId);
}
