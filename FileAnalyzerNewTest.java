//rest of level 5
package source ;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
/*
 * BB in the function name stands for Black Box
 * WB in the function name stands for White box 
 */
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
    //Black box testing for checkAlphabetic
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

    //white box  for CheckAlphanumeric
    @Test
    public void testCheckAlphaNumericWB01() {
        input = "" ;
        assertFalse("error in white box test case 1 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericWB02() {
        input = "123" ;
        assertFalse("error in white box test case 2 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumericWB03() {
        input = "U" ;
        assertFalse("error in white box test case 3 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumericWB04() {
        input = "lorem ipsum dolor" ;
        assertFalse("error in white box test case 4 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumericWB05() {
        input = "mina$" ;
        assertFalse("error in white box test case 5 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumericWB06() {
        input = "mina_!mouni12r" ;
        assertFalse("error in white box test case 6 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    } 
     @Test
    public void testCheckAlphaNumericWB07() {
        input = "min%UMoun~R" ;
        assertFalse("error in white box test case 7 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericWB08() {
        input = "0mInAMou4nir4" ;
        assertTrue("error in white box test case 8 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    //black box  for CheckAlphanumeric
    @Test
    public void testCheckAlphaNumericBB01() {
        input = "a[5] = a[4] + a[j++] ; " ;
        assertFalse("error in black box test case 1 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB02() {
        input = "Soft4ware Tes2ting100100" ;
        assertTrue("error in black box test case 2 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB03() {
        input = "if( a[I,j]) == B[r,C] then x += y " ;
        assertFalse("error in black box test case 3 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB04() {
        input = "Philopateer Moheb" ;
        assertFalse("error in black box test case 4 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB05() {
        input = "5! = (5+1)! / (5+1) = 120" ;
        assertFalse("error in black box test case 5 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB06() {
        input = "9873625014" ;
        assertFalse("error in black box test case 6 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB07() {
        input = "!^&*_+-*/" ;
        assertFalse("error in black box test case 7 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }
    @Test
    public void testCheckAlphaNumericBB08() {
        input = "" ;
        assertFalse("error in black box test case 8 for CheckStringAlphaNumeric", FileAnalyzer.checkStringAlphaNumeric(input));
    }


}
