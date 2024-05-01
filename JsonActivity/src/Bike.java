public class Bike {
    private String bikeName;
    private int serialNum;
    private boolean owned;
    private double weightLB;

    public Bike (String name, int serial, boolean owned, double weight){
        this.bikeName = name;
        this.serialNum = serial;
        this.owned = owned;
        this.weightLB = weight;
    }

    @Override
    public String toString() {
        return String.format("Bike Name: %s  Serial Number: %d  Bike owned: %s, current weight: %.2f", bikeName, serialNum, owned, weightLB);
    }
}
