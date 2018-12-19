package web.dao;

import web.entity.tUser;

import java.util.List;


public interface userDao {
    public tUser getUserById(int userId);
    public List<tUser> getUserByUsername(String username);
    public List<tUser> userLogin(String username, String password);
    public void saveUser(tUser tUser);
}
