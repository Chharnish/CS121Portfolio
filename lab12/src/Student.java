import java.util.Map;
import java.util.HashMap;
public class Student {
    private String name;
    private static int ID = 100000;
    private Double GPA;
    private Map <String, Course> courses = new HashMap<>();

    //constructor
    public Student(String name, Double GPA){
        ID++;
        this.name = name;
        this.GPA = GPA;
    }
    //getters & setters
    public String getName() {
        return name;
    }
    public Double getGPA() {
        return GPA;
    }
    public int getID() {
        return ID;
    }
    public void addCourse(String cName, Course course){
        courses.put(cName, course);
    }
    public void remCourse(String cName){
        courses.remove(cName);
    }

    public String getCourse(String courseName){
        String foundCourse = null;
        if (courses.containsKey(courseName)){
            foundCourse = String.valueOf(courses.get(courseName));
        }
        return foundCourse;
    }
    public StringBuilder displayCourseList() {
        StringBuilder courseStr = new StringBuilder();
        courses.forEach( (cName, course) -> {
            courseStr.append(String.format("Course Name: %s \n %s", cName, course));
        });
        return courseStr;
    }

    @Override
    public String toString(){
        return String.format("%s \nGPA: %s\n", name, GPA);
    }
}
