public class Beter extends bike{
    private boolean isFlat;

    //CONSTRUCTORSSSSS
    public Beter (String bikeName, String bikeColor, int gearSpeed, Double wheelSize, boolean isFlat) {
        super(bikeName, bikeColor, gearSpeed, wheelSize);
        this.isFlat = isFlat;
    }
    //Setters
    public void setFlat(boolean flat) {
        this.isFlat = flat;
    }
    //Getters
    public boolean isFlat() {
        return isFlat;
    }

    @Override
    public String toString() {
        return String.format(isFlat ? "Tires need air!!" : "Bike is ready to ride!");
    }
}
