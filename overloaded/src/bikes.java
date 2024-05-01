public class bikes {
    protected String name,color;
    private int gearSpeed;
    private Double wheelSize;
    public bikes(){
        this.name = "Unnamed bike";
    }
    public bikes(String bikeName) {
        this.name = bikeName;
    }
    public bikes(String bikeName, String bikeColor, int gearSpeed, Double wheelSize){
        this.name = bikeName;
        this.color = bikeColor;
        this.gearSpeed = gearSpeed;
        this.wheelSize = wheelSize;
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
    public void bikeData(){
        System.out.println("\nThere is nothing of importance to print out because you used the default method call.\nAlso..");
        System.out.println(gearSpeed + " lol\n");
    }
    public void bikeData(String bike){
        System.out.println(bike + "\n==============================================");
        System.out.printf("Name: %s\nColor: %s\nGear speed: %s speed\nWheel Size: %s\" wheels", name, color, gearSpeed, wheelSize);
    }


}
