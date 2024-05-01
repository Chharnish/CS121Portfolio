import java.util.Map;
import java.util.HashMap;
public class StudentRecord {
    private Map <Integer, Student> students = new HashMap<>();
    //methods
    public void addStudent(Integer ID, Student student) {
        students.put(ID, student);
    }
    public void removeStudent(Integer ID){
        students.remove(ID);
    }
    public Map<Integer, Student> getStudents() {
        return students;
    }

    public String getStudent(Integer ID) {
        String foundStudent = null;
        if (students.containsKey(ID)) {
            foundStudent = String.valueOf(students.get(ID));
        }
        return foundStudent;
    }
    public StringBuilder getAllStudents() {
        StringBuilder allStudents = new StringBuilder();
        students.forEach( (ID, student) -> {
            allStudents.append(String.format("ID: %s\n %s", ID, student));
        });
        return allStudents;
    }
}
