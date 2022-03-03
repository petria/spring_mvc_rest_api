package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.repository.entity.MessageEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageDAO {

    public MessageEntity loadMessageText(long id) {
        MessageEntity entity = new MessageEntity("Loaded from fake DB text id: " + id);
        return entity;
    }

}
