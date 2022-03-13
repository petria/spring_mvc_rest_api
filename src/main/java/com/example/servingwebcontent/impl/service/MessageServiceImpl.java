package com.example.servingwebcontent.impl.service;

import com.example.servingwebcontent.api.dao.MessageDAO;
import com.example.servingwebcontent.api.service.MessageService;
import com.example.servingwebcontent.dto.MessageResponse;
import com.example.servingwebcontent.jpa.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    private static long idCount = 0;

    @Override
    public MessageResponse getMessage() {
        MessageEntity entity = messageDAO.loadMessageText(++idCount);
        return new MessageResponse(entity.getText());
    }

}
