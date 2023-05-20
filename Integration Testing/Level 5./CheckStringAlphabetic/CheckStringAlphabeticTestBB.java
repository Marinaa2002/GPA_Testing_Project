package source;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

//this class is concerned with testing CheckStringAlphabetic() function with black box testing technique

public class CheckStringAlphabeticTestBB {
    FileAnalyzer fa ;
    String input ; 
    @BeforeEach
    public  void setUp() {
        fa = new FileAnalyzer();
        input = null ;
    }
    @AfterEach
    public  void tearDown() {
        fa = null;
        input = null ;
    }
    @Test
    public void testCheckAlphabeticBB01() {
        input = "Mina875Mounir@%F&rid" ;
        assertFalse("error in black box test case 1 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB02() {
        input = "Mina420Mounir Farid10" ;
        assertFalse("error in black box test case 2 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB03() {
        input = "/Mar^(naMila~d " ;
        assertFalse("error in black box test case 3 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB04() {
        input = "Ghaith Bassam Zaza" ;
        assertTrue("error in black box test case 4 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB05() {
        input = "(10+2)*3+[75]!" ;
        assertFalse("error in black box test case 5 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB06() {
        input = "1976435034567" ;
        assertFalse("error in black box test case 6 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB07() {
        input = "*/-+=`" ;
        assertFalse("error in black box test case 7 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabeticBB08() {
        input = "                 " ;
        assertFalse("error in black box test case 8 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
    }
}
