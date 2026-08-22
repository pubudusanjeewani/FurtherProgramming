package lectorials.week01;

public class Account{
    //private String accountID;
    protected String accountID;
    private String accountName;
    private double balance;

    public Account() {
        this.accountID = "";
        this.accountName = "";
        this.balance = 100.0;
    }

    public Account(String accountID, String accountName, double balance) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Method overriding - week 3
    public String toString(){
        return this.accountID + "|" + this.accountName + "|" + this.balance;
    }

    // week 2
    public void withdraw(double amount){
    }

    // week 2
    public void sayHello(){
        System.out.println("Hi, I am a normal account.");
    }
}
