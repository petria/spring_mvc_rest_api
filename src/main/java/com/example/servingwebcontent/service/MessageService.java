package com.example.servingwebcontent.service;

import com.example.servingwebcontent.repository.MessageDAO;
import com.example.servingwebcontent.repository.entity.MessageEntity;
import com.example.servingwebcontent.rest.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageDAO messageDAO;

    private static long idCount = 0;

    public MessageResponse getMessage() {

        MessageEntity entity = messageDAO.loadMessageText(++idCount);
        return new MessageResponse(entity.getText());
    }

}
