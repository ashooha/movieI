package web.service.IMP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.movieDao;
import web.entity.Movie;
import web.entity.Performance;
import web.service.movieService;

import java.util.List;

@Service
@Transactional
public class movieServiceIMP implements movieService {

    @Autowired
    private movieDao movieDao;

    public Movie getMovieById(int movieId){
        return movieDao.getMovieById(movieId);
    }
    public List<Movie> getAllMovies(){
        List<Movie> movies= movieDao.getAllMovies();
        return movies;
    }
    public List<Performance> getMovieShows(int movieId){
        return movieDao.getMovieShows(movieId);
    }
}
