package fr.vocaltech.di.sample2;

import lombok.Getter;

import javax.inject.Inject;

public class EmailApplication {
    @Getter
    private final EmailService emailService;

    @Inject
    public EmailApplication(EmailService emailService) {
        this.emailService = emailService;
    }
    public String processMessages(String receiver, String msg) {
        String sentResult = emailService.sendEmail(receiver, msg);
        return sentResult + "\n"
            + "EmailApplication.processMessages(): receiver: " + receiver + " - msg: " + msg;
    }
}
