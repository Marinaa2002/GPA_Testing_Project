
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    @Test
    public void TestgetName() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setName("Philopateer Moheb");
        Student s = studentBuilder.build();
        assertEquals("Philopateer Moheb", s.getName());
    }

    @Test
    public void TestgetID() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setId("1901000");
        Student s = studentBuilder.build();
        assertEquals("1901000", s.getID());
    }

    @Test
    public void TestgetActivites() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setActivities(8);
        Student s = studentBuilder.build();
        assertEquals(8, s.getActivites());
    }

    @Test
    public void TestgetOral() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setOral(8);
        Student s = studentBuilder.build();
        assertEquals(8, s.getOral());
    }

    @Test
    public void TestgetMidterm() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setMidterm(15);
        Student s = studentBuilder.build();
        assertEquals(15, s.getMidterm());
    }

    @Test
    public void TestgetFinal() {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setFinalExam(50);
        Student s = studentBuilder.build();
        assertEquals(50, s.getFinal());

    }
}