import java.util.*;

public class Subject {
	private String name;
	private String ID;
	private String fullMark;
	private ArrayList<Student> students;
  
  public Subject(){
    
  }
	
	public Subject(String name, String id, String fullMark, ArrayList<Student> students) {
		this.name = name;
		this.ID = id;
		this.fullMark = fullMark;
		this.students = students;
	}
  
	public String getName() {
		return name;
	}
  
	public String getID() {
		return ID;
	}
  
	public String getFullMark() {
		return fullMark;
	}
  
	public Iterator<Student> getStudents_copy() {
		return students.iterator();
	}
}
