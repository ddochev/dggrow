package eu.dg.grow.q2.email.service;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.EmailService;

/**
 * Created by doki on 7/27/20.
 */
public class OutsideResourceEmailService implements EmailService {

    private String name;

    public OutsideResourceEmailService(String name) {
        this.name = name;
    }

    @Override
    public void send(Email email) {
        System.out.println("->Sending Email to outside resource with name " + name + ".");
    }
}
