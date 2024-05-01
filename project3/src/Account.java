public class Account {
    private Double balance;
    private static int numberOfAccounts = 1000;
    private int accountNumber;

    // constructorsss
    public Account(double balance) {
        this.balance = balance;
        this.accountNumber = numberOfAccounts++;
    }
    //the only setter I'll ever need
    public void setBalance(double balance){
        this.balance = balance;
    }
    //the only getter I want ;)
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    //methods
    public void deposit(Double amount){
        balance += amount;
        System.out.printf("$%.4s has been successfully deposited!\n", amount);
    }
    public void withdraw(Double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.printf("\nSuccessfully withdrew $%.2f New balance is: $%.2f\n", amount, balance);
        }
        else{
            System.err.printf("Insufficient balance!\nCurrent Balance: $%.2f\n",balance);
        }
    }
    @Override
    public String toString(){
        return String.format("\nAccount Details:\nAccount number: %s\nBalance $%.2f", accountNumber, balance);
    }
}
