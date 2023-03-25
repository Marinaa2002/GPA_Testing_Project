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
public class FileAnalyzerTest01 {

    public FileAnalyzerTest01() {
    }

    @Test
    public void testReadFile1() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE01                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Fa_TC01:");
        File myfile = new File("test cases/Fa_TC01.txt");
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
                    Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            if (BR.readLine() != null) {
                fail("number of expected not correct!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileAnalyzerTest01.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("passed.");
    }

   

}
