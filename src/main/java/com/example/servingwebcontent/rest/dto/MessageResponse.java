package com.example.servingwebcontent.rest.dto;

public class MessageResponse {
    private String response;

    public MessageResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}