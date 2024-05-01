public class Bichael1 extends bike {
    private boolean isDamaged;

    //constructor
    public Bichael1(String bikeName, String bikeColor, int gearSpeed, Double wheelSize, boolean isDamaged) {
        super(bikeName, bikeColor, gearSpeed, wheelSize);
        this.isDamaged = isDamaged;
    }
    //Setters
    public void setDamaged(boolean damaged){
        this.isDamaged = damaged;
    }
    //Getters
    public boolean isDamaged(){
        return isDamaged;
    }

    @Override
    public String toString() {
        return String.format(isDamaged ? "Bike is damaged" : "Bike is not damaged");
    }
}
