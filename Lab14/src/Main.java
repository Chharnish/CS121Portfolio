public class Main {
    public static void main(String[] args) {

        Student myStudent = new Student("Jeremy", "Escobar", 3.5, 12345, "Computer Science", "Freshman");
        myStudent.addCourse("CS120");
        myStudent.addCourse("ENG103");
        myStudent.addCourse("JAPA101");
        myStudent.addCourse("FIN101");
        myStudent.addCourse("HIST150");

        System.out.println(myStudent.toString());
        System.out.println("Unsorted:\n" + myStudent.displayCourseList());

        //sorting
        myStudent.sortCourse();

        //printing sorted list
        System.out.println("Sorted:\n" + myStudent.displayCourseList());
    }
}
