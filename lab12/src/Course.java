public class Course {
    private int courseNum;
    private int CRN;
    private String course;

    //constructor
    public Course(String course, int CRN, int courseNum){
        this.courseNum = courseNum;
        this.CRN = CRN;
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public int getCRN(){
        return CRN;
    }
    public int getCourseNum(){
        return courseNum;
    }
    @Override
    public String toString(){
        return String.format("%s %s CRN: %s", course, courseNum, CRN);
    }
}
