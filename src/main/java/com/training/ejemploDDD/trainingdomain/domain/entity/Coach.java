package com.training.ejemploDDD.trainingdomain.domain.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.ejemploDDD.trainingdomain.domain.value.CoachId;
import com.training.ejemploDDD.trainingdomain.domain.value.Name;
import com.training.ejemploDDD.trainingdomain.domain.value.Specialty;

public class Coach extends Entity<CoachId> {

    protected Name name;
    protected Specialty specialty;

    public Coach(CoachId coachId, Name name, Specialty specialty) {
        super(coachId);
        this.name = name;
        this.specialty = specialty;
    }
}
