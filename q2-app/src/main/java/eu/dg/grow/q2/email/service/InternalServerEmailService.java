package eu.dg.grow.q2.email.service;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class InternalServerEmailService implements EmailService {

    private String serverIp;

    public InternalServerEmailService(String serverIp) {
        this.serverIp = serverIp;
    }

    @Override
    public void send(Email email) {
        System.out.println("->Sending Email to internal server with ip " + serverIp + ".");
    }
}
