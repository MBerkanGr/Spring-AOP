package com.mehmetberkan.SpringAOP.service;

import com.mehmetberkan.SpringAOP.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message addMessage(Message message) {
        System.out.println(message.getTitle());
        System.out.println(message.getContent());
        return message;
    }

}
