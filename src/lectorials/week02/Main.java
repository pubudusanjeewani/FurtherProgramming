package lectorials.week02;

import lectorials.week01.Account;

public class Main {

    public static void depositAccount(Account account, double amount){
            double balance = account.getBalance();
            double newBalance = balance + amount;
            account.setBalance(newBalance);
        }
        //This is not required.
    /*
    public static void depositAccount(SavingsAccount account, double amount){
        double balance = account.getBalance();
        double newBalance = balance + amount;
        account.setBalance(newBalance);
    }
    */

    public static void main(String[] args){
        Account account = new Account();
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountID("123");

        //protected demo
        savingsAccount.getProtectedAccountID();
        //not allowed in Main
        //savingsAccount.acountID("123");

        //Q1: The parent class reference (Account) points to a child class object (SavingsAccount), demonstrating polymorphism.
        Account specialAccount = new SavingsAccount();

        //Q2: Not allowed: a parent class object (Account) cannot be assigned to a child class reference (SavingsAccount).
        //SavingsAccount specialAccount2 = new Account();

        //Q3:
        Account a = new SavingsAccount();
        // Not allowed: an Account reference cannot be directly assigned to a SavingsAccount reference.
        //SavingsAccount b = a;
        SavingsAccount b = (SavingsAccount) a; //Type casting. Hover and see the warning. The warning says sometimes it might not work.
        // The complier will not take the responsibility for this now. We have to take the responsibility that this typecasting will work at run time.

        //Q4:
        // This will work because withdraw() is defined in the Account class.
        specialAccount.withdraw(200.0);
        // This will not work because addInterest() is only defined in SavingsAccount, not in the Account class.
        //specialAccount.addInterest();
        //This is not allowed.
        specialAccount.sayHello();


        depositAccount(account, 100.0);
        depositAccount(savingsAccount, 200.0);


        /*
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();
        savingsAccount.sayHello();

        account.withdraw(200.0);
        // This will not work.
        // account.addInterest();
        account.sayHello();
         */

    }

}
