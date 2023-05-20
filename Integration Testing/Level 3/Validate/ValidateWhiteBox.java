import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import math.Constants;
import math.FileAnalyzer;

class ValidateTest {
    @Test
    public void Validate1() {
		  try{
			    ArrayList<String> s = new ArrayList<String>();
			    s.add("Software Testing,CSE125,100");
		      FileAnalyzer.validate(s);
		  } catch (Exception e) {
          fail("Fail in Test Case1 Data");
      }
    }
    
	  @Test
    public void Validate2() {
		  try{
			    ArrayList<String> s = new ArrayList<String>();
			    s.add("Software Testing,CSE125,100");
		      s.add("Amanda Grace,29765291,9,9,20,58");
		      FileAnalyzer.validate(s);
		  } catch (Exception e) {
          fail("Fail in Test Case2 Data");
      }
    }
	
	  @Test
    public void Validate3() {
		  try{
			  ArrayList<String> s = new ArrayList<String>();
			  s.add("Software Testing,CSE125,100");
			  s.add("Daniel William,87654328,7,3,20,52");
			  s.add("");
		    s.add("Amanda Grace,29765291,9,9,20,58");
		    FileAnalyzer.validate(s);
		  } catch (Exception e) {
        fail("Fail in Test Case3 Data");
      }
   }
}
