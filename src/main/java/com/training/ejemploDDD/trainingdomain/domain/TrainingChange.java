package com.training.ejemploDDD.trainingdomain.domain;

import co.com.sofka.domain.generic.EventChange;
import com.training.ejemploDDD.trainingdomain.domain.event.CreatedTraining;
import com.training.ejemploDDD.trainingdomain.domain.event.ChangedLeague;


public class TrainingChange extends EventChange {

    public TrainingChange(Training training){
        apply((CreatedTraining event)->{
            training.league= event.getLeague();
            training.trainingId =event.getTrainingId();
        });

        apply((ChangedLeague event) ->{
            training.league=event.getLeague();
        });
    }
}
