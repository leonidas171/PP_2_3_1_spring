package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public User getUser(int id);

    public void saveUser(User user);

    public void updateUser(User user, int id);

    public void deleteUser(int id);
}
