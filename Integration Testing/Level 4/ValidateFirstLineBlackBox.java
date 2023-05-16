import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import math.Constants;
import math.FileAnalyzer;
import math.FullMarkException;
import math.SpaceException;
import math.SubjectCodeException;
import math.SubjectNameException;

class ValidateFirstLineBlack {
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
	
	@Test
	void test4() {
		String expected = Constants.EmptyField_STRING + "Subject Name";
		try{
			FileAnalyzer.ValidateFirstLine(",CSE421,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test14");
		}
	}
	
	@Test
	void test5() {
		String expected = Constants.LAST_LETTER_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE4215,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test15");
		}
	}

	@Test
	void test6() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,1SC345,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test16");
		}
	}
	

	
