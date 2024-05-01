public class TeeShirt {
    //declaring variables
    public int orderNum;
    public String size;
    public String color;
    public Double price;

    //constructor
    public TeeShirt(int orderNum, String size, String color) {
        this.orderNum = orderNum;
        this.size = size;
        this.color = color;
        this.price = getPrice();
    }
    //getters
    public int getOrderNum() {
        return orderNum;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    //setters
    public void setOrderNum(int orderNumber){
        this.orderNum = orderNumber;
    }
    public void setSize(String Size) {
        this.size = Size;
    }
    public void setColor(String Color) {
        this.color = Color;
    }
    //special getter
    public Double getPrice(){
        switch(size.toUpperCase()) {
            case "XXL", "XXXL":
                this.price = 22.99;
                break;
            default:
                this.price = 19.99;
                break;
        }
        return price;
    }

    @Override
    public String toString(){
        return String.format("Order Number: %d\nSize: %s\nColor: %s\nPrice: %s", orderNum, size, color, price);
    }

}
