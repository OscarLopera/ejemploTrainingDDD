package com.training.ejemploDDD.trainingdomain.domain.value;

import co.com.sofka.domain.generic.ValueObject;

public class League implements ValueObject<String> {

    private final String value;

    public League(String value) {
        this.value=value;
    }

    @Override
    public String value(){
        return value;
    }

}
