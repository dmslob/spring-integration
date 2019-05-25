package com.dmslob.message;

public class TestMessage {

    private String message;
    private String currentTime;

    public TestMessage() {
    }

    public TestMessage(String msg, String currentTime) {
        this.message = msg;
        this.currentTime = currentTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
