package eu.dg.grow.q2.email.decorator;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class AESEmailServiceDecorator extends EmailServiceDecorator {

    public AESEmailServiceDecorator(EmailService emailService) {
        super(emailService);
    }

    @Override
    public void send(Email email) {
        super.send(encryptWithAES(email));
    }

    private Email encryptWithAES(Email email){
        System.out.println("->Encrypt with AES.");
        return email;
    }

}
