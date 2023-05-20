import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import math.OutputWritter;
import math.Student;
import math.Subject;

class OutputWriterWhite {

	@Test
	void test1() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 51));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test1 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test2() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 42));
        	Subject s = new Subject("Math", "12", 100, students);
       		 File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test2 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test3() { 
		String a, b , save, actual = "";
	   	 Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 30));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test3 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test4() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 37));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test4 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test5() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 59));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test5 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test6() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 55));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test6 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test7() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 45));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test7 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test8() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 33));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test8 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test9() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 28));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test9 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test10() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 24));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test10 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test11() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 21));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test11 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test12() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 10));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test12 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test13() { 
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		ArrayList<Student> students = new ArrayList<>();
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 80));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (FullMarkException e) {
			assertEquals(expected, e.getMessage(), "OutputWritter::Test13 failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	void test14() { 
		String a, b , save, actual = "";
	    	Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150", 10, 10, 15, 31));
        	students.add(new Student("MONA", "1900150", 10, 10, 20, 59));
        	Subject s = new Subject("Math", "12", 100, students);
        	File file = new File("T0.txt");
        	try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		try {
			x = new Scanner(new File("T0.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 save = a + " " +b + " " ;
				 actual += save;
			}
			assertEquals(expected, actual, "OutputWritter::Test14 failed");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
    @Test
    public void test15() {
    	ArrayList<Student> students = new ArrayList<>();
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("/root/output.txt");
        IOException exception = assertThrows(IOException.class, () -> {
            OutputWritter.WriteFile(s, file);
        });
        assertTrue(exception.getMessage() != null && !exception.getMessage().isEmpty());
    }	
}
