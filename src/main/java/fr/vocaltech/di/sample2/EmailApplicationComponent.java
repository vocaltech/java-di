package fr.vocaltech.di.sample2;

import dagger.Component;

@Component(modules = EmailApplicationModule.class)
public interface EmailApplicationComponent {
    EmailApplication buildEmailApplication();
}
