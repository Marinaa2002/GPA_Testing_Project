
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ghaith
 */
public class MainTestPathBaseCoverage {

    public MainTestPathBaseCoverage() {
    }
    
    
    @Test
    public void testMainBaseCoverage1() throws Exception {
        String userInput = String.format("test cases/Fa_TC01.txt%sMainBaseCoverageTest1Out.txt%sN",
                System.lineSeparator(),
                System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String[] expectedLines = {Constants.INPUT_MASSAGE, Constants.OUTPUT_MASSAGE, Constants.SUCCESS_MASSAGE, Constants.RESTART_MASSAGE, Constants.EXIT_MASSAGE};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Main.main(null); // call the main method

        String[] actualLines = baos.toString().split(System.lineSeparator());

        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }

    }
    
    @Test
    public void testMainBaseCoverage2() throws Exception {
        String userInput = String.format("test cases/invalid.txt%sMainBaseCoverageTest2Out.txt%sN",
                System.lineSeparator(),
                System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String[] expectedLines = {Constants.INPUT_MASSAGE, Constants.EM_STRING, Constants.RESTART_MASSAGE, Constants.EXIT_MASSAGE};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Main.main(null); // call the main method

        String[] actualLines = baos.toString().split(System.lineSeparator());

        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }

    }
    
    @Test
    public void testMainBaseCoverage3() throws Exception {
        String out = "MainBaseCoverageTest3Out.txt";  // ** important ** : make sure to have MainBaseCoverageTest3Out.txt as read only file before running the test case
        String userInput = String.format("test cases/Fa_TC01.txt%s"+out+"%sN", 
                System.lineSeparator(),
                System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String[] expectedLines = {Constants.INPUT_MASSAGE, Constants.OUTPUT_MASSAGE, out + " (Access is denied)", Constants.RESTART_MASSAGE, Constants.EXIT_MASSAGE};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Main.main(null); // call the main method

        String[] actualLines = baos.toString().split(System.lineSeparator());

        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }

    }
    
    @Test
    public void testMainBaseCoverage4() throws Exception {
        String userInput = String.format("test cases/Fa_TC01.txt%sMainBaseCoverageTest1Out.txt%sy%stest cases/invalid.txt%sMainBaseCoverageTest2Out.txt%sN",
                System.lineSeparator(),
                System.lineSeparator(),
                System.lineSeparator(),
                System.lineSeparator(),
                System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String[] expectedLines = {Constants.INPUT_MASSAGE, Constants.OUTPUT_MASSAGE, Constants.SUCCESS_MASSAGE, Constants.RESTART_MASSAGE,Constants.INPUT_MASSAGE, Constants.EM_STRING, Constants.RESTART_MASSAGE, Constants.EXIT_MASSAGE};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Main.main(null); // call the main method

        String[] actualLines = baos.toString().split(System.lineSeparator());

        for (int i = 0; i < expectedLines.length; i++) {
            assertEquals(expectedLines[i], actualLines[i]);
        }

    }

}
