/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static quotes.App.*;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test public void getRandomQuote_returnsAString() throws FileNotFoundException {
        assertTrue(getRandomQuote() instanceof String);
    }

    @Test public void getRandomQuote_printsAStringToTerminal() throws FileNotFoundException {
        System.out.print(getRandomQuote());
        //the only substring the quotes all have in common is a "-"...
        assertTrue(outContent.toString().contains("-"));
        assertTrue(outContent.toString().length() > 5);
    }

    @Test public void getQuoteFromAuthor_getsQuoteFromCorrectAuthor() throws FileNotFoundException {
        assertTrue(getQuoteFromAuthor("Patrick").contains("Patrick Ness"));
        assertTrue(getQuoteFromAuthor("Ness").contains("Patrick Ness"));
    }

    @Test public void getQuoteThatContains_containsGivenString() throws FileNotFoundException {
        assertTrue(getQuoteThatContains("invisible").contains("What did you do to help the invisible man?"));
        assertTrue(getQuoteThatContains("breakfast").contains("I wish the whole day were like breakfast"));
    }

    @Test public void getRandomQuoteFromForismatic_printsAString() throws FileNotFoundException {
        System.out.print(getRandomQuoteFromForismatic());
        assertTrue(outContent.toString().length() > 5);
    }
}
