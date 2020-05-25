package com.exercise2;

public class Participant {
    private ChatRoom chatRoom;
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void send(String to, String message) {
        chatRoom.send(name, to, message);
    }

    public void receive(String from, String message)
    {
        System.out.printf("%s to %s: '%s'\n", from, getName(), message);
    }
}
