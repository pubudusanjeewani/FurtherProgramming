package lectorials.week01;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account = new Account("1234", "Alice Spring A", 0.5);

        System.out.println(account.getAccountID());
        System.out.println(account.getAccountName());
        System.out.println(account.getBalance());

        account.setAccountID("123");
        account.setAccountName("Alice Spring");
        account.setBalance(0.0);

        System.out.println(account.getAccountID());
        System.out.println(account.getAccountName());
        System.out.println(account.getBalance());

        System.out.println(account1.toString());



    }
}
