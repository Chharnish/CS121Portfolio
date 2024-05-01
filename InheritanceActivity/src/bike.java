public class bike {

    public String name,color;
    public int gearSpeed;
    public Double wheelSize;

    // CONSTRUCTORS
    public bike(String bikeName, String bikeColor, int gearSpeed, Double wheelSize){
        this.name = bikeName;
        this.color = bikeColor;
        this.gearSpeed = gearSpeed;
        this.wheelSize = wheelSize;
    }
    //SETTERS
    public void setName(String Name) {
        this.name = Name;
    }
    public void setColor(String Color){
        this.color = Color;
    }
    public void setGearSpeed(int speed){
        this.gearSpeed = speed;
    }
    public void setWheelSize(Double size) {
        this.wheelSize = size;
    }
    //GETTERS
    public String name() {
        return name;
    }
    public String color() {
        return color;
    }
    public int gearSpeed(){
        return gearSpeed;
    }
    public Double wheelSize() {
        return wheelSize;
    }

    public String toString(){
        return String.format("This is a test %s", name);
    }

}
