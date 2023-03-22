import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CaseGenerator {
    //generates files with random sizes but with inputs with ther required format
    public static void main(String[] args) throws IOException {
        String[] names = {"mina", "mounir", "ghaith", "bassam", "monica", "adel", "ghali", "khalil", "zaza", "marina", "milad", "tadros", "gendi", "zaza", "barsoum", "roman", "reigns", "bray"};
        Random r = new Random();
        FileWriter fwriter ;
        for (int i = 1; i <= 20; i++) {
            fwriter = new FileWriter(new File("F:\\3rd computer\\2nd term\\Software Testing\\project\\TEST cases\\Fa_TC" + i + ".txt"));

            StringBuilder sb = new StringBuilder();

            int n = r.nextInt(200, 5000);
            for (int j = 0; j < n; j++) {
                for(int k = 0 ; k < 4 ; k ++)
                    sb.append(names[r.nextInt(names.length)]+" ");
                sb.deleteCharAt(sb.lastIndexOf(" "));
                sb.append("," + r.nextLong(10000000, 20000000));
                sb.append("," + r.nextInt(0, 11));
                sb.append("," + r.nextInt(0, 11));
                sb.append("," + r.nextInt(0, 21));
                sb.append("," + r.nextInt(0, 60));
                sb.append("\n");
                fwriter.write(sb.toString());
               
            }

            System.out.println("operation " + i + " is complete");
        }

    }

}
