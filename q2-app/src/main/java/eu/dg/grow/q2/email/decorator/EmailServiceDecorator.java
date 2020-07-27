package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class EmailServiceDecorator implements EmailService {

    private EmailService wrapee;

    public EmailServiceDecorator(EmailService emailService) {
        this.wrapee = emailService;
    }


    @Override
    public void send(Email email) {
        wrapee.send(email);
    }


}
