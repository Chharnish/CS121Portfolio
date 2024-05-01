public abstract class employee {
    public String name;
    public int id;
    public double salary;

    //constructor
    public employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //getters
    public String name(){
        return name;
    }
    public int id() {
        return id;
    }
    public double salary() {
        return salary;
    }

    public abstract void printData();


}
