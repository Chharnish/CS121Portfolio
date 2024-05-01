public class Student {
    String Name;
    String Year;
    String Major;
    int Age;
    double GPA;

    public Student(String name, String year, String major, int age, double gpa) {
        this.Name = name;
        this.Year = year;
        this.Major = major;
        this.Age = age;
        this.GPA = gpa;
    }

    public void printData() {
        System.out.printf("""
%s is a %s year with a major in %s.
%s is %d years old and has a GPA of %s
                """, Name, Year, Major, Name, Age, GPA);
    }

}
