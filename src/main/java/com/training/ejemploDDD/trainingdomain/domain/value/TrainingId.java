package com.training.ejemploDDD.trainingdomain.domain.value;

import co.com.sofka.domain.generic.Identity;

public class TrainingId extends Identity {

    public TrainingId(String id){
        super(id);
    }

    public static TrainingId of(String id){
        return new TrainingId(id);
    }
}
