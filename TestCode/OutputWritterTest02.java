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

class OutputWritterTest02 {


	@Test
	void test() throws IllegalArgumentException{
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
}
