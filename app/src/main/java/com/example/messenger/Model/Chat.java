package com.example.messenger.Model;

public class Chat {
    private String from;
    private String to;
    private String message;


    public Chat(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public Chat() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
