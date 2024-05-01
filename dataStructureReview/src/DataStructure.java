import java.util.*;
public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //add items
    public void addStudentName(String name){
        studentList.add(name);
    }
    public void addAge(int age) {
        for (int i = 0; i < ageList.length; i++){
            if (ageList[i] == 0) {
                ageList[i] = age;
                break;
            }
        }
    }

    public void addMajorGpa(String major, Double GPA){
        majorGpaMap.put(major, GPA);
    }
    public void addNationality(String nationality){
        nationalityList.add(nationality);
    }
    public void addHomeTown(String hometown) {
        hometownStack.push(hometown);
    }
    public void addHomeState(String homeState){
        homeStateQueue.add(homeState);
    }

    //print items
    public void printName(){
        for (String Student : studentList) {
            System.out.println(Student);
        }
    }
    public void printAge(){
        for (int j : ageList) {
            if (j != 0){
                System.out.println("Age: " + j);
            }
        }
    }
    public void printMajor(){
        StringBuilder str = new StringBuilder();
        majorGpaMap.forEach( (major, gpa) -> {
            str.append(String.format("Major: %s, GPA: %s\n", major, gpa));
        });
        System.out.println(str);
    }
    public void printNationality() {
        System.out.printf("Nationalities: %s\n", nationalityList);
    }
    public void printHomeTown() {
        System.out.println("Hometowns: " + hometownStack);
    }
    public void printHomeState() {
            System.out.println("Home State: " + homeStateQueue);

    }

    //remove items
    public void remStudentName(String name){
        studentList.remove(name);
    }
    public void remAge(int age){
        for (int i = 0; i < ageList.length ;i++) {
            if (ageList[i] == age){
                ageList[i] = 0;
            }
        }
    }
    public void remMajorGPA(String major) {
        majorGpaMap.remove(major);
    }
    public void remNationality(String Nationality) {
        nationalityList.remove(Nationality);
    }
    public void remHomeTown(){
        hometownStack.pop();
    }
    public void remHomeState(String homeState){
        homeStateQueue.poll();
    }


}
