package com.techelevator.model;

public class Message {
    private int messageId;
    private String messageText;
    private String url;

    public Message() {}

    public Message(int messageId, String messageText, String url) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
