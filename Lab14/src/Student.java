import java.util.LinkedList;
public class Student {
    private String fName;
    private String lName;
    private Double GPA;
    private int ID;
    private String major;
    private String classStanding;
    private LinkedList<String> coursesList = new LinkedList<>();

    //constructor
    public Student(String fName, String lName, Double GPA, int ID, String major, String classStanding){
        this.fName = fName;
        this.lName = lName;
        this.GPA = GPA;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
    }
    //getters & setters
    public String getFName() {
        return fName;
    }
    public String getLName() {
        return lName;
    }
    public Double getGPA() {
        return GPA;
    }
    public int getID(){
        return ID;
    }
    public String getMajor() {
        return major;
    }
    public String getClassStanding() {
        return classStanding;
    }
    public LinkedList<String> getCoursesList(){
        return coursesList;
    }

    public void addCourse(String course){
        coursesList.add(course);
    }
    public void remCourse(String course){
        coursesList.remove(course);
    }
    public void sortCourse() {
        String temp;
        for (int i = 0; i < coursesList.size(); i++) {
            for (int j = i; j < coursesList.size(); j++){
                if ((coursesList.get(i).compareTo(coursesList.get(j))) > 0){
                    temp = coursesList.get(i);
                    coursesList.set(i, coursesList.get(j));
                    coursesList.set(j, temp);
                }
            }
        }

    }
    public String displayCourseList() {
        StringBuilder courses = new StringBuilder();
        for (String course : coursesList){
            courses.append(course + "\n");
        }
        return courses.toString();
    }

    @Override
    public String toString(){
        return String.format("%s %s \nGPA: %s\nID: %d\nMajor: %s\n Class Standing: %s\n", fName, lName, GPA, ID, major, classStanding);
    }
}
