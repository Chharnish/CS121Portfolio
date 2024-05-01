import java.io.Serializable;
import java.util.ArrayList;

public class SpecialStudent extends Student implements Serializable {
    private double percentage;
    private char grade;
    private int accessLevel;
    private String accommodations;
    public SpecialStudent(String fName, String lName, int ID, int access, String accommodations){
        super(fName, lName, ID);
        this.grade = getLetterGrade();
        this.percentage = getPercentageGrade();
        this.accommodations = accommodations;
        this.accessLevel = access;
    }
    public void setAccommodations(String acco) {
        this.accommodations = acco;
    }
    public void setAccessLevel(int access){
        this.accessLevel = access;
    }

    //methods
    private String getAccess(){
        String temp;
        switch(accessLevel){
            case 1:
                temp = "Faculty";
                break;
            case 2:
                temp = "Administrator";
                break;
            case 3:
                temp = "Exchange";
                break;
            case 4:
                temp = "Student Staff";
                break;
            default:
                temp = "Student";
                break;
        }
        return temp;
    }

    @Override
    public String toString(){
        return String.format("%s | Current Access: %s | Special Accommodations: \n%s", super.toString(), getAccess(), accommodations);
    }
}
