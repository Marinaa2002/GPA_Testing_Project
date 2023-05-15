
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ghaith
 */
public class Main {

    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
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
            System.out.println("To continue enter Y program will terminate otherwise:");
            String cont = s.nextLine();
            if(!cont.equalsIgnoreCase("y")){
                break;
            }
        }
        System.out.println("Press Enter to exit..");
        System.in.read();
    }

}
