package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class DisclaimerEmailServiceDecorator extends EmailServiceDecorator {

    public DisclaimerEmailServiceDecorator(EmailService emailService) {
        super(emailService);
    }

    @Override
    public void send(Email email) {
        super.send( addDisclaimer( email) );
    }


    private Email addDisclaimer(Email email){
        System.out.println("->Add Disclaimer to email.");
        return email;
    }


}
