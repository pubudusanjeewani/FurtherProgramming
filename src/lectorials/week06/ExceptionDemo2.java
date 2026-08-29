package lectorials.week06;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.next();
            int size = Integer.parseInt(input); //Throws: NumberFormatException – if the string does not contain a parsable integer.
            ArrayList<Integer> array = new ArrayList<Integer>(size); //Throws: IllegalArgumentException – if the specified initial capacity is negative
        }
        catch (NumberFormatException e){
            System.err.println("Your inout is not an integer. Please, try again");
        }
        catch(IllegalArgumentException x){
            System.err.println("Your input is negative. Please, enter a positive integer");
            System.err.println(x.getCause());
            System.err.println(x.getStackTrace());
            System.err.println(x.getClass());
        }
        catch(Exception e){
            System.err.println("Invalid Input");
        }
        finally {
            System.out.println("I really want to execute this block");
        }
    }
}
