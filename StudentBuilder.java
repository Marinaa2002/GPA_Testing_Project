/**
 *
 * @author Mina Mounir
 */
//Builds a Student object 
public class StudentBuilder {
    private String name ;
    private String id; 
    private int activities ;
    private int oral ;
    private int midterm ;
    private int finalExam ;
    //setters for Student object attributes ;
    public void setActivities(int activities) {
        this.activities = activities;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOral(int oral) {
        this.oral = oral;
    }
    //returns the Student object whose attributes are filled out
    public Student build()
    { 
       return new Student(name , id , activities , oral ,midterm , finalExam) ;
    }
   
}
