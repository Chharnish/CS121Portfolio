import java.util.Scanner;
public class Menu {
    public StudentRecord allStudents = new StudentRecord();
    public Scanner input = new Scanner(System.in);

    public void getMenu(){
        String sel = "";
        while (!sel.equalsIgnoreCase("5")) {


            System.out.println("""
                    ***************Menu***************
                    Select an option:
                    1) Add a Student
                    2) Remove a Student
                    3) Display student info
                    4) Display all Student info
                    5) Quit
                                    """);
            System.out.print(">>> ");
            sel = input.next();
            switch (sel) {
                case "1":
                    createStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    displayStudent();
                    break;
                case "4":
                    displayAllStudents();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        }
        System.out.println("Exiting...");
    }
    public void createStudent(){
        System.out.println("Please enter the name of the student.");
        String studentName = input.next();
        System.out.println("Please enter the GPA of the student.");
        Double GPA = input.nextDouble();
        Student newStudent = new Student(studentName, GPA);
        allStudents.addStudent(newStudent.getID(), newStudent);
        String sel = "";
        while ( !sel.equalsIgnoreCase("q")) {
            System.out.println("Please enter the course you would like to add or type q to quit");
            sel = input.next();
            if (!sel.equalsIgnoreCase("q")) {
                System.out.println("Please input the course number for the course.");
                int courseNum = input.nextInt();
                System.out.println("Please enter the CRN of the course you would like to add.");
                int CRN = input.nextInt();
                Course newCourse = new Course(sel, CRN, courseNum);
                newStudent.addCourse(sel, newCourse);
                System.out.println("Course successfully added!");
            }
        }

    }
    public void deleteStudent() {
        System.out.println("Please input the ID of the student you wish to delete out of existence... from the record.");
        Integer sel = input.nextInt();
        if (allStudents.getStudent(sel) != null) {
            allStudents.removeStudent(sel);
            System.out.println("bye bye");
        }
        else{
            System.out.println("Student not found!!!");
        }
    }
    public void displayStudent() {
        System.out.println("Please input the ID of the student you wish to display!");
        Integer sel = input.nextInt();
        if (allStudents.getStudent(sel) != null){
            String currStudent = allStudents.getStudent(sel);
            System.out.println(currStudent);
        }
        else{
            System.out.println("Student not found!!!");
        }
    }
    public void displayAllStudents() {
        System.out.println(allStudents.getAllStudents());

    }
}
