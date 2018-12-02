package web.service.IMP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.userDao;
import web.entity.User;
import web.service.userService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class userServiceIMP implements userService {

    @Autowired
    private userDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    public User getUserByUsername(String username){
        List<User> users = userDao.getUserByUsername(username);
        return users.size()==0?null:users.get(0);
    }
    public User userLogin(String username,String password){
        List<User> users = userDao.userLogin(username,password);
        return users.size()==0?null:users.get(0);
    }
    public boolean userRegister(User user){
        Date now = new Date();
        user.setUserType(1);
        user.setRegTime(now);
        if(userDao.getUserByUsername(user.getUsername()).size()==0){
            userDao.saveUser(user);
            return true;
        }
        else return false;
    }
}
