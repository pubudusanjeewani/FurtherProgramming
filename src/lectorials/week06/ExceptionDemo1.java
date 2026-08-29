package lectorials.week06;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch(Exception e){
            System.out.print("Error!");
        }

        System.out.println("Hello world!");

    }
}
