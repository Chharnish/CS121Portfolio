public class Bike {
    String bikeType;
    int price;
    int wheelSize;
    String brand;
    String metalType;
    public Bike(String Brand, String MetalType, int Price, String BikeType, int WheelSize) {
        this.brand = Brand;
        this.metalType = MetalType;
        this.price = Price;
        this.bikeType = BikeType;
        this.wheelSize = WheelSize;
    }
    public void displayInfo(){
        System.out.println("The type of bike is a " + bikeType + " bike.");
        System.out.println("The brands used are: " + brand);
        System.out.println("The metal type of the bike is: " + metalType);
        System.out.println("The Price of the bike in total is: $ " + price);
        System.out.println("The Wheel sizes are: " + wheelSize + "\"");
    }
}
