package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class HTMLEmailServiceDecorator extends EmailServiceDecorator {

    public HTMLEmailServiceDecorator(EmailService emailService) {
        super(emailService);
    }

    @Override
    public void send(Email email) {
        super.send( htmlConverter(email) );
    }


    private Email htmlConverter(Email email){
        System.out.println("->HTML converter applied!");
        return email;
    }
}
