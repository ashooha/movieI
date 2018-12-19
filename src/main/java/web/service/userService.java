package web.service;

import web.entity.tUser;
import web.pageModle.User;


public interface userService {
    public tUser getUserById(int id);
    public tUser getUserByUsername(String username);
    public User userLogin(User user);
    public boolean userRegister(tUser tUser);

}
