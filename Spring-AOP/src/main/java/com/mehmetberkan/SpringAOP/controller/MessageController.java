package com.mehmetberkan.SpringAOP.controller;

import com.mehmetberkan.SpringAOP.model.Message;
import com.mehmetberkan.SpringAOP.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.addMessage(message));
    }
}
