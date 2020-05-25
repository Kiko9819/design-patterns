package com.exercise2;

public abstract class AbstractChatRoom {
    public abstract void register(Participant participant);
    public abstract void unregister(Participant participant);
    public abstract void send(String from, String to, String message);
}
