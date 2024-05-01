import java.util.Scanner;
public class Menu {
    Bank myBank = new Bank();
    Scanner input = new Scanner(System.in);
    public void displayMenu(){
        String sel = "";
        while(!sel.equalsIgnoreCase("4")) {

            System.out.print("""
                    
                    ********* MENU *********

                    Please make a selection:
                    1) Access Account
                    2) Open a New Account
                    3) Close A Customer Account
                    4) Exit
                    >>>  """);
            sel = input.next();
            switch(sel){
                case "1":
                    accessAccount();
                    break;
                case"2":
                    openAccount();
                    break;
                case"3":
                    closeAccount();
                    break;
                case"4":
                    break;
                default:
                    System.err.println("Invalid selection!");
            }
        }
    }
    private int accessAccount(){
        Customer currCustomer = null;
        Account currAccount = null;
        int sel = 0;
        System.out.print("Please input an account pin to continue: \n");
        System.out.print("\n>>> ");
        sel = input.nextInt();
        input.nextLine();
        if (myBank.getCustomer(sel) != null) {
            currCustomer = myBank.getCustomer(sel);
            System.out.println(currCustomer.toString());
        } else {
            System.err.println("Customer not found!!");
            return 0;
        }
        System.out.println(currCustomer.getAllAccInfo());
        System.out.println("Please enter the account number you would like to access: ");
        System.out.print("\n>>> ");
        sel = input.nextInt();
        if (currCustomer.getAccount(sel) != null) {
            currAccount = currCustomer.getAccount(sel);
        }
        else {
            System.err.println("Account not found!!");
            return 0;
        }
        accountMenu(currAccount, currCustomer);
        return 0;
    }
    private void openAccount(){
        Customer currCustomer = null;
        String sel = "";
        if (!myBank.allCustomers.isEmpty()) {
            System.out.println("is Customer new?(Y/N)");
            input.nextLine();
            sel = input.nextLine();
        }
        else{
            input.nextLine();
        }
        if (sel.equalsIgnoreCase("N")){
            System.out.print("Please enter your pin: ");
            int pin = input.nextInt();
            if (myBank.getCustomer(pin) != null){
                currCustomer = myBank.getCustomer(pin);
                System.out.println("Please enter a initial deposit: ");
                double dep = input.nextDouble();
                Account newAcc = new Account(dep);
                currCustomer.addAccount(newAcc);
                System.out.printf("New Account opened!\nAccount Number: %s\n", newAcc.getAccountNumber());
            }
            else{
                System.out.println("Pin not found!");
            }
        }
        else {
            System.out.println("Please enter your first name: ");
            String fName = input.nextLine();
            System.out.println("Please enter your last name: ");
            String lName = input.nextLine();
            System.out.println("Please enter a new pin: ");
            int pin = input.nextInt();
            Customer newCust = new Customer(fName,lName,pin);
            System.out.println("Please enter a initial deposit: ");
            double dep = input.nextDouble();
            Account newAcc = new Account(dep);
            newCust.addAccount(newAcc);
            System.out.printf("New Account opened!\nAccount Number: %s\n", newAcc.getAccountNumber());
            myBank.addCustomer(newCust);
        }
    }
    private void closeAccount(){
        System.out.println("Please enter your pin to remove your account: ");
        int pin = input.nextInt();
        if (myBank.getCustomer(pin) != null){
            myBank.remCustomer(myBank.getCustomer(pin));
            System.out.println("Customer account deleted.");
        }
        else {
            System.err.println("Could not find customer. Please try again!");
        }
    }
    public void accountMenu(Account currAccount, Customer currCustomer) {
        String sel = "";
        while(!sel.equals("5") && !sel.equals("4")) {

            System.out.print("""
                    Please make a selection:
                    1) Make a deposit
                    2) Make a withdraw
                    3) See Account Balance
                    4) Close Account
                    5) Exit
                    >>> """);
            sel = input.next();
            switch(sel) {
                case"1":
                    System.out.print("please enter an amount to deposit: ");
                    Double deposit = input.nextDouble();
                    currAccount.deposit(deposit);
                    break;
                case"2":
                    System.out.print("Please enter an amount to withdraw: ");
                    Double withdraw = input.nextDouble();
                    currAccount.withdraw(withdraw);
                    break;
                case"3":
                    System.out.printf("Account balance: %.2f\n", currAccount.getBalance());
                    break;
                case"4":
                    System.out.println("Deleting Account...");
                    currCustomer.remAccount(currAccount);
                    break;
                case"5":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.err.println("Invalid Selection!!");
            }
        }
    }
}
