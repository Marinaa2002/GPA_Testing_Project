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
			FileAnalyzer.ValidateFirstLine(",,,Advanced Algorithms,DEE618s,100");
		} catch(IllegalArgumentException e) {
			assertEquals(expected, e.getMessage(), "Error in Test1");
		}
		
	}
	
	@Test
	void test2() {
		String expected = Constants.EMPTY_LINE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test2");
		}
		
	}
	
	@Test
	void test3() {
		String expected = Constants.EMPTY_LINE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(",,,");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test3");
		}
		
	}
	
	@Test
	void test4() {
		String expected = Constants.SPACE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(" Data Structures and Algorithms,DSA203S,100");
		} catch(SpaceException e) {
			assertEquals(expected, e.getMessage(),"Error in Test4");
		}
		
	}
	
	@Test
	void test5() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("computer_netw!rking,cse253*,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test5");
		}
		
	}
	@Test
	void test6() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("discrete maths,PHM311,John");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test6");
		}
	}

	@Test
	void test7() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,cse123s,90");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test7");
		}
	}

	@Test
	void test8() {
		String expected = Constants.LAST_LETTER_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE4215,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test8");
		}
	}
