import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectTest {
    @org.junit.jupiter.api.Test
    void Test1getName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("Philopateer Moheb");
        Subject subject = subjectBuilder.build();
        assertEquals("Philopateer Moheb", subject.getName());
    }

    @org.junit.jupiter.api.Test
    void Test2getName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("@@@");
        Subject subject = subjectBuilder.build();
        assertEquals("@@@", subject.getName());
    }

    @org.junit.jupiter.api.Test
    void Test1getID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("1");
        Subject subject = subjectBuilder.build();
        assertEquals("1", subject.getID());

    }

    @org.junit.jupiter.api.Test
    void Test2getID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("1000000");
        Subject subject = subjectBuilder.build();
        assertEquals("1000000", subject.getID());
    }

    @Test
    void Test1getFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(100);
        Subject subject = subjectBuilder.build();
        assertEquals(100, subject.getFullMark());
    }

    @Test
    void Test2getFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(-1);
        Subject subject = subjectBuilder.build();
        assertEquals(-1, subject.getFullMark());
    }

    @Test
    void Test1getStudents_copy() {
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
    void Test2getStudents_copy() {
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