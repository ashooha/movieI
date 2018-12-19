package web.dao.IMP;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.dao.userDao;
import web.entity.tUser;

import java.util.List;


@SuppressWarnings({"JpaQlInspection", "unchecked"})
@Repository
@Transactional
public class userDaoIMP implements userDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public userDaoIMP(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public tUser getUserById(int userId){

        return (tUser)getCurrentSession().get(tUser.class,userId);
    }
    public List<tUser> getUserByUsername(String username){
        String queryStr = "from tUser u where u.username = '" + username+"'";
        Query query = getCurrentSession().createQuery(queryStr);
        return (List<tUser>)query.list();
    }
    public List<tUser> userLogin(String username, String password){
        String queryStr = "from tUser u Where u.username='"+username+"' and u.password='"+password+"'";
        Query query = getCurrentSession().createQuery(queryStr);
        return (List<tUser>)query.list();
    }
    public void saveUser(tUser tUser){
        getCurrentSession().save(tUser);
    }
}
