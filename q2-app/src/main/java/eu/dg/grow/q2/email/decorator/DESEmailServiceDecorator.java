package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class DESEmailServiceDecorator extends EmailServiceDecorator {

    public DESEmailServiceDecorator(EmailService emailService) {
        super(emailService);
    }

    @Override
    public void send(Email email) {
        super.send(encritpWithDES(email));
    }

    private Email encritpWithDES(Email email){
        System.out.println("->Encrypt with DES");
        return email;
    }
}
