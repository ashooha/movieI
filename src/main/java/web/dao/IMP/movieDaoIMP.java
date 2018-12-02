package web.dao.IMP;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.dao.movieDao;
import web.entity.Movie;
import web.entity.Performance;

import java.util.List;

@Repository
public class movieDaoIMP implements movieDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Movie getMovieById(int movieId) {
        return (Movie) sessionFactory.getCurrentSession().get(Movie.class,movieId);
    }
    public List<Movie> getAllMovies(){
        String queryStr="from Movie";
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
        return query.list();
    }
    public List<Performance> getMovieShows(int movidId){
        Movie movie = getMovieById(movidId);
        Hibernate.initialize(movie.getPerformanceList());      //????重要内容????
        return  movie.getPerformanceList();
    }
}
