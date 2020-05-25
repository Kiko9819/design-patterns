package com.exercise2;

import java.util.HashMap;

public class ChatRoom extends AbstractChatRoom {

    private HashMap<String, Participant> participants = new HashMap<String, Participant>();
    private ParticipantFactory participantFactory;
    private Participant botParticipant;

    private void notifyParticipants() {
        participants.forEach((key, value) -> {
            value.receive(botParticipant.getName(), "'cat' is not an allowed word here, kicking off " + key);
        });
    }

    @Override
    public void register(Participant participant) {
        if(!participants.containsValue(participant)) {
            participants.put(participant.getName(), participant);
        }

        participant.setChatRoom(this);
    }

    @Override
    public void unregister(Participant participant) {
        if(participants.containsKey(participant.getName())) {
            System.out.printf("Removing %s", participant.getName());
            System.out.println();
            participants.remove(participant.getName());
        }
    }

    @Override
    public void send(String from, String to, String message) {
        if (message == "addBot" && botParticipant == null) {
            participantFactory = new ParticipantFactory();
            botParticipant = participantFactory.getParticipant("BOT", "DEFAULT-BOT");
        }

        Participant participant = participants.get(to);

        if(participant != null) {
            participant.receive(from, message);
        }

        if (message.contains("cat") && botParticipant != null) {
            unregister(participants.get(from));
            notifyParticipants();
        }
    }
}
