package com.example.servingwebcontent.rest;

import com.example.servingwebcontent.api.service.MessageService;
import com.example.servingwebcontent.dto.FormPostRequest;
import com.example.servingwebcontent.dto.FormPostResponse;
import com.example.servingwebcontent.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class RestAPI {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/ping", consumes = "*/*")
    public String pingTest() {
        return "pong";
    }

    @GetMapping(value = "/get_json_message", consumes = "*/*", produces = "application/json")
    public MessageResponse getJsonMessage() {
        MessageResponse message = messageService.getMessage();
        return message;
    }

    @PostMapping(value = "/form_post", consumes = "application/json", produces = "application/json")
    public FormPostResponse handleFormPost(@RequestBody FormPostRequest request) {
        FormPostResponse response = new FormPostResponse(0, "handled ok!");
        return response;
    }


}
