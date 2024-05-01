package packagesDemo;

public class bikeTest {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Bike-ael", "Next ATS", "21 Speed", 9482798, 50);
        bike1.printName();
        bike1.printBasic();
        //bike1.printMoreInfo();
        bike1.printSensitive();

    }
}
