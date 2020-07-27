package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class TextEmailServiceDecorator extends EmailServiceDecorator {

    public TextEmailServiceDecorator(EmailService emailService) {
        super(emailService);
    }

    @Override
    public void send(Email email) {
        super.send(textEmail(email));
    }

    private Email textEmail(Email email){
        System.out.println("->Text converter applied.");
        return email;
    }

}
