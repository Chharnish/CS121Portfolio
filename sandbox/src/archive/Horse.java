public class Horse {
    //define variables
    public String name;
    public String color;
    public int birthYear;
    //constructor
    public Horse(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nColor: %s\nborn in %s", name, color, birthYear);
    }

}
