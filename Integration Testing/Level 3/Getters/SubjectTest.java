
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class SubjectTest {
    @Test
    public void Test1getName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("English");
        Subject subject = subjectBuilder.build();
        assertEquals("English", subject.getName());
    }

    @org.junit.jupiter.api.Test
    public void Test2getName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("Discrete Math");
        Subject subject = subjectBuilder.build();
        assertEquals("Discrete Math", subject.getName());
    }

    @org.junit.jupiter.api.Test
    public void Test1getID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("CSE301s");
        Subject subject = subjectBuilder.build();
        assertEquals("CSE301s", subject.getID());

    }

    @org.junit.jupiter.api.Test
    public void Test2getID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("CSE100");
        Subject subject = subjectBuilder.build();
        assertEquals("CSE100", subject.getID());
    }

    @Test
    public void Test1getFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(100);
        Subject subject = subjectBuilder.build();
        assertEquals(100, subject.getFullMark());
    }

    @Test
    public void Test2getFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(-1);
        Subject subject = subjectBuilder.build();
        assertEquals(-1, subject.getFullMark());
    }

    @Test
    public void Test1getStudents_copy() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        Student s2 = new Student("Samir mossad", "12", 10, 10, 15, 50);
        Student s1 = new Student("Philopateer Moheb", "12", 10, 10, 15, 50);
        subjectBuilder.addStudent(s1);
        subjectBuilder.addStudent(s2);

        Subject subject = subjectBuilder.build();
        Iterator<Student> studentIterator = subject.getStudents_copy();
        ArrayList<Student> Actual = new ArrayList<>();
        ArrayList<Student> Expected = new ArrayList<>();
        Expected.add(s1);
        Expected.add(s2);
        while (studentIterator.hasNext()) {
            Actual.add(studentIterator.next());
        }
        assertArrayEquals(Expected.toArray(), Actual.toArray());
    }

    @Test
    public void Test2getStudents_copy() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        Student s2 = new Student("Samir mossad", "10000", 10, 10, 15, 50);
        Student s1 = new Student("Philopateer Moheb", "121212", 10, 10, 15, 50);
        subjectBuilder.addStudent(s1);
        subjectBuilder.addStudent(s2);

        Subject subject = subjectBuilder.build();
        Iterator<Student> studentIterator = subject.getStudents_copy();
        ArrayList<Student> Actual = new ArrayList<>();
        ArrayList<Student> Expected = new ArrayList<>();
        Expected.add(s1);
        Expected.add(s2);
        while (studentIterator.hasNext()) {
            Actual.add(studentIterator.next());
        }
        assertArrayEquals(Expected.toArray(), Actual.toArray());
    }
}