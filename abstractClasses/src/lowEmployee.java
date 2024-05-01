public class lowEmployee extends employee{
    //constructor
    public String accommodations;
    public lowEmployee(String name, int id, double salary, String acco) {
        super(name, id, salary);
        this.accommodations = acco;
    }
    //setters
    public void setAccommodations(String Acco){
        this.accommodations = Acco;
    }
    //getters
    public String accommodations(){
        return accommodations;
    }

    @Override
    public void printData() {
        System.out.printf("Here is the employee file: \nEmployee name: %s \nEmployee id: %d \nEmployee salary: %s \nEmployee Accommodations: \n %s", name, id, salary, accommodations);
    }
}
