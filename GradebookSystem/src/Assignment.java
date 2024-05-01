import java.io.Serializable;

public class Assignment implements Serializable                {
    private String name;
    private char grade;
    private double totalPoints;
    private double awardedPoints;
    private double percentage;
    private boolean exam;

    public Assignment(String name, double totalPoints, double awardedPoints, boolean isExam) {
        this.name = name;
        this.totalPoints = totalPoints;
        this.awardedPoints = awardedPoints;
        this.grade = getCharGrade();
        this.exam = isExam;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }
    public void setExam(Boolean exam){
        this.exam = exam;
    }
    public void setAwardedPoints(double points){
        this.awardedPoints = points;
    }
    public void updateGrade(){
        this.percentage = awardedPoints/totalPoints*100.0;
        this.grade = getCharGrade();
    }
    //getters
    public String getName(){
        return name;
    }
    public char getGrade() {
        return grade;
    }
    public double getPercentage() {
        return percentage/100.0;
    }
    public double getAwardedPoints(){
        return awardedPoints;
    }

    public double getTotalPoints() {
        return totalPoints;
    }
    public String getExam() {
        if (exam) {
            return "Yes";
        }else{
            return "No";
        }
    }

    private char getCharGrade() {
    char grade;
        int finGrade = (int) percentage;
    if (finGrade > 90) {
        grade = 'A';
    } else if (finGrade > 80) {
        grade = 'B';
    } else if (finGrade > 70) {
        grade = 'C';
    } else if (finGrade > 60) {
        grade = 'D';
    } else if (awardedPoints == -1.0) {
        grade = 'I';
    }else {
                grade = 'F';
            }

        return grade;
    }

    @Override
    public String toString(){
        return String.format("Assignment: %s | Grade: %s %.2f%% | %s out of %s | Exam: %s", name, grade, percentage, awardedPoints, totalPoints, getExam());
    }
}
