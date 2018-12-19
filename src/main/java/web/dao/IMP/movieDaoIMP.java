package web.dao.IMP;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.dao.movieDao;
import web.entity.tMovie;
import web.entity.tPerformance;


import java.util.List;

@SuppressWarnings({"JpaQlInspection", "unchecked"})
@Repository
public class movieDaoIMP implements movieDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public movieDaoIMP(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public tMovie getMovieById(int movieId) {
        return (tMovie) getCurrentSession().get(tMovie.class,movieId);
    }
    public List<tMovie> getAllMovies(){
        String queryStr="from tMovie";
        Query query = getCurrentSession().createQuery(queryStr);
        return query.list();
    }
    public List<tPerformance> getMovieShows(int movidId){
        tMovie tMovie = getMovieById(movidId);
        Hibernate.initialize(tMovie.gettPerformanceList());      //????重要内容????
        return  tMovie.gettPerformanceList();
    }
}
