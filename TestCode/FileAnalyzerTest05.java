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
public class FileAnalyzerTest05 {

    public FileAnalyzerTest05() {
    }

    @Test
    public void testReadFile5() throws FileNotFoundException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////                CASE05                      ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Fa_TC05:");
        File myfile = new File("test cases/Fa_TC05.txt");
        try {
            Subject result = FileAnalyzer.ReadFile(myfile);
        } catch (SubjectNameException | SubjectCodeException e) {
            System.out.println("passed.");
            return;
        }
        fail("program did not throw SubjectNameException ");

    }

}
