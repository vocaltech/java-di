package fr.vocaltech.di.sample2;

import dagger.Module;
import dagger.Provides;

@Module
public class EmailApplicationModule {
    @Provides
    public EmailService provideEmailService() {
        return new EmailService();
    }
}
