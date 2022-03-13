package com.example.servingwebcontent.jpa.entity;

public class MessageEntity {

    private String text;

    public MessageEntity(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
