package com.training.ejemploDDD.trainingdomain.domain.entity;

import co.com.sofka.domain.generic.Entity;
import com.training.ejemploDDD.trainingdomain.domain.value.ApprenticeId;
import com.training.ejemploDDD.trainingdomain.domain.value.Email;
import com.training.ejemploDDD.trainingdomain.domain.value.Name;

public class Apprentice extends Entity<ApprenticeId> {

    protected Name name;
    protected Email email;

    public Apprentice(ApprenticeId apprenticeId, Name name, Email email) {
        super(apprenticeId);
        this.name = name;
        this.email = email;
    }
}
