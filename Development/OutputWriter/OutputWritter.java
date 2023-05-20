import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ghaith
 */
public class OutputWritter {

    public static void WriteFile(Subject subject, File file) throws IOException {
        try (FileWriter writter = new FileWriter(file)) {
            int fm = subject.getFullMark();
            writter.write("Subject Name: " + subject.getName() + "\tMax Mark: " + fm + "\n");
            // for(Student student:subject.getStudents_copy()){
            subject.getStudents_copy().forEachRemaining((student) -> {
                int mark = (student.getMidterm() + student.getOral() + student.getActivites() + student.getFinal())
                        * 100 / fm;
                float gpa;
                String grade;
                if (mark > 100 || mark < 0)
                    throw new FullMarkException(Constants.FULL_MARK_EXCEPTION_MSG);
                if (mark >= 97) {
                    gpa = 4f;
                    grade = "A+";
                } else if (mark >= 93) {
                    gpa = 4;
                    grade = "A";
                } else if (mark >= 89) {
                    gpa = 3.7f;
                    grade = "A-";
                } else if (mark >= 84) {
                    gpa = 3.3f;
                    grade = "B+";
                } else if (mark >= 80) {
                    gpa = 3f;
                    grade = "B";
                } else if (mark >= 76) {
                    gpa = 2.7f;
                    grade = "B-";
                } else if (mark >= 73) {
                    gpa = 2.3f;
                    grade = "C+";
                } else if (mark >= 70) {
                    gpa = 2f;
                    grade = "C";
                } else if (mark >= 67) {
                    gpa = 1.7f;
                    grade = "C-";
                } else if (mark >= 64) {
                    gpa = 1.3f;
                    grade = "D+";
                } else if (mark >= 60) {
                    gpa = 1f;
                    grade = "D";
                } else {
                    gpa = 0;
                    grade = "F";
                }

                try {
                    writter.write("Student name: " + student.getName() + "\tStudent number: " + student.getID()
                            + "\tGPA: " + gpa + "\tGrade: " + grade + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(OutputWritter.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        }
    }
}
