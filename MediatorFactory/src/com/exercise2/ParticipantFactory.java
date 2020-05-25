package com.exercise2;

public class ParticipantFactory {
    public Participant getParticipant(String participantType, String participantName) {
        if(participantType == null) {
            return null;
        }

        if(participantType.equalsIgnoreCase("USER")) {
            return new NormalParticipant(participantName);
        }

        if(participantType.equalsIgnoreCase("BOT")) {
            return new BotParticipant(participantName);
        }

        return null;
    }
}
