package com.company;

import com.company.commands.GetUpCommand;
import com.company.commands.LayDownCommand;

public class Main {
    public static void main(String[] args) {
        // both a receiver and an observable
        Trainee trainee = new Trainee();

        // commands
        LayDownCommand layDownCommand = new LayDownCommand(trainee);
        GetUpCommand getUpCommand = new GetUpCommand(trainee);
        // invoker of commands
        Instructor instructor = new Instructor();

        // observers of trainee
        OnlineViewer onlineViewer1 = new OnlineViewer("Ivan");
        OnlineViewer onlineViewer2 = new OnlineViewer("Mirela");
        OnlineViewer onlineViewer3 = new OnlineViewer("Hristo");

        trainee.addObserver(onlineViewer1);
        trainee.addObserver(onlineViewer2);
        trainee.addObserver(onlineViewer3);

        instructor.setGetUpCommand(getUpCommand);
        instructor.setLayDownCommand(layDownCommand);

        instructor.executeGetUpCommand();
        instructor.executeLayDownCommand();
    }
}
