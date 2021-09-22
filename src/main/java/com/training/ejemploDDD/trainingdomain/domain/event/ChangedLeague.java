package com.training.ejemploDDD.trainingdomain.domain.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.training.ejemploDDD.trainingdomain.domain.value.League;
import com.training.ejemploDDD.trainingdomain.domain.value.TrainingId;

public class ChangedLeague extends DomainEvent {

    private final TrainingId trainingId;
    private final League league;

    public ChangedLeague(TrainingId trainingId, League league){
        super("trainingddd.domain.changedleague");
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
