import java.io.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Menu {
    //Serialization used because I didn't know the json or xml method of saving objects when writing this and didn't want to port it forward at the time.
    private LinkedList<Student> enrStudents = new LinkedList<>();
    private Scanner input = new Scanner(System.in);

    public void mainMenu() throws FileNotFoundException {
        try{
            FileInputStream inFile = new FileInputStream("studentData.txt");
            ObjectInputStream inObj = new ObjectInputStream(inFile);
            enrStudents = (LinkedList<Student>) inObj.readObject();
            inObj.close();
            inFile.close();
        }
        catch (FileNotFoundException e){
            System.err.println("Could not locate file! New student file will be generated when program finishes.");
        }
        catch (IOException | ClassNotFoundException e) {
            System.err.println("An error has occurred");
        }
        String sel = "";
        while (!sel.equalsIgnoreCase("0")){
            System.out.println("""
            
            Main Menu
            ================
            0) Exit Program
            1) Access Student Menu
            2) Add assignment for all
            3) Remove assignment for all
            Note: All data automatically imported/exported to file named studentData.txt
            
            Please make a selection:
            """);
            sel = input.nextLine();
            switch(sel){
                case "0":
                    break;
                case "1":
                    studentMenu();
                    break;
                case "2":
                    addAllAssignment();
                    break;
                case "3":
                    removeAllAssignment();
                    break;
                default:
                    System.err.println("That was not a valid option!");
                    break;
            }
        }
        try{
            FileOutputStream outFile = new FileOutputStream("studentData.txt");
            ObjectOutputStream outObj = new ObjectOutputStream(outFile);
            outObj.writeObject(enrStudents);
            outObj.close();
            outFile.close();
        }
        catch(IOException e) {
            System.err.println("An error has occurred!");
        }
    }
    private void studentMenu() throws FileNotFoundException {
        String sel = "";
        while (!sel.equalsIgnoreCase("0")) {
            System.out.println("""
                
                Student menu
                =================
                0) Return to Main Menu
                1) Add Student
                2) Remove Student
                3) Access Student Assignment
                4) Generate Report Card
                5) Display all Students
                Please make a selection:
                """);
            sel = input.nextLine();
            switch(sel){
                case "0":
                    break;
                case "1":
                    addStudent();
                    break;
                case "2":
                    remStudent();
                    break;
                case "3":
                    assignmentMenu();
                    break;
                case "4":
                    generateReport();
                    break;
                case "5":
                    displayAllStudents();
                    break;
                default:
                    System.err.println("That was not a valid option!");
                    break;
            }
        }
    }
    private void assignmentMenu(){
        System.out.println("Please enter the ID of the student: ");
        int ID = input.nextInt();
        input.nextLine();
        Student currStudent = null;
        for (Student student : enrStudents) {
            if (student.getID() == ID){
                currStudent = student;
            }
        }

        if (currStudent != null) {
            String sel = "";
            while (!sel.equalsIgnoreCase("0")) {
                System.out.println(currStudent.toString());
                System.out.println("""
                        
                        Assignment Menu
                        =====================
                        0) Return to Student Menu
                        1) Add Assignment
                        2) Remove Assignment
                        3) Edit Assignment
                        4) Grade Assignment
                        5) Display all assignments
                        """);
                sel = input.nextLine();
                switch(sel) {
                    case "0":
                        break;
                    case "1":
                        addAssignment(currStudent);
                        break;
                    case "2":
                        remAssignment(currStudent);
                        break;
                    case "3":
                        editAssignment(currStudent);
                        break;
                    case "4":
                        gradeAssignment(currStudent);
                        break;
                    case "5":
                        displayAllAssignments(currStudent);
                        break;
                    default:
                        System.err.println("That was not a valid option!");
                        break;
                }
            }
        }else{
            System.err.println("Student not found!");
        }
    }
    private void displayAllStudents(){
        for (Student student : enrStudents) {
            System.out.println(student.toString());
        }
    }
    private void displayAllAssignments(Student student){
        for (Assignment assignment : student.getAssignmentsList()) {
            System.out.println(assignment.toString());
        }
    }
    private void addAssignment(Student student){
        for (Assignment currAssignment : student.getAssignmentsList()){
            System.out.println(currAssignment.toString());
        }
        System.out.print("Please enter the name of the assignment \n>>> ");
        String name = input.nextLine();
        System.out.print("\nPlease enter the max amount of points possible for this assignment\n>>> ");
        double maxPoints = input.nextDouble();
        input.nextLine();
        System.out.println("Is this an exam?(Y/N)");
        String temp = input.nextLine();
        Assignment newAssignment = new Assignment(name, maxPoints, -1.0, temp.equalsIgnoreCase("y"));
        student.addAssignment(newAssignment);
    }
    private void remAssignment(Student student) {
        for (Assignment currAssignment : student.getAssignmentsList()){
            System.out.println(currAssignment.toString());
        }
        System.out.print("Please enter the name of the assignment you'd like to remove\n>>> ");
        String name = input.nextLine();
        Assignment currAssignment = student.getAssignment(name);
        student.remAssignment(currAssignment);
    }
    private void editAssignment(Student student){
        for (Assignment currAssignment : student.getAssignmentsList()){
            System.out.println(currAssignment.toString());
        }
        System.out.print("Please enter the name of the assignment you wish to edit\n>>> ");
        String name = input.nextLine();
        Assignment currAssignment = null;
        for (Assignment assignment : student.getAssignmentsList()){
            if (assignment.getName().equalsIgnoreCase(name)){
                currAssignment = assignment;
            }
        }
        if (currAssignment != null) {
            System.out.println("Please enter the name of the assignment: ");
            name = input.nextLine();
            currAssignment.setName(name);
            System.out.println("Please enter the new total amount of points for: ");
            double totPoints = input.nextDouble();
            currAssignment.setTotalPoints(totPoints);
            System.out.println("Is this assignment an exam?(Y/N)");
            String exam = input.nextLine();
            currAssignment.setExam(exam.equalsIgnoreCase("y"));
        }else{
            System.err.println("Assignment not found!");
        }
    }
    private void gradeAssignment(Student student){
        for (Assignment currAssignment : student.getAssignmentsList()){
            System.out.println(currAssignment.toString());
        }
        System.out.print("Please enter the name of the assignment \n>>> ");
        String name = input.nextLine();
        Assignment currAssignment = null;
        for (Assignment assignment : student.getAssignmentsList()){
            if (assignment.getName().equalsIgnoreCase(name)){
                currAssignment = assignment;
            }
        }
        if (currAssignment != null) {
            double newGrade = -1.0;
            System.out.println(currAssignment.toString());
            while (!(0 < newGrade && newGrade < currAssignment.getTotalPoints()+1.0)){
                System.out.println("Please enter a new grade: ");
                newGrade = input.nextDouble();
                input.nextLine();
                currAssignment.setAwardedPoints(newGrade);
                currAssignment.updateGrade();
                student.updateGrade();
                if (!(0 < newGrade && newGrade < currAssignment.getTotalPoints()+1.0)){
                    System.err.println("Grade not in bounds!");
                }
                else{break;}
            }
        }

    }
    private void addStudent(){
        try {
            System.out.println("Last Student: ");
            System.out.println((enrStudents.getLast().toString()));
        }catch(NoSuchElementException e){
            System.out.println("No Students found");
        }
        System.out.println("Please enter the first name of the student: ");
        String fName = input.nextLine();
        System.out.println("Please enter the last name of the student: ");
        String lName = input.nextLine();
        System.out.println("Please enter the ID of the student: ");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Is this student a special access student(Y/N):");
        boolean isSpecial = (input.nextLine().equalsIgnoreCase("y"));
        if (isSpecial) {
            System.out.println("Please enter the access level for this student: (1-Faculty 2-Administrator 3-Exchange 4-Student Staff)");
            int access = input.nextInt();
            input.nextLine();
            System.out.println("Please enter any accommodations or notes for this student:");
            String accommodations = input.nextLine();
            Student newStudent = new SpecialStudent(fName, lName, ID, access, accommodations);
            enrStudents.add(newStudent);
            System.out.println("Student added successfully!");
        } else {
            Student newStudent = new Student(fName, lName, ID);
            enrStudents.add(newStudent);
            System.out.println("Student added successfully!");
        }
    }
    private void remStudent(){
        System.out.println("Please enter the ID of the student you wish to remove: ");
        int ID = input.nextInt();
        input.nextLine();
        Student currStudent = null;
        for (Student student : enrStudents) {
            if (student.getID() == ID){
                currStudent = student;
            }
        }
        if (currStudent != null){
            enrStudents.remove(currStudent);
            System.out.println("Student removed successfully!");
        }else{
            System.err.println("Student not found!");
        }
    }
    private void generateReport() throws FileNotFoundException{
        System.out.println("Please enter the ID of the student you wish to generate a report for: ");
        int ID = input.nextInt();
        input.nextLine();
        Student currStudent = null;
        for (Student student : enrStudents) {
            if(student.getID() == ID){
                currStudent = student;
            }
        }
        if (currStudent != null) {
            try{
                File outFile = new File(String.format("ReportCards/%s%sReportCard.txt", currStudent.getLName(), currStudent.getFName()));
                PrintWriter output = new PrintWriter(outFile);
                output.println(currStudent.toString());
                for (Assignment assignment : currStudent.getAssignmentsList()){
                    output.println(assignment.toString());
                }
                System.out.println("Report card generated for " + currStudent.getFName());
                output.close();
            }
            catch (IOException e) {
                //creating a directory if the ReportCards folder does not exist
                new File("ReportCards/").mkdirs();
                System.err.println("Unknown error has occurred! Please try again!");
            }
        }

    }
    private void addAllAssignment(){
        System.out.print("Please enter the name of the assignment \n>>> ");
        String name = input.nextLine();
        System.out.print("\nPlease enter the max amount of points possible for this assignment\n>>> ");
        double maxPoints = input.nextDouble();
        input.nextLine();
        System.out.println("Is this an exam?(Y/N)");
        String temp = input.nextLine();
        System.out.println("Applying assignments to all student...");
        for (Student student : enrStudents) {
            Assignment newAssignment = new Assignment(name, maxPoints, -1.0, temp.equalsIgnoreCase("y"));
            student.addAssignment(newAssignment);
            student.updateGrade();
        }

    }
    private void removeAllAssignment(){
        System.out.print("Please enter the name of the assignment you wish to remove\n>>> ");
        String name = input.nextLine();
        System.out.println("attempting to remove assignment from all...");
        int count = 0;
        for (Student student :enrStudents){
            Assignment currAssignment = student.getAssignment(name);
            if (currAssignment != null){
                student.remAssignment(currAssignment);
                count++;
            }
            student.updateGrade();
        }
        if (count != 0){
            System.out.printf("Successfully removed %d assignments!", count);
        }else{
            System.out.println("No assignments were removed!");
        }

    }
}
