import fr.vocaltech.di.sample2.DaggerEmailApplicationComponent;
import fr.vocaltech.di.sample2.EmailApplication;
import fr.vocaltech.di.sample2.EmailApplicationComponent;
import fr.vocaltech.di.sample2.EmailService;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sample2UnitTest {
    @Test
    public void givenReceiverMsg_whenEmailServiceSendEmail_thenCorrect() {
        EmailService emailService = new EmailService();

        String result = emailService.sendEmail("pat@hotmail.fr", "hello!");
        System.out.println(result);

        assertThat(result).startsWith("EmailService.sendEmail()");
    }

    @Test
    public void givenEmailServiceReceiverMsg_whenEmailApplicationProcessMessages_thenCorrect() {
        EmailService emailService = new EmailService();
        EmailApplication emailApplication = new EmailApplication(emailService);

        assertThat(emailApplication.getEmailService()).isNotNull();

        String result = emailApplication.processMessages("pat@hotmail.fr", "hello!");
        System.out.println(result);

        assertThat(result).contains("EmailApplication.processMessages()");
    }

    @Test
    public void givenEmailApplicationComponent_whenBuildEmailApplication_thenDependenciesInjected() {
        EmailApplicationComponent emailApplicationComponent = DaggerEmailApplicationComponent.create();
        EmailApplication emailApplication = emailApplicationComponent.buildEmailApplication();

        assertThat(emailApplication.getEmailService()).isNotNull();

        String result = emailApplication.processMessages("pat@hotmail.fr", "hello!");
        System.out.println(result);

        assertThat(result).contains("EmailApplication.processMessages()");
    }
}
