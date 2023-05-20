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
public class FileAnalyzerWB_DUTest {
    
    public FileAnalyzerWB_DUTest() {
    }
    
    
     
      @Test
     public void testReadFileWB_DU1() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {
         File myfile = new File("test cases/FA_WB_DU1.x");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (IllegalArgumentException e) {
             assertEquals(Constants.invalidfile, e.getMessage(),"error in test case 2");
             return;
         }
         fail("program did not throw Exception ");
 
     }
     
      @Test
     public void testReadFileWB_DU2() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("test cases/FA_WB_DU2.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (StudentNumberException e) {
             
             return;
         }
         fail("program did not throw Exception ");
 
     }
      @Test
     public void testReadFileWB_DU3() throws FileNotFoundException ,RuntimeException, IllegalArgumentException, IOException{
         File myfile = new File("test cases/FA_WB_DU3.txt");
         try {
             Subject result = FileAnalyzer.ReadFile(myfile);
         } catch (FullMarkException e ) {
             assertEquals(Constants.FULL_MARK_EXCEPTION_MSG, e.getMessage(),"error in test case 6");
             return;
         }
         fail("program did not throw Exception ");
 
     }
    
    @Test
    public void testReadFileWB_DU4() throws FileNotFoundException, RuntimeException, IllegalArgumentException, IOException {

        File myfile = new File("test cases/FA_WB_DU4.txt");
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
