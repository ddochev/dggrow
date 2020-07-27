package eu.dg.grow.q2.email.service;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class ThreeXRepeaterEmailService  implements EmailService{

    private  EmailService emailService;

    public ThreeXRepeaterEmailService(EmailService emailService) {
        this.emailService = emailService;
    }


    @Override
    public void send(Email email) {
        System.out.print("->Repeat Three times if Error \n\t");
        emailService.send(email);
    }
}
