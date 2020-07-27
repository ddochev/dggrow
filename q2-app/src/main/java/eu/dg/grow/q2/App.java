package eu.dg.grow.q2;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.decorator.*;
import eu.dg.grow.q2.email.service.InternalServerEmailService;
import eu.dg.grow.q2.email.service.OutsideResourceEmailService;
import eu.dg.grow.q2.email.service.ThreeXRepeaterEmailService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Email email = new Email();

        System.out.println("\n1. Sending a plain text email to an outside resource, with a disclaimer added at the end, unencrypted and no retry: \n");

        EmailServiceDecorator emailServiceDecorator =
                new TextEmailServiceDecorator(
                        new DisclaimerEmailServiceDecorator(
                                new OutsideResourceEmailService("Google")));

        emailServiceDecorator.send(email);

        System.out.println("\n2. Sending an HTML email to an internal server (so without the disclaimer), encrypted with DES, with the retry functionality: \n");

        emailServiceDecorator = new HTMLEmailServiceDecorator(
                new DESEmailServiceDecorator(
                        new ThreeXRepeaterEmailService(
                        new InternalServerEmailService("10.10.3.4"))));

        emailServiceDecorator.send(email);


        System.out.println("\n3. Sending an HTML email to an outside resource, with a disclaimer added at the end and encrypted with AES with retries in case of errors: \n");

        emailServiceDecorator = new HTMLEmailServiceDecorator(
                new DisclaimerEmailServiceDecorator(
                        new AESEmailServiceDecorator (
                                new ThreeXRepeaterEmailService(
                                new OutsideResourceEmailService("Yahoo")))));

        emailServiceDecorator.send(email);

        System.out.println("\n4. Sending a plain text email to an outside resource and encrypted first with DES and then with AES \n");

        emailServiceDecorator = new TextEmailServiceDecorator(
                new DESEmailServiceDecorator(
                        new AESEmailServiceDecorator(
                                new OutsideResourceEmailService("Microsoft"))));

        emailServiceDecorator.send(email);
    }

}
