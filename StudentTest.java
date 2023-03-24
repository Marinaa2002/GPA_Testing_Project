import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void TestgetName() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setName("Philopateer Moheb");
        Student s=studentBuilder.build();
        assertEquals("Philopateer Moheb",s.getName());
    }

    @Test
    void TestgetID() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setId("1901000");
        Student s=studentBuilder.build();
        assertEquals("1901000",s.getID());
    }

    @Test
    void TestgetActivites() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setActivities(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getActivites());
    }

    @Test
    void TestgetOral() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setOral(8);
        Student s=studentBuilder.build();
        assertEquals(8,s.getOral());
    }

    @Test
    void TestgetMidterm() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setMidterm(15);
        Student s=studentBuilder.build();
        assertEquals(15,s.getMidterm());
    }

    @Test
    void TestgetFinal() {
        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setFinalExam(50);
        Student s=studentBuilder.build();
        assertEquals(50,s.getFinal());

    }
}