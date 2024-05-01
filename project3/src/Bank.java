import java.util.ArrayList;
public class Bank {
    ArrayList<Customer> allCustomers = new ArrayList<>();

    public void addCustomer(Customer newCustomer) {
        allCustomers.add(newCustomer);
    }
    public void remCustomer(Customer customer) {
        allCustomers.remove(customer);
    }
    public Customer getCustomer(int pin){
        Customer foundCustomer = null;
        for (Customer customer : allCustomers) {
            if (customer.getPin() == pin){
                foundCustomer = customer;
            }
        }
        return foundCustomer;
    }

    public StringBuilder getAllCustomers(){
        StringBuilder strCust = new StringBuilder();
        for (Customer customer: allCustomers) {
            strCust.append(customer.toString());
        }
        return strCust;
    }
}
