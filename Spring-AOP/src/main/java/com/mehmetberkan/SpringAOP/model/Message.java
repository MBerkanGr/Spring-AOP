package com.mehmetberkan.SpringAOP.model;

import java.util.Date;

public class Message {
    private String title;
    private String content;

    public Message() {
    }

    public String concatContentWithDate(String content, Date date) {
        return content + " Date : " + date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
