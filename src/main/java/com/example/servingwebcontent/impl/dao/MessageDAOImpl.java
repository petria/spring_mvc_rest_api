package com.example.servingwebcontent.impl.dao;

import com.example.servingwebcontent.api.dao.MessageDAO;
import com.example.servingwebcontent.jpa.entity.MessageEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageDAOImpl implements MessageDAO {

    @Override
    public MessageEntity loadMessageText(long id) {
        MessageEntity entity = new MessageEntity("Loaded from fake DB text id: " + id);
        return entity;
    }

}
