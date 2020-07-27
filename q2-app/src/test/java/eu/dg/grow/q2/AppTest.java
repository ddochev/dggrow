package eu.dg.grow.q2;

import eu.dg.grow.q2.email.Email;
import eu.dg.grow.q2.email.decorator.DisclaimerEmailServiceDecorator;
import eu.dg.grow.q2.email.decorator.EmailServiceDecorator;
import eu.dg.grow.q2.email.decorator.TextEmailServiceDecorator;
import eu.dg.grow.q2.email.service.OutsideResourceEmailService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;


    private final static String testResult=
            "->Text converter applied.\n" + "->Add Disclaimer to email.\n" + "->Sending Email to outside resource with name Google.\n";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testResult()
    {

        EmailServiceDecorator emailServiceDecorator =
                new TextEmailServiceDecorator(
                        new DisclaimerEmailServiceDecorator(
                                new OutsideResourceEmailService("Google")));

        emailServiceDecorator.send(new Email());

        assertEquals(testResult, outContent.toString());
    }
}
