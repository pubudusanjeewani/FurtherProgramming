package lectorials.week02;

import lectorials.week01.Account;

public class SavingsAccount extends Account {
    // new - week2
    // A protected variable can be accessed by a subclass, even if the subclass is in a different package.
    public String getProtectedAccountID(){
        System.out.println(accountID);
        return accountID;
    }

    // week2
    public void addInterest(){
    }

    // week2
    public void sayHello(){
        System.out.println("Hi, I am a savings account.");
    }
}
