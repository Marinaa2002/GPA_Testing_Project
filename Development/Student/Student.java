public class Student {
    private String name;
    private String ID;
    private int activites;
    private int oral;
    private int midterm;
    private int finals;

    public Student(){
        
    }

    public Student(String name, String ID, int activites, int oral, int midterm, int finals) {
        this.name = name;
        this.ID = ID;
        this.activites = activites;
        this.oral = oral;
        this.midterm = midterm;
        this.finals = finals;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getActivites() {
        return activites;
    }

    public int getOral() {
        return oral;
    }

    public int getMidterm() {
        return midterm;
    }

    public int getFinal() {
        return finals;
    }
}
