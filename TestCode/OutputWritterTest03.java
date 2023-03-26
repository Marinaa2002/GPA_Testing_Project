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
	void test() {
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
}
