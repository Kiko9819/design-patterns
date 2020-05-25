package com.exercise2;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        ParticipantFactory participantFactory = new ParticipantFactory();
        Participant ivancho = participantFactory.getParticipant("USER", "Ivancho");
        Participant dragancho = participantFactory.getParticipant("USER", "Dragancho");
        Participant petkancho = participantFactory.getParticipant("USER", "Petkancho");

        chatRoom.register(ivancho);
        chatRoom.register(dragancho);
        chatRoom.register(petkancho);

        ivancho.send("Dragancho", "How's it going?");
        dragancho.send("Ivancho", "I'm fine thank you!");
        dragancho.send("Ivancho", "addBot");

        petkancho.send("Ivancho", "cat is awesome");
    }
}
