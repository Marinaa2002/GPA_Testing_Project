import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import org.junit.jupiter.api.Test;

import math.Constants;
import math.FullMarkException;
import math.OutputWritter;
import math.Student;
import math.Subject;

class OutputWritterTestBVA {

	@Test
	void test1() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 61));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T0.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (FullMarkException e) {
			assertEquals(expected, e.getMessage(), "OutputWritter::Test1 failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test2() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 60));
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
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 58));
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
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 57));
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
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 56));
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
        students.add(new Student("MONA", "1900150", 10, 10, 20, 54));
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
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 53));
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
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 52));
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
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 20, 50));
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
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 19, 50));
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
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 18, 50));
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
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 15, 50));
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
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 14, 50));
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
			assertEquals(expected, actual, "OutputWritter::Test13 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test14() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 13, 50));
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
	void test15() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 11, 50));
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
			assertEquals(expected, actual, "OutputWritter::Test15 failed");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test16() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 50));
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
			assertEquals(expected, actual, "OutputWritter::Test16 failed");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test17() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 49));
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
			assertEquals(expected, actual, "OutputWritter::Test17 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test18() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 47));
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
			assertEquals(expected, actual, "OutputWritter::Test18 failed");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test19() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 46));
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
			assertEquals(expected, actual, "OutputWritter::Test19 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test20() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 45));
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
			assertEquals(expected, actual, "OutputWritter::Test20 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test21() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 44));
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
			assertEquals(expected, actual, "OutputWritter::Test21 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test22() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 43));
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
			assertEquals(expected, actual, "OutputWritter::Test22 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test23() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 42));
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
			assertEquals(expected, actual, "OutputWritter::Test23 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test24() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 41));
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
			assertEquals(expected, actual, "OutputWritter::Test24 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test25() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 40));
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
			assertEquals(expected, actual, "OutputWritter::Test25 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test26() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 39));
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
			assertEquals(expected, actual, "OutputWritter::Test26 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test27() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 38));
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
			assertEquals(expected, actual, "OutputWritter::Test27 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test28() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 37));
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
			assertEquals(expected, actual, "OutputWritter::Test28 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test29() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 36));
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
			assertEquals(expected, actual, "OutputWritter::Test29 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test30() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 35));
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
			assertEquals(expected, actual, "OutputWritter::Test30 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test31() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 34));
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
			assertEquals(expected, actual, "OutputWritter::Test31 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test32() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 33));
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
			assertEquals(expected, actual, "OutputWritter::Test32 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test33() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 31));
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
			assertEquals(expected, actual, "OutputWritter::Test33 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test34() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 30));
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
			assertEquals(expected, actual, "OutputWritter::Test34 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test35() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 10, 10, 10, 29));
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
			assertEquals(expected, actual, "OutputWritter::Test35 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test36() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 0, 0, 0, 0));
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
			assertEquals(expected, actual, "OutputWritter::Test36 failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test37() { 
		String a, b , save, actual = "";
	    Scanner x;
		String expected = Constants.FULL_MARK_EXCEPTION_MSG;
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", -1, 0, 0, 0));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T0.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (FullMarkException e) {
			assertEquals(expected, e.getMessage(), "OutputWritter::Test37 failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
