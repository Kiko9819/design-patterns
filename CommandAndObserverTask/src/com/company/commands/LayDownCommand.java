package com.company.commands;

import com.company.Trainee;
import com.company.interfaces.Exercise;

public class LayDownCommand implements Exercise {

    private Trainee trainee;

    public LayDownCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void performExercise() {
        this.trainee.performLayDown();
    }
}
