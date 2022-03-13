package com.example.servingwebcontent.api.dao;

import com.example.servingwebcontent.jpa.entity.MessageEntity;

public interface MessageDAO {

    MessageEntity loadMessageText(long id);

}
