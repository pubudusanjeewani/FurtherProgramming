package lectorials.week03;

import lectorials.week01.Account;

public class Main {
    public static void main(String[] args) {

        GenericDemo<Integer> demo = new GenericDemo<>();
        //this will not work
        //GenericDemo<int> demo2 = new GenericDemo<>();

        //demo.setAttribute(1.0);
        demo.setAttribute(1);
        demo.display();

        GenericDemo<Account> accountGeneric = new GenericDemo<>();
        accountGeneric.setAttribute(new Account("s123", "Amy", 100));
        accountGeneric.display();

        MultipleGen<String, Integer> multipleGen = new MultipleGen<>("Amy", 100);
        multipleGen.display();

        Integer[] array = {1,2,3,4,5};
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>(array);
        integerPrinter.print();

        Account[] accountArray = {new Account("s123", "Amy", 100), new Account("s124", "Bob", 100)};
        GenericPrinter<Account> accountPrinter = new GenericPrinter<>(accountArray);
        accountPrinter.print();

        GenericCalculator<Integer> genericCalculator = new GenericCalculator(array);
        System.out.println(genericCalculator.computeAverage());
    }
}
