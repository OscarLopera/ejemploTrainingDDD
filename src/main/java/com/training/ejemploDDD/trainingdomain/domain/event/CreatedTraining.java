package com.training.ejemploDDD.trainingdomain.domain.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.ejemploDDD.trainingdomain.domain.value.League;
import com.training.ejemploDDD.trainingdomain.domain.value.TrainingId;

public class CreatedTraining extends DomainEvent {

    private final TrainingId trainingId;
    private final League league;

    public CreatedTraining(TrainingId trainingId, League league){
        super("trainingdomain.domain.createdtraining");
        this.trainingId=trainingId;
        this.league=league;
    }

    public TrainingId getTrainingId() {
        return trainingId;
    }

    public League getLeague() {
        return league;
    }
}
