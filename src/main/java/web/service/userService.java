package web.service;

import web.entity.User;


public interface userService {
    public User getUserById(int id);
    public User getUserByUsername(String username);
    public User userLogin(String username,String password);
    public boolean userRegister(User user);

}
