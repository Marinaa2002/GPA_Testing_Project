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
		String expected = Constants.SPACE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(" Data Structures and Algorithms,DSA203S,100");
		} catch(SpaceException e) {
			assertEquals(expected, e.getMessage(),"Error in Test3");
		}
		
	}
	
	@Test
	void test4() {
		String expected = Constants.ALPHA_ONLY_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("computer_netw!rking,cse253*,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test4");
		}
	}
	
	@Test
	void test5() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("discrete maths,PHM311,John");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test5");
		}
	}
	
	@Test
	void test6() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,cse123s,90");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test6");
		}
	}
	
	@Test
	void test7() {
		String expected = Constants.EMPTY_LINE_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(",,,");
		} catch(SubjectNameException e) {
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
	
	@Test
	void test9() {
		String expected = Constants.EmptyField_STRING + "Subject Full Mark";
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE526,");
		} catch(Exception e) {
			assertEquals(expected, e.getMessage(),"Error in Test9");
		}
	}
	
	@Test
	void test10() {
		String expected = Constants.EmptyField_STRING + "Subject Name";
		try{
			FileAnalyzer.ValidateFirstLine(",DEE618s,100");
		} catch(SubjectNameException e) {
			assertEquals(expected, e.getMessage(),"Error in Test10");
		}
	}
	
	@Test
	void test11() {
		String expected = Constants.EmptyField_STRING + "Subject Code";
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test11");
		}
	}
	
	@Test
	void test12() {
		String expected = Constants.INVALIDLINE1_STRING;
		try{
			FileAnalyzer.ValidateFirstLine(",$A,$A,$A,");
		} catch(IllegalArgumentException e) {
			assertEquals(expected, e.getMessage(), "Error in Test12");
		}
	}
	
	@Test
	void test13() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DEE6182211s,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test13");
		}
	}
	
	@Test
	void test14() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,1SC345,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test14");
		}
	}
	
	@Test
	void test15() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DEED18s,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test15");
		}
	}
	
	@Test
	void test16() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,D!E318s,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test16");
		}
	}
	
	@Test
	void test17() {
		String expected = Constants.EmptyField_STRING + "Subject Full Mark";
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE318s,");
		} catch(Exception e) {
			assertEquals(expected, e.getMessage(),"Error in Test17");
		}
	}
	
	@Test
	void test18() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE318s,A00");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test18");
		}
	}
	
	@Test
	void test19() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE318s,1A0");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test19");
		}
	}
	
	@Test
	void test20() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE318s,10A");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test20");
		}
	}
	
	@Test
	void test21() {
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE318s,1000");
		} catch(FullMarkException e) {
			assertEquals(expected, e.getMessage(),"Error in Test21");
		}
	}
	
	@Test
	void test22() {
		try{
			FileAnalyzer.ValidateFirstLine("Computer Science,CSE125,100");
		} catch(Exception e) {
			fail("Fail in Test Case22 Data");
		}
	}
	
	@Test
	void test23() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE3D8s,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test23");
		}
	}
	
	@Test
	void test24() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DDE31Ds,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test24");
		}
	}
	
	@Test
	void test25() {
		String expected = Constants.Invalid_Record_Subject_STRING;
		try{
			FileAnalyzer.ValidateFirstLine("Advanced Algorithms,DD1318s,100");
		} catch(SubjectCodeException e) {
			assertEquals(expected, e.getMessage(),"Error in Test25");
		}
	}
}
