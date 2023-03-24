import java.util.ArrayList;

/**
 *
 * @author Mina Mounir
 */
//Builds a Subject object 
public class SubjectBuilder {
    private String name ;
    private String id ;
    private int fullMark ;
    ArrayList<Student> students ;
    //constructor to intialize the ArrayList 
    public SubjectBuilder() {
        students = new ArrayList<>();
    }
    //setters for Subject object attributes ;
    public void setFullMark(int fullMark) {
        this.fullMark = fullMark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Adds new student to the subject's list of students 
    public void addStudent(Student s)
    { 
        students.add(s);
    }
    //returns the Subject object whose attributes are filled out
    public Subject build()
    { 
        return new Subject(name , id , fullMark , students);
    }

   
}
