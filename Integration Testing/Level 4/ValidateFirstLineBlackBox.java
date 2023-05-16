import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import math.Constants;
import math.FileAnalyzer;
import math.FullMarkException;
import math.SpaceException;
import math.SubjectCodeException;
import math.SubjectNameException;

class ValidateFirstLineWhite {
@Test
	void test1() {
		String expected = Constants.INVALIDLINE1_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(",Advanced Programming,DEE618s,100");
		} catch(IllegalArgumentException e) {
			assertEquals(expected, e.getMessage(), "Error in Test11");
		}
		
	}

	@Test
	void test2() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Software_Tes!ting,cse253,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test12");
		}
		
	}
	
	@Test
	void test3() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("15263,cse253,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test13");
		}
		
	}
	
