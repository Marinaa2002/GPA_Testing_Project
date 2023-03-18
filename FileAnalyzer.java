import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileAnalyzer {
    ArrayList<String> words;
    Subject subject;
    SubjectBuilder subjectBuilder;
    Student student;
    StudentBuilder studentBuilder;

    public void analyze() {
        String myfile, myline;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        myfile = scan.nextLine();

        try {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufread = new BufferedReader(fileReader);

            // reading the file, line by line
            while ((myline = bufread.readLine()) != null)
                words.add(myline);
            bufread.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        //To validate Validate

    }

    public void validate(ArrayList<String> lines) throws IllegalArgumentException {
        ValidateFirstLine(lines.get(0));
        for (int i = 1; i < lines.size(); i++) {
            ValidateStudents(lines.get(i));
        }
        subject=subjectBuilder.build();
    }

    private static boolean checkStringAlphabetic(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]},;:'\"<.>/?";
        char currentCharacter;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = true;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = false;
            }
        }

        return (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
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

        return
                numberPresent && (upperCasePresent || lowerCasePresent) && specialCharacterPresent;
    }

    public void ValidateFirstLine(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count != 2) {
            throw new IllegalArgumentException();
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 2; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            //if not contain (,)
            if (EachStringInLine.charAt(0) != ' ') {
                if (i == 0) {
                    if (checkStringAlphabetic(EachStringInLine)) {
                        subjectBuilder = new SubjectBuilder();
                        subjectBuilder.setName(EachStringInLine);
                    }
                } else if (i == 1) {
                    if (EachStringInLine.length() == 6 || EachStringInLine.length() == 7) {
                        if (EachStringInLine.length() == 7) {
                            if (EachStringInLine.charAt(6) != 's') {
                                throw new IllegalArgumentException();
                            } else {
                                if (checkStringAlphaNumeric(EachStringInLine)) {
                                    for (int a = 0; a < EachStringInLine.length(); a++) {
                                        if (Character.isDigit(EachStringInLine.charAt(a))) {
                                            if (a == 0 || a == 1 || a == 2) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                    subjectBuilder.setId(EachStringInLine);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();

                    }
                }
            }
        }
        EachStringInLine = "";
        String FullMark = "100";
        for (int i = 0; i < EachStringInLine.length(); i++) {
            if (FullMark.charAt(i) != EachStringInLine.charAt(i)) {
                throw new IllegalArgumentException();
            }
        }
        subjectBuilder.setFullMark(EachStringInLine);

    }

    public void ValidateStudents(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                count++;
            }
        }
        if (count < 5 || count > 5) {
            throw new IllegalArgumentException();
        }
        String EachStringInLine = "";
        int start = 0;
        for (int i = 0; i < 5; i++) {
            EachStringInLine = "";
            for (int j = start; j < s.length(); j++) {
                if (s.charAt(j) != ',') {
                    EachStringInLine += s.charAt(j);
                } else {
                    start = j + 1;
                    break;
                }
            }
            if (EachStringInLine.charAt(0) != ' ') {
                if (i == 0) {
                    if (checkStringAlphabetic(EachStringInLine)) {
                        studentBuilder=new StudentBuilder();
                        studentBuilder.setName(EachStringInLine);
                    }
                } else if (i == 1) {
                    if (EachStringInLine.length() == 8) {
                        if (checkStringAlphaNumeric(EachStringInLine)) {
                            for (int a = 0; a < EachStringInLine.length(); a++) {
                                if (!Character.isDigit(EachStringInLine.charAt(a))&&a!=7) {
                                    throw new IllegalArgumentException();
                                }
                            }
                            studentBuilder.setId(EachStringInLine);
                        }
                        else {
                            throw new IllegalArgumentException();
                        }
                    }
                    else {
                        throw new IllegalArgumentException();

                    }
                }
                else if(i==2||i==3) {
                    for (int a = 0; a < EachStringInLine.length(); a++) {
                        if (!Character.isDigit(EachStringInLine.charAt(a))) {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (Integer.parseInt(EachStringInLine) > 10 || Integer.parseInt(EachStringInLine) < 0) {
                        throw new IllegalArgumentException();
                    }
                    // Check if int
                    if (i == 2) {
                        studentBuilder.setActivities(Integer.parseInt(EachStringInLine));
                    }
                    else if(i==3){
                        studentBuilder.setOral(Integer.parseInt(EachStringInLine));
                    }
                }
                else if(i==4){
                    for (int a = 0; a < EachStringInLine.length(); a++) {
                        if (!Character.isDigit(EachStringInLine.charAt(a))) {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (Integer.parseInt(EachStringInLine) > 20 || Integer.parseInt(EachStringInLine) < 0) {
                        throw new IllegalArgumentException();
                    }
                    studentBuilder.setMidterm(Integer.parseInt(EachStringInLine));
                }
            }
        }
        for (int a = 0; a < EachStringInLine.length(); a++) {
            if (!Character.isDigit(EachStringInLine.charAt(a))) {
                throw new IllegalArgumentException();
            }
        }
        if (Integer.parseInt(EachStringInLine) > 60 || Integer.parseInt(EachStringInLine) < 0) {
            throw new IllegalArgumentException();
        }
        studentBuilder.setFinalExam(Integer.parseInt(EachStringInLine));
        subjectBuilder.addStudent(studentBuilder.build());
    }


    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer=new FileAnalyzer();
        fileAnalyzer.analyze();
    }
}
