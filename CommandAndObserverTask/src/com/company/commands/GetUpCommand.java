package com.company.commands;

import com.company.Trainee;
import com.company.interfaces.Exercise;

public class GetUpCommand implements Exercise {

    private Trainee trainee;

    public GetUpCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void performExercise() {
        this.trainee.performGetUp();
    }
}
