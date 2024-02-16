package ru.senz0ne.springBootCRUD.project2Boot.dao;



import ru.senz0ne.springBootCRUD.project2Boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);
}
