package source;

 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 /**
  *
  * @author Mina Mounir Farid 
  */
    public class ReadFileTestBB{
        ReadFileTestBB()
        { 

        }
     @Test
     public void testReadFileBB01() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC01.txt");
         Subject result = FileAnalyzer.ReadFile(myfile);
         try ( FileReader FR = new FileReader(myfile);
           BufferedReader BR = new BufferedReader(FR)) {
             String[] subjectProb = BR.readLine().split(",");
             assertEquals(subjectProb[0], result.getName());
             assertEquals(subjectProb[1], result.getID());
             assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
             result.getStudents_copy().forEachRemaining((student) -> {
                 String line;
                 String[] studentProb;
                 try {
                     if ((line = BR.readLine()) != null) {
                         studentProb = line.split(",");
                         assertEquals(student.getName(), studentProb[0]);
                         assertEquals(student.getID(), studentProb[1]);
                         assertEquals(student.getActivites(), Integer.parseInt(studentProb[2]));
                         assertEquals(student.getOral(), Integer.parseInt(studentProb[3]));
                         assertEquals(student.getMidterm(), Integer.parseInt(studentProb[4]));
                         assertEquals(student.getFinal(), Integer.parseInt(studentProb[5]));
                     } else {
                         fail("number of expected not correct!");
                     }
                 } catch (IOException ex) {
                     Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
                 }
             });
             if (BR.readLine() != null) {
                 fail("number of expected not correct!");
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         }
         System.out.println("passed.");
     }

     @Test
     public void testReadFileBB02() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC02.txt");
         Subject result = FileAnalyzer.ReadFile(myfile);
         try ( FileReader FR = new FileReader(myfile);
           BufferedReader BR = new BufferedReader(FR)) {
             String[] subjectProb = BR.readLine().split(",");
             assertEquals(subjectProb[0], result.getName());
             assertEquals(subjectProb[1], result.getID());
             assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
             result.getStudents_copy().forEachRemaining((student) -> {
                 String line;
                 String[] studentProb;
                 try {
                     if ((line = BR.readLine()) != null) {
                         studentProb = line.split(",");
                         assertEquals(student.getName(), studentProb[0]);
                         assertEquals(student.getID(), studentProb[1]);
                         assertEquals(student.getActivites(), Integer.parseInt(studentProb[2]));
                         assertEquals(student.getOral(), Integer.parseInt(studentProb[3]));
                         assertEquals(student.getMidterm(), Integer.parseInt(studentProb[4]));
                         assertEquals(student.getFinal(), Integer.parseInt(studentProb[5]));
                     } else {
                         fail("number of expected not correct!");
                     }
                 } catch (IOException ex) {
                     Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
                 }
             });
             if (BR.readLine() != null) {
                 fail("number of expected not correct!");
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         }
         System.out.println("passed.");
     }
 
     @Test
     public void testReadFileBB03() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC03.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectNameException e) {
             assertEquals(Constants.ALPHA_ONLY_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }

     @Test
     public void testReadFileBB04() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC04.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SpaceException e) {
             assertEquals(Constants.SPACE_STRING, e.getMessage(),"error in test case 4");
             return;
         }
         fail("program did not throw SpaceException ");
      }
     @Test
     public void testReadFileBB05() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC05.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 5");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB06() throws FileNotFoundException {
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC06.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB07() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC07.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB08() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC08.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB09() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC09.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB10() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC10.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectCodeException e) {
             assertEquals(Constants.LAST_LETTER_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB11() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC11.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (FullMarkException e) {
             assertEquals(Constants.FULL_MARK_EXCEPTION_MSG, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB12() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC12.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (FullMarkException e) {
             assertEquals(Constants.FULL_MARK_EXCEPTION_MSG, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB13() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC13.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNameException e) {
             assertEquals(Constants.Student_LINE_Name_STRING+"9", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB14() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC14.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SpaceException e) {
            assertTrue(e.getMessage().contains(Constants.SPACE_STRING), "error in test case 14");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB15() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC15.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             assertEquals(Constants.Student_LINE_Code_STRING+"22", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB16() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC16.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             assertEquals(Constants.Student_LINE_Code_STRING+"12", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB17() throws FileNotFoundException {
 
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC17.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             assertEquals(Constants.Student_LINE_Code_STRING+"10", e.getMessage(),"error in test case 3");
             return;
         }
         fail("StudentNumberException");
 
     }
     @Test
     public void testReadFileBB18() throws FileNotFoundException {
;
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC18.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             assertEquals(Constants.Student_LINE_Code_STRING+"18", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB19() throws FileNotFoundException {
 
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC19.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING+"2", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB20() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC20.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING+"3", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB21() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC21.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Activites_oral_STRING+"5", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB22() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC22.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentMarkException e) {
             assertEquals(Constants.Student_LINE_Mid_STRING+"2", e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB23() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC23.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentMarkException e) {
             assertTrue(e.getMessage().contains(Constants.EmptyField_STRING),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB24() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC24.json");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.invalidfile, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB25() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC25.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.EM_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB26() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC26.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertTrue(e.getMessage().contains(Constants.Student_LINE_STRING),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB27() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC27.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SubjectNameException e) {
             assertEquals(Constants.EMPTY_LINE_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB28() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC28.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNameException e) {
             assertTrue(e.getMessage().contains(Constants.EmptyField_STRING),"error in test case 28");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB29() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC29.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.Invalid_Record_Subject_STRING, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw Illegal Argument");
 
     }
     @Test
     public void testReadFileBB30() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC30.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertTrue(e.getMessage().contains(Constants.Student_LINE_STRING),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB31() throws FileNotFoundException {

         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC31.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (SpaceException e) {
             assertTrue(e.getMessage().contains(Constants.SPACE_STRING),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
     public void testReadFileBB32() throws FileNotFoundException {
         
         File myfile = new File("F://3rd computer//2nd term//Software Testing//project//TEST cases//newest file analyzer test cases//Fa_BBTC32.txt");
         Subject result = FileAnalyzer.ReadFile(myfile);
         try ( FileReader FR = new FileReader(myfile);
           BufferedReader BR = new BufferedReader(FR)) {
             String[] subjectProb = BR.readLine().split(",");
             assertEquals(subjectProb[0], result.getName());
             assertEquals(subjectProb[1], result.getID());
             assertEquals(Integer.parseInt(subjectProb[2]), result.getFullMark());
             result.getStudents_copy().forEachRemaining((student) -> {
                 String line;
                 String[] studentProb;
                 try {
                     if ((line = BR.readLine()) != null) {
                         studentProb = line.split(",");
                         assertEquals(student.getName(), studentProb[0]);
                         assertEquals(student.getID(), studentProb[1]);
                         assertEquals(student.getActivites(), Integer.parseInt(studentProb[2]));
                         assertEquals(student.getOral(), Integer.parseInt(studentProb[3]));
                         assertEquals(student.getMidterm(), Integer.parseInt(studentProb[4]));
                         assertEquals(student.getFinal(), Integer.parseInt(studentProb[5]));
                     } else {
                         fail("number of expected not correct!");
                     }
                 } catch (IOException ex) {
                     Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
                 }
             });
             if (BR.readLine() != null) {
                 fail("number of expected not correct!");
             }
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ReadFileTestBB.class.getName()).log(Level.SEVERE, null, ex);
         }
         System.out.println("passed.");
     }


 }