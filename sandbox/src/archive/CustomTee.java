public class CustomTee extends TeeShirt{
    private String slogan;

    //constructor

    public CustomTee(int orderNum, String size, String color, String Slogan){
        super(orderNum, size, color);
        this.slogan = Slogan;
    }
    //getter
    public String getSlogan() {
        return slogan;
    }
    //setter
    public void setSlogan(String Slogan) {
        this.slogan = Slogan;
    }

    @Override
    public String toString() {
        return String.format("%s\nSlogan: %s", super.toString(), slogan);
    }


}
