package fr.vocaltech.di.sample1;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = CarModule.class)
@Singleton
public interface CarComponent {
    Car buildCar();
}
