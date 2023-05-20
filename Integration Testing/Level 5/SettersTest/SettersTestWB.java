
import org.junit.jupiter.api.Test;

import source.Student;
import source.StudentBuilder;
import source.Subject;
import source.SubjectBuilder;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//this class is concerned with testing all the setter methods of the Subject, SubjectBuilder, Student, StudentBuilder

public class SettersTestWB {
    @Test
    void Test1setName() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setName("English");
        Subject subject = subjectBuilder.build();
        assertEquals("English", subject.getName(),"subject name is incorrect");
    }

 
   @Test
    void Test2setID() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setId("CSE301s");
        Subject subject = subjectBuilder.build();
        assertEquals("CSE301s", subject.getID(),"subject code is incorrect");

    }

     @Test
    void Test3setFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(100);
        Subject subject = subjectBuilder.build();
        assertEquals(100, subject.getFullMark(),"subject full mark is incorrect");
    }

    @Test
    void Test4setFullMark() {
        SubjectBuilder subjectBuilder = new SubjectBuilder();
        subjectBuilder.setFullMark(-1);
        Subject subject = subjectBuilder.build();
        assertEquals(-1, subject.getFullMark(),"subject full mark is incorrect");
    }

    @Test
    void Test5setName() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setName("Philopateer Moheb");
        Student s=studentBuilder.build();
        assertEquals("Philopateer Moheb",s.getName(),"student name is incorrect");
    }

    @Test
    void Test6setID() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setId("1901000");
        Student s=studentBuilder.build();
        assertEquals("1901000",s.getID(),"student code is incorrect");
    }

    @Test
    void Test7setActivites() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setActivities(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getActivites(),"student activities are incorrect");
    }

    @Test
    void Test8setOral() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setOral(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getOral(),"student oral marks are incorrect");
    }

    @Test
    void Test9setMidterm() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setMidterm(15);
        Student s=studentBuilder.build();
        assertEquals(15,s.getMidterm(),"student midterm marks are incorrect");
    }

    @Test
    void Test10setFinal() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setFinalExam(50);
        Student s=studentBuilder.build();
        assertEquals(50,s.getFinal(),"student final exam mark is incorrect");

    }
}