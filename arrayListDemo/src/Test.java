
public class Test {
    public static void main(String[] args) {
        StringArrayList bikes = new StringArrayList();

        bikes.addBike("default");
        bikes.addBike("Bichael");
        bikes.addBike("Beter");
        bikes.addBike("Bichael 2.0");

        bikes.remBike("default");
        bikes.addBike("Bichael's cousin");
        System.out.println("The size of the array is: " + bikes.bikeSize());
        System.out.print(bikes.getBike(2));
        System.out.println("\nRegular for loop: \n");
        bikes.listBikesReg();
        System.out.println("\nEnhanced for loop: \n");
        bikes.listBikesEn();



    }
}
