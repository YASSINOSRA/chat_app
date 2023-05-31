package com.yassin.appchatjee.dao;

import com.yassin.appchatjee.models.Message;

import java.util.List;

public interface MessageDAO {
    void save(Message message);

    void update(Message message);

    void delete(Message message);

    Message findById(Long id);

    List<Message> findAll();
}
