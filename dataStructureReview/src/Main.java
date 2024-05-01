public class Main {
    public static void main(String[] args) {
        DataStructure myData = new DataStructure();

        myData.addStudentName("Jeremy");
        myData.addStudentName("Peter");
        myData.addStudentName("Michael");

        myData.addAge(20);
        myData.addAge(21);
        myData.addAge(22);

        myData.addMajorGpa("CS", 4.0);
        myData.addMajorGpa("MMP", 3.9);
        myData.addMajorGpa("MusPerf", 5.0);

        myData.addNationality("American");
        myData.addNationality("Japanese");
        myData.addNationality("European");

        myData.addHomeTown("Indianapolis");
        myData.addHomeTown("Avon");
        myData.addHomeTown("Greenwood");

        myData.addHomeState("Indiana");
        myData.addHomeState("Illinois");
        myData.addHomeState("Kentucky");

        myData.printName();
        myData.printAge();
        myData.printMajor();
        myData.printNationality();
        myData.printHomeTown();
        myData.printHomeState();

        System.out.println();

        myData.remStudentName("Jeremy");
        myData.remAge(20);
        myData.remMajorGPA("CS");
        myData.remNationality("American");
        myData.remHomeTown();
        myData.remHomeState("Indiana");

        myData.printName();
        myData.printAge();
        myData.printMajor();
        myData.printNationality();
        myData.printHomeTown();
        myData.printHomeState();


    }
}
