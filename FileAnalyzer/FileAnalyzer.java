import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileAnalyzer {
    private static ArrayList<String> words;
    private static Subject subject;
    private static SubjectBuilder subjectBuilder;
    private Student student;
    private static StudentBuilder studentBuilder;

    public static Subject ReadFile(File myfile) throws IllegalArgumentException, RuntimeException {

        words = new ArrayList<>();
        if (myfile.length() == 0) {
            throw new IllegalArgumentException(Constants.EM_STRING);
        }
        try {
            String fileString = myfile.getName();
            int counterExtension = 0;
            String extension = "";
            for (int i = fileString.length() - 3; i < fileString.length(); i++) {
                extension += fileString.charAt(i);
                counterExtension++;
                if (counterExtension == 3) {
                    break;
                }
            }
            if (!extension.equals("txt")) {
                throw new IllegalArgumentException(Constants.invalidfile);
            }
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufread = new BufferedReader(fileReader);

            // reading the file, line by line
            String myline;
            while ((myline = bufread.readLine()) != null) {
                if (!myline.isEmpty())
                    words.add(myline);
            }
            bufread.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        // To validate Validate
        validate(words);
        ArrayList<Student> students = new ArrayList<>();
        Iterator it = subject.getStudents_copy();
        while (it.hasNext()) {
            students.add((Student) it.next());
        }
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getID().equals(students.get(j).getID())) {
                    throw new StudentNumberException(Constants.STUDE_DUP_STRING + students.get(i).getName() + " -> "
                            + students.get(j).getName());
                }
            }
        }
        System.out.println("\nSuccessful input operation\n");

        return subject;
    }

    private static void validate(ArrayList<String> lines) throws IllegalArgumentException {
        ValidateFirstLine(lines.get(0));
        for (int i = 1; i < lines.size(); i++) {
            ValidateStudents(lines.get(i), i);
        }
        subject = subjectBuilder.build();
    }

    private static boolean checkStringAlphabetic(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]},;:'\"<.>/?";
        char currentCharacter;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean numberPresent = true;
        boolean specialCharacterPresent = true;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isDigit(currentCharacter)) {
                numberPresent = false;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = false;
            }
        }

        return numberPresent && (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
    }

    private static boolean checkStringAlphaNumeric(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = true;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = false;
            }
        }

        return numberPresent && (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
    }

    private static void ValidateFirstLine(String s) throws RuntimeException {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count != s.length()) {
            if (count != 2) {
                throw new IllegalArgumentException(Constants.INVALIDLINE1_STRING);
            }
        } else {
            throw new SubjectNameException(Constants.EMPTY_LINE_STRING);
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 3; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            if (!EachStringInLine.isEmpty()) {
                // if not contain (,)
                if (EachStringInLine.charAt(0) != ' ') {
                    EachStringInLine = EachStringInLine.trim();
                    if (i == 0) {
                        if (checkStringAlphabetic(EachStringInLine)) {
                            subjectBuilder = new SubjectBuilder();
                            subjectBuilder.setName(EachStringInLine);
                        } else {
                            throw new SubjectNameException(Constants.ALPHA_ONLY_STRING);
                        }
                    } else if (i == 1) {
                        if (EachStringInLine.length() == 6 || EachStringInLine.length() == 7) {
                            if (EachStringInLine.length() == 7) {
                                if (EachStringInLine.charAt(6) != 's') {
                                    throw new SubjectCodeException(Constants.LAST_LETTER_STRING);
                                }

                            }
                            if (checkStringAlphaNumeric(EachStringInLine)) {
                                for (int a = 0; a < EachStringInLine.length(); a++) {
                                    if (Character.isDigit(EachStringInLine.charAt(a))) {
                                        if (a == 0 || a == 1 || a == 2) {
                                            throw new SubjectCodeException(Constants.Invalid_Record_Subject_STRING);
                                        }
                                    } else {
                                        if (a == 3 || a == 4 || a == 5) {
                                            throw new SubjectCodeException(Constants.Invalid_Record_Subject_STRING);
                                        }
                                    }
                                }
                                subjectBuilder.setId(EachStringInLine);
                            } else {
                                throw new SubjectCodeException(Constants.Invalid_Record_Subject_STRING);
                            }
                        } else {
                            throw new SubjectCodeException(Constants.Invalid_Record_Subject_STRING);

                        }
                    }
                } else {
                    throw new SpaceException(Constants.SPACE_STRING);
                }
            } else {
                if (i == 0) {
                    throw new SubjectNameException(Constants.EmptyField_STRING + "Subject Name");

                }
                if (i == 1) {
                    throw new SubjectCodeException(Constants.EmptyField_STRING + "Subject Code");

                }
            }
        }
        if (EachStringInLine.isEmpty()) {
            throw new FullMarkException(Constants.EmptyField_STRING + "Subject Full Mark");
        }
        int FullMark = 100;
        EachStringInLine = EachStringInLine.trim();
        for (int a = 0; a < EachStringInLine.length(); a++) {
            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                throw new FullMarkException(Constants.FULL_MARK_EXCEPTION_MSG);
            }
        }
        int FullMarkEachStringInLine = Integer.parseInt(EachStringInLine);
        if (FullMark != FullMarkEachStringInLine) {
            throw new FullMarkException(Constants.FULL_MARK_EXCEPTION_MSG);
        }
        subjectBuilder.setFullMark(FullMarkEachStringInLine);
    }

    private static void ValidateStudents(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count != s.length()) {
            if (count < 5 || count > 5) {
                throw new IllegalArgumentException(Constants.Student_LINE_STRING + ": line " + (k + 1));
            }
        } else {
            throw new StudentNameException(Constants.EmptyField_STRING + " Sutudent Name Line: " + (k + 1));
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 6; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            if (!EachStringInLine.isEmpty()) {
                if (EachStringInLine.charAt(0) != ' ') {
                    EachStringInLine = EachStringInLine.trim();
                    if (i == 0) {
                        if (checkStringAlphabetic(EachStringInLine)) {
                            studentBuilder = new StudentBuilder();
                            studentBuilder.setName(EachStringInLine);
                        } else {
                            throw new StudentNameException(
                                    Constants.Student_LINE_Name_STRING + (k + 1));
                        }
                    } else if (i == 1) {
                        if (EachStringInLine.length() == 8) {
                            for (int a = 0; a < EachStringInLine.length(); a++) {
                                if (!Character.isDigit(EachStringInLine.charAt(a)) && a != 7) {
                                    throw new StudentNumberException(
                                            Constants.Student_LINE_Code_STRING + (k + 1));
                                }
                            }
                            studentBuilder.setId(EachStringInLine);
                        } else {
                            throw new StudentNumberException(Constants.Student_LINE_Code_STRING + (k + 1));
                        }
                    } else if (i == 2 || i == 3) {
                        for (int a = 0; a < EachStringInLine.length(); a++) {
                            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                                throw new StudentMarkException(
                                        Constants.Student_LINE_Activites_oral_STRING + (k + 1));
                            }
                        }
                        if (Integer.parseInt(EachStringInLine) > 10 || Integer.parseInt(EachStringInLine) < 0) {
                            throw new StudentMarkException(
                                    Constants.Student_LINE_Activites_oral_STRING + (k + 1));
                        }
                        // Check if int
                        if (i == 2) {
                            studentBuilder.setActivities(Integer.parseInt(EachStringInLine));
                        } else if (i == 3) {
                            studentBuilder.setOral(Integer.parseInt(EachStringInLine));
                        }
                    } else if (i == 4) {
                        for (int a = 0; a < EachStringInLine.length(); a++) {
                            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                                throw new StudentMarkException(Constants.Student_LINE_Mid_STRING + (k + 1));
                            }
                        }
                        if (Integer.parseInt(EachStringInLine) > 20 || Integer.parseInt(EachStringInLine) < 0) {
                            throw new StudentMarkException(Constants.Student_LINE_Mid_STRING + (k + 1));
                        }
                        studentBuilder.setMidterm(Integer.parseInt(EachStringInLine));
                    }
                } else {
                    throw new SpaceException(Constants.SPACE_STRING + (k + 1));
                }
            } else {
                if (i == 0) {
                    throw new StudentNameException(Constants.EmptyField_STRING + " Student Name Line: " + (k + 1));
                } else if (i == 1) {
                    throw new StudentNumberException(Constants.EmptyField_STRING + "Student Code Line: " + (k + 1));
                } else {
                    throw new StudentMarkException(Constants.EmptyField_STRING + " Student Mark Line: " + (k + 1));
                }

            }
        }
        EachStringInLine = EachStringInLine.trim();
        if (EachStringInLine.isEmpty()) {
            throw new StudentMarkException(Constants.EmptyField_STRING + " Student Mark");
        }
        for (int a = 0; a < EachStringInLine.length(); a++) {
            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                throw new StudentMarkException(Constants.Student_LINE_Final_STRING + (k + 1));
            }
        }
        if (Integer.parseInt(EachStringInLine) > 60 || Integer.parseInt(EachStringInLine) < 0) {
            throw new StudentMarkException(Constants.Student_LINE_Final_STRING + (k + 1));
        }
        studentBuilder.setFinalExam(Integer.parseInt(EachStringInLine));
        subjectBuilder.addStudent(studentBuilder.build());
    }

    public static void main(String[] args) {
        File file = new File("D:\\3rd computer\\2nd Term\\Testing\\Projects\\MyProject_v1\\src\\record.txt");
        Subject S = FileAnalyzer.ReadFile(file);
    }
}