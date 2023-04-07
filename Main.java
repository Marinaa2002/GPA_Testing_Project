
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ghaith
 */
public class Main {

    public static void main(String args[]) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("insert input file directory:");
            File input = new File(s.nextLine());
            Subject subject = FileAnalyzer.ReadFile(input);
            System.out.println("insert output directory:");
            File output = new File(s.nextLine());
            OutputWritter.WriteFile(subject, output);
            System.out.println("done.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
