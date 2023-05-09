import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ValidateStudentTest {
    StudentBuilder studentBuilder;
    SubjectBuilder subjectBuilder;
    String input;

    @Test
    public void TestCase1() {
        input = "Daniel William,87654328,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);
        } catch (Exception e) {
            fail("Fail in Test Case1");
        }
    }

    @Test
    public void TestCase2() {
        input = ",,,,,";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.EmptyField_STRING + " Sutudent Name Line: " + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase3() {
        input = "Daniel William,876,54328,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (IllegalArgumentException e) {
            assertEquals(Constants.Student_LINE_STRING + ": line " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase4() {
        input = ",87654328,7,3,20,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Name Line: " + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase5() {
        input = "Daniel William,,7,3,20,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNumberException e) {
            assertEquals(Constants.EmptyField_STRING + "Student Code Line: " + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase6() {
        input = "Daniel William,87654328,,3,20,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase7() {

        input = "Daniel William,87654328,5,,20,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase8() {
        input = "Daniel William,87654328,4,3,,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase9() {
        input = "Daniel William,87654328,4,3,20,"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase10() {
        input = " Daniel William,87654328,7,3,20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase11() {
        input = "Daniel William, 87654328,7,3,20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase12() {
        input = "Daniel William,87654328, 7,3,20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase13() {
        input = "Daniel William,87654328,7, 3,20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase14() {
        input = "Daniel William,87654328,7,3, 20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase15() {
        input = "Daniel William,87654328,7,3,20, 52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase16() {
        input = "Danie5 William,87654328,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.Student_LINE_Name_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase17() {
        input = "Daniel William,876541111128,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNumberException e) {
            assertEquals(Constants.Student_LINE_Code_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase18() {
        input = "Daniel William,876aa128,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNumberException e) {
            assertEquals(Constants.Student_LINE_Code_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase19() {
        input = "Daniel William,87654128,$,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase20() {
        input = "Daniel William,87654128,5,#,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase21() {
        input = "Daniel William,87654128,5,3,2$,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase22() {
        input = "Daniel William,87654128,5,3,20,5@";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase23() {
        input = "Daniel William,87654128,-7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase24() {
        input = "Daniel William,87654128,7,-3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    public void TestCase25() {
        input = "Daniel William,87654128,7,3,-20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }

    public void TestCase26() {
        input = "Daniel William,87654128,7,3,20,-52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase27() {
        input = "Daniel William,87654128,16,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase28() {
        input = "Daniel William,87654128,10,13,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase29() {
        input = "Daniel William,87654128,10,3,22,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase30() {
        input = "Daniel William,87654128,10,3,20,100";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }

    }

}
