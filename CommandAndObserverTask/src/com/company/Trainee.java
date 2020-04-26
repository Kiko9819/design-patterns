package com.company;


import com.company.enums.ExerciseEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Trainee extends Observable {

    private ExerciseEnum exerciseType;
    private List<OnlineViewer> onlineViewers = new ArrayList<OnlineViewer>();

    public void performLayDown() {
        System.out.println("Trainee performing lay down");
        setExerciseEnum(ExerciseEnum.LAY_DOWN);
        setChanged();
        notifyObservers(ExerciseEnum.LAY_DOWN);
    }

    public void performGetUp() {
        System.out.println("Trainee performing getting up");
        setExerciseEnum(ExerciseEnum.GET_UP);
        setChanged();
        notifyObservers(ExerciseEnum.GET_UP);
    }

    public ExerciseEnum getExerciseType() {
        return exerciseType;
    }

    public void setExerciseEnum(ExerciseEnum exerciseType) {
        this.exerciseType = exerciseType;
    }
}
