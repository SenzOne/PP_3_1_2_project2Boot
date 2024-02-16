package ru.senz0ne.springBootCRUD.project2Boot.service;


import ru.senz0ne.springBootCRUD.project2Boot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);
}
