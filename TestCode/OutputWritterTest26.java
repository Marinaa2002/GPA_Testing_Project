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

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

class OutputWritterTest26 {

	@Test
	void test() {
		String a, b , c , actual, save = "";
		Scanner x;
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

}
