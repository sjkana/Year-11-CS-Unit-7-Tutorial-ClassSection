public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }
    public int getId(){return getStudentCount();}
    public String getFirstName(){return this.firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getLastName(){return this.lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public int getAge(){return this.age;}
    public void setAge(int age){this.age = age;}
    public int getYearLevel(){return this.yearLevel;}
    public void setYearLevel(int yearLevel){this.yearLevel = yearLevel;}
    public int getStudentCount(){return studentCount;}

    public boolean equals(Student studentB)
    {
        if(getFirstName().equals(studentB.getFirstName()) && getLastName().equals(studentB.getLastName())&&getAge() == (studentB.getAge())&&getYearLevel()==(studentB.getYearLevel()))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Student{id=" + getId() + ", firstName='"+getFirstName()+"', lastName='"+getLastName()+"', age="+getAge()+", yearLevel="+getYearLevel()+"}";
    }

}
