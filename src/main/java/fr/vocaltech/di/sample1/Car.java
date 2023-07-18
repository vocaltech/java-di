package fr.vocaltech.di.sample1;

import lombok.Getter;
import lombok.Setter;

import javax.inject.Inject;

public class Car {
    @Getter
    @Setter
    private Engine engine;

    @Getter
    @Setter
    private Brand brand;

    @Inject
    public Car(Engine engine, Brand brand) {
        this.engine = engine;
        this.brand = brand;
    }
}
