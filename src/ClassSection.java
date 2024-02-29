import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String subject, int capacity, int yearLevel)
    {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject(){return this.subject;}
    public void setSubject(String subject){this.subject = subject;}
    public int getCapacity(){return this.capacity;}
    public void setCapacity(int capacity){this.capacity = capacity;}
    public int getYearLevel(){return this.yearLevel;}
    public void setYearLevel(int yearLevel){this.yearLevel = yearLevel;}
    public ArrayList getStudents(){return students;}

    public void addStudent(Student student)
    {
        if(student.getYearLevel() == yearLevel && !isStudentEnrolled(student)){students.add(student);}
    }
    public void removeStudent(Student student)
    {
        students.remove(student);
    }
    public boolean isStudentEnrolled(Student student)
    {
        return students.contains(student);
    }
    public String toString()
    {
        return "ClassSection{subject='" + getSubject()+"', capacity="+getCapacity()+", yearLevel="+getYearLevel()+", students=[]}";
        //ClassSection{subject='Art', capacity=10, yearLevel=12, students=[]}
    }
}
