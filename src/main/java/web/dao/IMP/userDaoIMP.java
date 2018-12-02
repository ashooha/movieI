package web.dao.IMP;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.dao.userDao;
import web.entity.User;

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

    public User getUserById(int userId){
        return (User) sessionFactory.getCurrentSession().get(User.class,userId);
    }
    public List<User> getUserByUsername(String username){
        String queryStr = "from User u where u.username = '" + username+"'";
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
        return (List<User>)query.list();
    }
    public List<User> userLogin(String username, String password){
        String queryStr = "from User u Where u.username='"+username+"' and u.password='"+password+"'";
        Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
        return (List<User>)query.list();
    }
    public void saveUser(User user){
        sessionFactory.getCurrentSession().save(user);
    }
}
