package source;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

//this class is concerned with testing CheckStringAlphanumeric() function with white box testing technique

public class CheckStringAlphanumericTestWB {
    FileAnalyzer fa;
    String input;

    @BeforeEach
    public void setUp() {
        fa = new FileAnalyzer();
        input = null;
    }

    @AfterEach
    public void tearDown() {
        fa = null;
        input = null;
    }

    @Test
    public void testCheckAlphaNumericWB01() {
        input = "";
        assertFalse("error in white box test case 1 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB02() {
        input = "123";
        assertFalse("error in white box test case 2 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB03() {
        input = "U";
        assertFalse("error in white box test case 3 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB04() {
        input = "lorem ipsum dolor";
        assertFalse("error in white box test case 4 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB05() {
        input = "mina$";
        assertFalse("error in white box test case 5 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB06() {
        input = "mina_!mouni12r";
        assertFalse("error in white box test case 6 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB07() {
        input = "min%UMoun~R";
        assertFalse("error in white box test case 7 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericWB08() {
        input = "0mInAMou4nir4";
        assertTrue("error in white box test case 8 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }
}
