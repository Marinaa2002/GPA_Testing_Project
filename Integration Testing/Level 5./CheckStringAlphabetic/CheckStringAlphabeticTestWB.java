package source;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//this class is concerned with testing CheckStringAlphabetic() function with white box testing technique

public class CheckStringAlphabeticTestWB {
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
        //White box testing for checkAlphabetic
        @Test
        public void testCheckAlphabeticWB01() {
            input = "                         " ;
            assertFalse("error in white box test case 1 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB02() {
            input = "U" ;
            assertTrue("error in white box test case 2 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB03() {
            input = "123" ;
            assertFalse("error in white box test case 3 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB04() {
            input = "lorem ipsum dolor" ;
            assertTrue("error in white box test case 4 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB05() {
            input = "mina$" ;
            assertFalse("error in white box test case 5 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB06() {
            input = "mina_!mounir" ;
            assertFalse("error in white box test case 6 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB07() {
            input = "min%1UMoun~R" ;
            assertFalse("error in white box test case 7 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
        @Test
        public void testCheckAlphabeticWB08() {
            input = "mInAMounir" ;
            assertTrue("error in white box test case 8 for CheckStringAlphabetic", FileAnalyzer.checkStringAlphabetic(input));
        }
}
