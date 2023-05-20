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
			assertEquals(expected, e.getMessage(), "Error in Test1");
		}
		
	}

	@Test
	void test2() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Software_Tes!ting,cse253,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test2");
		}
		
	}
	
	@Test
	void test3() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("15263,cse253,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test3");
		}
		
	}
	
	@Test
	void test4() {
		String expected = Constants.EmptyField_STRING + "Subject Name";
		try{
			FileAnalyzer.ValidateFirstLine(",CSE421,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test4");
		}
	}
	
	@Test
	void test5() {
		String expected = Constants.LAST_LETTER_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE4215,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test5");
		}
	}

	@Test
	void test6() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,1SC345,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test6");
		}
	}

	@Test
	void test7() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE56K,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test7");
		}
	}
	
	@Test
	void test8() {
		String expected = Constants.LAST_LETTER_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE123K,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test8");
		}
	}
	@Test
	void test9() {
		String expected = Constants.EmptyField_STRING + "Subject Code";
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test9");
		}
	}

	@Test
	void test10() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,S!f123,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test10");
		}
	}

	@Test
	void test11() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,SE34,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test11");
		}
	}

	@Test
	void test12() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE123R4,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test12");
		}
	}
	@Test
	void test13() {
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE125,100");
		} catch(Exception e) {
			fail("Fail in Test Case1 Data");
		}
	}
	
	@Test
	void test14() {
		String expected = Constants.SPACE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE125,100");
		} catch(SpaceException e) {
			assertEquals(expected, e.getMessage(),"Error in Test14");
		}
	}
	
	@Test
	void test15() {
		String expected = Constants.SPACE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE125s,100");
		} catch(SpaceException e) {
			assertEquals(expected, e.getMessage(),"Error in Test15");
		}
	}

	
