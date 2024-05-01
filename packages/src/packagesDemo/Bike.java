package packagesDemo;

public class Bike {
    //declaring variables
    public String name;
    public String modelNum;
    private String gearSpeed;
    protected int serialNum;
    private int Weight;
    // constructor

    public Bike(String Name, String model, String speed, int serial, int weight) {
        this.name = Name;
        this.modelNum = model;
        this.gearSpeed = speed;
        this.serialNum = serial;
        this.Weight = weight;
    }
    public void printBasic() {
        System.out.println("Basic print\n");
        System.out.printf("Bike Name: %s\nModel: %s", name, modelNum);
    }
    private void printMoreInfo() {
        System.out.println("\n\nmoreInfoPrint");
        System.out.printf("Bike Name: %s\nGear Speed: %s\nWeight: %s lb", name, gearSpeed, Weight);
    }
    protected void printSensitive() {
        System.out.println("\n\nSensitive Print");
        System.out.printf("Name: %s\nModel: %s\nSerial Number: %s\nGear Speed: %s\nWeight: %s lb", name, modelNum, serialNum, gearSpeed, Weight);
    }
    void printName() {
        System.out.println("\n\nDefault print");
        System.out.printf("Name: %s", name);
    }

}
