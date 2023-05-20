package source;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//this class is concerned with testing CheckStringAlphanumeric() function with black box testing technique

public class CheckStringAlphanumericTestBB {
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
    public void testCheckAlphaNumericBB01() {
        input = "a[5] = a[4] + a[j++] ; ";
        assertFalse("error in black box test case 1 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB02() {
        input = "Soft4ware Tes2ting100100";
        assertTrue("error in black box test case 2 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB03() {
        input = "if( a[I,j]) == B[r,C] then x += y ";
        assertFalse("error in black box test case 3 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB04() {
        input = "Philopateer Moheb";
        assertFalse("error in black box test case 4 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB05() {
        input = "5! = (5+1)! / (5+1) = 120";
        assertFalse("error in black box test case 5 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB06() {
        input = "9873625014";
        assertFalse("error in black box test case 6 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB07() {
        input = "!^&*_+-*/";
        assertFalse("error in black box test case 7 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }

    @Test
    public void testCheckAlphaNumericBB08() {
        input = "";
        assertFalse("error in black box test case 8 for CheckStringAlphaNumeric",
                FileAnalyzer.checkStringAlphaNumeric(input));
    }
}
