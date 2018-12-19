package web.service.IMP;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.userDao;
import web.entity.tUser;
import web.pageModle.User;
import web.service.userService;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class userServiceIMP implements userService {

    @Autowired
    private userDao userDao;

    public tUser getUserById(int id){
        return userDao.getUserById(id);
    }
    public tUser getUserByUsername(String username){
        List<tUser> tUsers = userDao.getUserByUsername(username);
        return tUsers.size()==0?null: tUsers.get(0);
    }
    public User userLogin(User user){
        List<tUser> tUsers = userDao.userLogin(user.getUsername(),user.getPassword());
        if(tUsers.size()==0){
            return null;
        }
        User u = new User();
        BeanUtils.copyProperties(tUsers.get(0),u);
        return u;
    }
    public boolean userRegister(tUser tUser){
        Date now = new Date();
        tUser.setUserType(1);
        tUser.setRegTime(now);
        if(userDao.getUserByUsername(tUser.getUsername()).size()==0){
            userDao.saveUser(tUser);
            return true;
        }
        else return false;
    }
}
