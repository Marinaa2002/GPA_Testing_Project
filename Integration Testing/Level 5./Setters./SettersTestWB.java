
import org.junit.jupiter.api.Test;

import Student;
import StudentBuilder;
import Subject;
import SubjectBuilder;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettersTestWB {
    @Test
    void Test1setName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("English");
        Subject subject = subjectBuilder.build();
        assertEquals("English", subject.getName());
    }

 
   @Test
    void Test2setID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("CSE301s");
        Subject subject = subjectBuilder.build();
        assertEquals("CSE301s", subject.getID());

    }

     @Test
    void Test3setFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(100);
        Subject subject = subjectBuilder.build();
        assertEquals(100, subject.getFullMark());
    }

    @Test
    void Test4setFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(-1);
        Subject subject = subjectBuilder.build();
        assertEquals(-1, subject.getFullMark());
    }

    @Test
    void Test5setName() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setName("Philopateer Moheb");
        Student s=studentBuilder.build();
        assertEquals("Philopateer Moheb",s.getName());
    }

    @Test
    void Test6setID() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setId("1901000");
        Student s=studentBuilder.build();
        assertEquals("1901000",s.getID());
    }

    @Test
    void Test7setActivites() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setActivities(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getActivites());
    }

    @Test
    void Test8setOral() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setOral(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getOral());
    }

    @Test
    void Test9setMidterm() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setMidterm(15);
        Student s=studentBuilder.build();
        assertEquals(15,s.getMidterm());
    }

    @Test
    void Test10setFinal() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setFinalExam(50);
        Student s=studentBuilder.build();
        assertEquals(50,s.getFinal());

    }
}
