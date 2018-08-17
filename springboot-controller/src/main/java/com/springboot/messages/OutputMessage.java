package com.springboot.messages;

public class OutputMessage {

    private String name;

    public OutputMessage() {
    }

    public OutputMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
