package com.yassin.appchatjee.dao;

import com.yassin.appchatjee.models.User;

import java.util.List;

public interface UserDAO {

    void save(User message);

    void update(User message);

    void delete(User message);

    User findById(int id);

    List<User> findAll();
}