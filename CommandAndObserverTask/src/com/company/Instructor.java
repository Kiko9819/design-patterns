package com.company;

import com.company.commands.GetUpCommand;
import com.company.commands.LayDownCommand;

public class Instructor {
    GetUpCommand getUpCommand;
    LayDownCommand layDownCommand;

    public void setGetUpCommand(GetUpCommand getUpCommand) {
        this.getUpCommand = getUpCommand;
    }

    public void setLayDownCommand(LayDownCommand layDownCommand) {
        this.layDownCommand = layDownCommand;
    }

    public void executeGetUpCommand() {
        System.out.println("Instructor invokes GET_UP command!\n");
        getUpCommand.performExercise();
    }

    public void executeLayDownCommand() {
        System.out.println("Instructor invokes LAY_DOWN command!\n");
        layDownCommand.performExercise();
    }
}
