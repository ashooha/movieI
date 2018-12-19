package web.service.IMP;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.movieDao;
import web.entity.tMovie;
import web.entity.tPerformance;
import web.pageModle.Movie;
import web.pageModle.Performance;
import web.service.movieService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class movieServiceIMP implements movieService {

    @Autowired
    private movieDao movieDao;

    public tMovie getMovieById(int movieId){
        return movieDao.getMovieById(movieId);
    }
    public List<Movie> getAllMovies(){
        List<tMovie> tMovies = movieDao.getAllMovies();
        List<Movie> movies = new ArrayList<>();
        for(tMovie tm: tMovies){
            Movie movie = new Movie();
            BeanUtils.copyProperties(tm,movie);
            Set<Integer> perIds=new HashSet<>();
            if (tm.gettPerformanceList()!=null){
                for(tPerformance tpi:tm.gettPerformanceList()){
                    perIds.add(tpi.getId());
                }
            }
            movie.setPerformanceIdList(perIds);
            movies.add(movie);
        }
        return movies;
    }
    public List<Performance> getMovieShows(int movieId){
        List<tPerformance> tPerformances =  movieDao.getMovieShows(movieId);
        List<Performance> performances = new ArrayList<>();
        for(tPerformance tp:tPerformances){
            Performance performance = new Performance();
            BeanUtils.copyProperties(tp,performance);

            performances.add(performance);
        }
        return performances;
    }
}
