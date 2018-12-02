package web.dao;

import web.entity.User;

import java.util.List;


public interface userDao {
    public User getUserById(int userId);
    public List<User> getUserByUsername(String username);
    public List<User> userLogin(String username, String password);
    public void saveUser(User user);
}
