package fr.vocaltech.di.sample2;

public class EmailService {
    public String sendEmail(String receiver, String msg) {
        return "EmailService.sendEmail(): receiver: " + receiver + " - msg: " + msg;
    }
}
