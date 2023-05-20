
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
                System.out.println(Constants.INPUT_MASSAGE);
                File input = new File(s.nextLine());
                Subject subject = FileAnalyzer.ReadFile(input);
                System.out.println(Constants.OUTPUT_MASSAGE);
                File output = new File(s.nextLine());
                OutputWritter.WriteFile(subject, output);
                System.out.println(Constants.SUCCESS_MASSAGE);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Constants.RESTART_MASSAGE);
            String cont = s.nextLine();
            if(!cont.equalsIgnoreCase("y")){
                break;
            }
        }
        System.out.println(Constants.EXIT_MASSAGE);
        System.in.read();
    }

}
