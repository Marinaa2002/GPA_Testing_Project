import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
public class ValidateStudentBlackBox {

    String input;

    @Test
    public void TestCase1ValidData() {
        input = "Nathan Samuel Adams,89547321,2,2,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);
        } catch (Exception e) {
            fail("Fail in Test Case1 Data");
        }
    }
     @Test
     public void TestCase2ValidData() {
         input = "Nathan Samuel Adams,8954732s,2,2,13,36";
         try {
             FileAnalyzer.ValidateStudents(input, 0);
         } catch (Exception e) {
             fail("Fail in Test Case2 ValidData");
         }
     }
     

    @Test
    public void TestCase1StudentName() {
        input = ",,,,,";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.EmptyField_STRING + " Sutudent Name Line: " + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase2StudentName() {
        input = ",8954732s,2,2,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Name Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase3StudentName() {
        input = "  Nathan Samuel Adams,89547321,2,2,13,36"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }
    }

    @Test
    public void TestCase4StudentName() {
        input = "Nath2q Samuel Adams,89547321,2,2,13,36"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentNameException e) {
            assertEquals(Constants.Student_LINE_Name_STRING + (0 + 1), e.getMessage());
        }
    }
    @Test
    public void TestCase5StudentName() {
        input = "Nath@n Samuel Adams,89547321,2,2,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);
        } catch (StudentNameException e) {
          assertEquals(Constants.Student_LINE_Name_STRING + (0 + 1), e.getMessage());

        }
    }
@Test
public void TestCase1StudentNumber() {
    input = "Nathan Samuel Adams,,2,2,13,36"; //Empty Student Name Record
    try {
        FileAnalyzer.ValidateStudents(input, 0);

    } catch (StudentNumberException e) {
        assertEquals(Constants.EmptyField_STRING + "Student Code Line: " + (0 + 1), e.getMessage());
    }
}
    @Test
    public void TestCase2StudentNumber() {
        input = "Nathan Samuel Adams,89547321,2,2,13,36"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }
     @Test
     public void TestCase3StudentNumber() {
         input = "Daniel William,876541111128,7,3,20,52";
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (StudentNumberException e) {
             assertEquals(Constants.Student_LINE_Code_STRING + (0 + 1), e.getMessage());
         }

     }
    
      @Test
      public void TestCase4StudentNumber() {
          input = "Daniel William,876aa128,7,3,20,52";
          try {
              FileAnalyzer.ValidateStudents(input, 0);

          } catch (StudentNumberException e) {
              assertEquals(Constants.Student_LINE_Code_STRING + (0 + 1), e.getMessage());
          }

      }
       @Test
    public void TestCase5StudentNumber() {
        input = "Daniel William,876,54328,7,3,20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (IllegalArgumentException e) {
            assertEquals(Constants.Student_LINE_STRING + ": line " + (0 + 1), e.getMessage());
        }

    }
    @Test
    public void TestCase1ActivitiesAndOral () {
        input = "Nathan Samuel Adams,89547321,,2,13,36"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase2ActivitiesAndOral() {

        input = "Nathan Samuel Adams,89547321,2,,13,36"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }
     @Test
     public void TestCase3ActivitiesAndOral() {
         input = "Nathan Samuel Adams,89547321, 2,2,13,36"; //Extra Space
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (SpaceException e) {
             assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
         }

     }
     @Test
     public void TestCase4ActivitiesAndOral() {
         input = "Nathan Samuel Adams,89547321,2, 2,13,36"; //Extra Space
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (SpaceException e) {
             assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
         }

     }
     @Test
     public void TestCase5ActivitiesAndOral() {
         input = "Nathan Samuel Adams,89547321,2@,2,13,36";
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
         }

     }
     @Test
     public void TestCase6ActivitiesAndOral() {
         input = "Nathan Samuel Adams,89547321,2,!,13,36";
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
         }

     }
    @Test
    public void TestCase7ActivitiesAndOral() {
        input = "Nathan Samuel Adams,89547321,-2,2,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }
    @Test
    public void TestCase8ActivitiesAndOral() {
        input = "Nathan Samuel Adams,89547321,2,-2,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }
     @Test
     public void TestCase9ActivitiesAndOral() {
         input = "Nathan Samuel Adams,89547321,15,2,13,36";
         try {
             FileAnalyzer.ValidateStudents(input, 0);

         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
         }

     }
    @Test
    public void TestCase10ActivitiesAndOral() {
        input = "Nathan Samuel Adams,89547321,2,15,13,36";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Activites_oral_STRING + (0 + 1), e.getMessage());
        }

    }


    @Test
    public void TestCase1Midterm() {
        input = "Daniel William,87654328,4,3,,52"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }
    @Test
    public void TestCase2Midterm() {
        input = "Daniel William,87654328,7,3, 20,52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }
    @Test
    public void TestCase3Midterm() {
        input = "Daniel William,87654128,5,3,2$,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase4Midterm() {
        input = "Daniel William,87654128,7,3,-20,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }
    @Test
    public void TestCase5Midterm() {
        input = "Daniel William,87654128,10,3,22,52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Mid_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase1FinalMark() {
        input = "Daniel William,87654328,4,3,20,"; //Empty Student Name Record
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.EmptyField_STRING + " Student Mark Line: " + (0 + 1), e.getMessage());
        }

    }
    
    @Test
    public void TestCase2FinalMark() {
        input = "Daniel William,87654328,7,3,20, 52"; //Extra Space
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (SpaceException e) {
            assertEquals(Constants.SPACE_STRING + (0 + 1), e.getMessage());
        }

    }

    @Test
    public void TestCase3FinalMark() {
        input = "Daniel William,87654128,5,3,20,5@";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }

    }


    public void TestCase4FinalMark() {
        input = "Daniel William,87654128,7,3,20,-52";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }
    }
    @Test
    public void TestCase5FinalMark() {
        input = "Daniel William,87654128,10,3,20,100";
        try {
            FileAnalyzer.ValidateStudents(input, 0);

        } catch (StudentMarkException e) {
            assertEquals(Constants.Student_LINE_Final_STRING + (0 + 1), e.getMessage());
        }

    }

}
