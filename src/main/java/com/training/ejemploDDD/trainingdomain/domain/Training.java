package com.training.ejemploDDD.trainingdomain.domain;

import co.com.sofka.domain.generic.AggregateEvent;
import com.training.ejemploDDD.trainingdomain.domain.entity.Apprentice;
import com.training.ejemploDDD.trainingdomain.domain.entity.Coach;
import com.training.ejemploDDD.trainingdomain.domain.event.ChangedLeague;
import com.training.ejemploDDD.trainingdomain.domain.event.CreatedTraining;
import com.training.ejemploDDD.trainingdomain.domain.value.League;
import com.training.ejemploDDD.trainingdomain.domain.value.TrainingId;

import java.util.List;
import java.util.Objects;


public class Training extends AggregateEvent<TrainingId> {

    protected TrainingId trainingId;
    protected League league;
    protected List<Coach> coaches;
    protected List<Apprentice> apprentices;

    public Training(TrainingId trainingId, League league, List<Coach> coaches, List<Apprentice> apprentices) {
        super(trainingId);
        this.league = league;
        this.coaches = coaches;
        this.apprentices = apprentices;
    }

    public League getLeague() {
        return league;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public List<Apprentice> getApprentices() {
        return apprentices;
    }

    public Training(TrainingId trainingId, League league){
        super(trainingId);
        appendChange(new CreatedTraining(trainingId, league)).apply();
    }

    public void chanceLeagueTraining(TrainingId trainingId, League league) {
        Objects.requireNonNull(trainingId);
        Objects.requireNonNull(league);
        appendChange(new ChangedLeague(trainingId,league)).apply();
    }
}
