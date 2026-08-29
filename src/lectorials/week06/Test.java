package lectorials.week06;

import lectorials.week01.Account;
import lectorials.week02.SavingsAccount;

public class Test {

    public static  void test1(Account account){
      //superclass reference
    }

    public static  void test2(SavingsAccount account){
      //subclass reference
    }

    public static void main(String[] args) {
        Account account = new Account();
        SavingsAccount sa = new SavingsAccount();
        Account superclass = new SavingsAccount();
        //SavingsAccount subclass = new Account();

        test1(account);
        test1(sa);
        test1(superclass);


        //test2(account);
        test2(sa);
        //test2(superclass);

    }
}
