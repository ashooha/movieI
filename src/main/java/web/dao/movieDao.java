package web.dao;

import web.entity.tMovie;
import web.entity.tPerformance;

import java.util.List;

public interface movieDao {
    tMovie getMovieById(int movieId);
    List<tMovie> getAllMovies();
    List<tPerformance> getMovieShows(int movieId);
}
