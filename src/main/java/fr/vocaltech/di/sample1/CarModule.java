package fr.vocaltech.di.sample1;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class CarModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand("BMW");
    }
}
