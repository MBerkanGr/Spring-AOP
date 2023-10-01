package com.mehmetberkan.SpringAOP.service;

import com.mehmetberkan.SpringAOP.annotation.CustomAnnotation;
import com.mehmetberkan.SpringAOP.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @CustomAnnotation("addMessage")
    public Message addMessage(Message message) {
        System.out.println(message.getTitle());
        System.out.println(message.getContent());
        return message;
    }

}
