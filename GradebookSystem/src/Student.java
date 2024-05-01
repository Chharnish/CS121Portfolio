import java.io.Serializable;
import java.util.ArrayList;
public class Student implements Serializable {
    protected String fName;
    protected String lName;
    protected int ID;
    private double percentage;
    private char grade;
    private ArrayList<Assignment> assignmentsList = new ArrayList<>();

    public Student(String fName, String lName, int ID) {
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
        this.percentage = getPercentageGrade();
        this.grade = getLetterGrade();
    }

    //setters
    public void setFName(String fName){
        this.fName = fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    //getters
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public int getID() {
        return ID;
    }
    //methods
    public void updateGrade(){
        this.percentage = getPercentageGrade();
        this.grade = getLetterGrade();
    }
    public double getPercentageGrade(){
        double exams = 0;
        double assignments = 0;
        for (Assignment assignment : assignmentsList) {
            if (assignment.getAwardedPoints() != -1.0) {
                if (assignment.getExam().equalsIgnoreCase("yes")) {
                    exams += assignment.getPercentage();
                } else {
                    assignments += assignment.getPercentage();
                }
            }
        }
        if (exams != 0.0 && assignments != 0.0) {
            exams = exams * .70;
            assignments = assignments * .30;
        }
        return (exams + assignments)*100;
    }
    public char getLetterGrade(){
        char grade = 'I';
        int finGrade = (int)  (getPercentageGrade()* 100) ;
        if (finGrade > 90) {
            grade = 'A';
        } else if (finGrade > 80) {
            grade = 'B';
        } else if (finGrade > 70) {
            grade = 'C';
        } else if (finGrade > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public void addAssignment(Assignment assignment) {
        assignmentsList.add(assignment);
        updateGrade();
    }
    public void remAssignment(Assignment assignment){
        assignmentsList.remove(assignment);
        updateGrade();
    }
    public Assignment getAssignment(String assignment) {
        Assignment foundAssignment = null;
        for (Assignment currAssignment : assignmentsList){
            if (currAssignment.getName().equalsIgnoreCase(assignment)){
                foundAssignment = currAssignment;
            }
        }
        return foundAssignment;
    }
    public ArrayList<Assignment> getAssignmentsList(){
        return assignmentsList;
    }

    @Override
    public String toString(){
        return String.format("Student: %s %s | ID: %s | Current Grade: %s | Percentage: %.2f%%", fName, lName, ID, grade, percentage);
    }
}
