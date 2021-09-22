package com.training.ejemploDDD.trainingdomain.domain.value;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {

    private final String value;

    public Name(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
