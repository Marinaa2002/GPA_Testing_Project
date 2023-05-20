/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
 * @author Ghaith
 */
public class FileAnalyzerWB_BPCTest {
    
    public FileAnalyzerWB_BPCTest() {
    }
    
    
     @Test
     public void testReadFileWB_BPC1() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException{

          File myfile = new File("test cases/FA_WB_BPC_1.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.EM_STRING, e.getMessage(),"error in test case 1");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC2() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
         File myfile = new File("test cases/FA_WB_BPC_2.docx");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.invalidfile, e.getMessage(),"error in test case 2");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC3() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("test cases/FA_WB_BPC_3.txtaa");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.invalidfile, e.getMessage(),"error in test case 3");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC4() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("non");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.EM_STRING, e.getMessage(),"error in test case 4");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC5() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("test cases/FA_WB_BPC_5.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC6() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("test cases/FA_WB_BPC_6.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (FullMarkException e ) {
             assertEquals(Constants.FULL_MARK_EXCEPTION_MSG, e.getMessage(),"error in test case 6");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC7() throws FileNotFoundException,RuntimeException, IllegalArgumentException, IOException {
         File myfile = new File("a");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.invalidfile, e.getMessage(),"error in test case 7");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
      @Test
     public void testReadFileWB_BPC8() throws FileNotFoundException,RuntimeException, IllegalArgumentException, IOException {
         File myfile = new File("test cases/FA_WB_BPC_8.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.INVALIDLINE1_STRING, e.getMessage(),"error in test case 8");
             return;
         }
         fail("program did not throw SpaceException ");
 
     }
     @Test
    public void testReadFileWB_BPC9() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
       
        File myfile = new File("test cases/FA_WB_BPC_9.txt");
        Subject result = FileAnalyzer.ReadFile(myfile);
        try ( FileReader FR = new FileReader(myfile);  BufferedReader BR = new BufferedReader(FR)) {
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
                    Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            if (BR.readLine() != null) {
                fail("number of expected not correct!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("passed.");
    }
    @Test
    public void testReadFileWB_BPC10() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {

        File myfile = new File("test cases/FA_WB_BPC_10.txt");
        Subject result = FileAnalyzer.ReadFile(myfile);
        try ( FileReader FR = new FileReader(myfile);  BufferedReader BR = new BufferedReader(FR)) {
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
                    Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            if (BR.readLine() != null) {
                fail("number of expected not correct!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileAnalyzerWB_BPCTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("passed.");
    }
    
    
 
}
