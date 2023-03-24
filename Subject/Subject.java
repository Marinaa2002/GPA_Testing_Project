import java.util.*;

public class Subject {
	private String name;
	private String ID;
	private int fullMark;
	private ArrayList<Student> students;
  
  public Subject(){
    
  }
	
	public Subject(String name, String id, int fullMark, ArrayList<Student> students) {
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
  
	public int getFullMark() {
		return fullMark;
	}
  
	public Iterator<Student> getStudents_copy() {
		return students.iterator();
	}
}
