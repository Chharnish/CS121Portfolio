public class highEmployee extends employee{
    public char access;
    public String admin;
    public highEmployee(String name, int id, double salary, char access, String admin) {
        super(name,id,salary);
        this.access = access;
        this.admin = admin;
    }
    //setters
    public void setAccess(char access) {
        this.access = access;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    //getters
    public char getAccess() {
        return access;
    }
    public String getAdmin() {
        return admin;
    }

    @Override
    public void printData(){
        return String.format("Here is the employee file: \nEmployee Name: %s \nEmployee id: %d \nEmployee salary: %s \nEmployee Access Level: %s\nEmployee Administration level: %s", name, id, salary, access, admin);
    }

}
