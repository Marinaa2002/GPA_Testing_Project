package source ;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FileAnalyzerNewTest {
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
    //testing for checkAlphabetic
    @Test
    public void testCheckAlphabetic01() {
        input = "" ;
        assertFalse("error in test case 1", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic02() {
        input = "U" ;
        assertTrue("error in test case 2", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic03() {
        input = "123" ;
        assertFalse("error in test case 3", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic04() {
        input = "lorem ipsum dolor" ;
        assertTrue("error in test case 4", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic05() {
        input = "mina$" ;
        assertFalse("error in test case 5", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic06() {
        input = "mina_!mounir" ;
        assertFalse("error in test case 6", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic07() {
        input = "min%1UMoun~R" ;
        assertFalse("error in test case 7", FileAnalyzer.checkStringAlphabetic(input));
    }
    @Test
    public void testCheckAlphabetic08() {
        input = "mInAMounir" ;
        assertTrue("error in test case 8", FileAnalyzer.checkStringAlphabetic(input));
    }
    //testing for CheckAlphanumeric
    @Test
    public void testCheckAlphaNumeric01() {
        input = "" ;
        assertFalse("error in test case 1", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumeric02() {
        input = "123" ;
        assertFalse("error in test case 2", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumeric03() {
        input = "U" ;
        assertFalse("error in test case 3", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumeric04() {
        input = "lorem ipsum dolor" ;
        assertFalse("error in test case 4", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumeric05() {
        input = "mina$" ;
        assertFalse("error in test case 5", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumeric06() {
        input = "mina_!mouni12r" ;
        assertFalse("error in test case 6", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumeric07() {
        input = "min%UMoun~R" ;
        assertFalse("error in test case 7", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumeric08() {
        input = "0mInAMou4nir4" ;
        assertTrue("error in test case 8", FileAnalyzer.checkStringAlphaNumeric(input));
    }
}
