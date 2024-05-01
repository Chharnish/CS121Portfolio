import java.util.ArrayList;
public class Customer {
    String fName;
    String lName;
    int pin;
    ArrayList<Account> accountsList = new ArrayList<>();
    //constructor
    public Customer (String fName, String lName, int pin){
        this.fName = fName;
        this.lName = lName;
        this.pin = pin;
    }
    //setters
    public void setfName(String fName){
        this.fName = fName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    //getters
    public String getfName() {
    return fName;
    }
    public String getlName() {
        return lName;
    }
    public int getPin() {
        return pin;
    }
    //methods
    public void addAccount(Account newAcc){
        accountsList.add(newAcc);
    }
    public void remAccount(Account acc) {
        accountsList.remove(acc);
    }
    public ArrayList<Account> getAccountsList(){
        return accountsList;
    }

    public Account getAccount(int accNum){
        Account foundAccount = null;
        for(Account anAccount : accountsList) {
            if (anAccount.getAccountNumber() == accNum){
                foundAccount = anAccount;
                break;
            }
        }
        return foundAccount;
    }

    public StringBuilder getAllAccInfo(){
        StringBuilder accStr = new StringBuilder();
        for (Account acc : accountsList){
            accStr.append(acc.toString());
        }
        return accStr;
    }

    @Override
    public String toString(){
        return String.format("Customer Name: %s %s\nPin: %s\n", fName, lName, pin);
    }
}
