package com.training.ejemploDDD.trainingdomain.domain.value;

import co.com.sofka.domain.generic.ValueObject;
import org.springframework.validation.annotation.Validated;

public class Specialty implements ValueObject<String> {

    private final String value;

    public Specialty(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
