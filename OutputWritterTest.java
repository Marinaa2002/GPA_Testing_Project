package OutputTest;
import Output.OutputWritter;
import Output.Student;
import Output.Subject;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class OutputWritterTest {
	String a,b,c,actual,save ="";
	Scanner x;
	@Test
	void test1() throws IllegalArgumentException{
	 	ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",10,20,20,60));
		Subject s = new Subject("Math","12",100,students);
        File myfile = new File("TO.txt");
        try {
			OutputWritter.WriteFile(s, myfile);
		}catch(IOException e) {
			 e.printStackTrace();
		}catch (IllegalArgumentException e) {
        System.out.println("passed.");
        return;
        }
        fail("program did not throw lllegalArgumentException");
	}
	
	@Test
	void test2() throws IllegalArgumentException{
	 	ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",10,10,25,60));
		Subject s = new Subject("Math","12",100,students);
        File myfile = new File("TO.txt");
        try {
			OutputWritter.WriteFile(s, myfile);
		}catch(IOException e) {
			e.printStackTrace();	
		}catch (IllegalArgumentException e) {
			System.out.println("passed.");
            return;
        }
        fail("program did not throw lllegalArgumentException");
	}
	
	@Test
	void test3() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",10,10,20,60));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test4() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",10,10,20,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test5() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",10,9,20,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test6() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",8,9,19,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test7() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 4.0 Grade: A ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,10,19,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test8() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,10,17,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	@Test
	void test9() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.7 Grade: A- ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,58));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test10() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,56));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test11() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.3 Grade: B+ ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,53));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test12() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,51));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test13() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 3.0 Grade: B ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,49));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test14() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,48));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test15() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.7 Grade: B- ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",6,8,17,45));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test16() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 9, 10, 50));
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
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test17() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.3 Grade: C+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 8, 10, 50));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T1.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T1.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void test18() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 6, 10, 50));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T2.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T2.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void test19() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 2.0 Grade: C ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 10, 50));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T3.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T3.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test20() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 48));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T4.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T4.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test21() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.7 Grade: C- ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 50));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T10.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T10.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test22() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 46));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T5.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T5.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test23() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.3 Grade: D+ ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 45));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T6.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T6.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test24() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 43));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T7.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T7.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test25() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 1.0 Grade: D ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 41));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T8.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T8.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test26() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MONA", "1900150", 5, 5, 9, 38));
        Subject s = new Subject("Math", "12", 100, students);
        File file = new File("T9.txt");
        try {
			OutputWritter.WriteFile(s, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			x = new Scanner(new File("T9.txt"));
			while(x.hasNext()) {
				 a = x.next();
				 b = x.next();
				 actual = a + " " +b + " " ;
				 save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test failed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test27() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",5,5,9,26));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test28() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",5,5,5,18));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test29() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",5,5,5,10));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test30() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",0,0,5,5));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	void test31() {
		String expected = "Subject Name: Math Max Mark: 100 "
				+ "Student name: MONA Student number: 1900150 GPA: 0.0 Grade: F ";
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",0,0,0,0));
		Subject s = new Subject("Math","12",100,students);
		File file = new File("To.txt");
		try {
			OutputWritter.WriteFile(s, file);
		}catch(IOException e) {
				e.printStackTrace();
		}
		try {
			x = new Scanner(new File("To.txt"));
			while(x.hasNext()) {
				a = x.next();
				b = x.next();
				actual = a + " " + b + " ";
				save += actual;
			}
			assertEquals(expected, save, "OutputWritter::Test Failed");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void test32() throws IllegalArgumentException{
	 	ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",-5,0,0,0));
		Subject s = new Subject("Math","12",100,students);
        File myfile = new File("TO.txt");
        try {
			OutputWritter.WriteFile(s, myfile);
		}catch(IOException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			System.out.println("passed.");
            return;
        }
        fail("program did not throw lllegalArgumentException");
	}
	
	@Test
	void test33() throws IllegalArgumentException{
	 	ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("MONA", "1900150",-5,-2,-2,-1));
		Subject s = new Subject("Math","12",100,students);
        File myfile = new File("TOr.txt");
        try {
			OutputWritter.WriteFile(s, myfile);
		}catch(IOException e) {
				e.printStackTrace();
		}catch (IllegalArgumentException e) {
                System.out.println("passed.");
                return;
        }
        fail("program did not throw lllegalArgumentException");
	}
}
