package com.training.ejemploDDD.trainingdomain.domain.value;

import co.com.sofka.domain.generic.Identity;

public class ApprenticeId extends Identity {

    private ApprenticeId(String id) {
        super(id);
    }

    public static ApprenticeId of(String id) {
        return new ApprenticeId(id);
    }
}
