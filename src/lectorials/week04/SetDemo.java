package lectorials.week04;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        //1. HashSet
        HashSet<String> mySet = new HashSet<>();

        mySet.add("This");
        mySet.add("is");
        mySet.add("my");
        mySet.add("first");
        mySet.add("Java");
        mySet.add("class");

        //No guaranteed order
        System.out.println("HashSet: " +mySet);
        mySet.add("Java");
        //No duplicates allowed
        System.out.println("HashSet: " + mySet);

        //2. LinkedHashSet
        LinkedHashSet<String> lsh = new LinkedHashSet<>();

        lsh.add("This");
        lsh.add("is");
        lsh.add("my");
        lsh.add("first");
        lsh.add("Java");
        lsh.add("class");

        //Maintain the insertion order
        System.out.println("LinkedHashSet: " +lsh);
        //Does not move Java from the second last item to the last item
        //Because there is a condition check before insertion.
        //Condition check: Whether this is a duplicate item or not.
        //If there is a duplicate item, the insertion is not performed.
        lsh.add("Java");
        //No duplicates allowed
        System.out.println("LinkedHashSet: " + lsh);


        //3. TreeSet
        TreeSet<String> ts = new TreeSet<>();

        ts.add("This");
        ts.add("is");
        ts.add("my");
        ts.add("first");
        ts.add("Java");
        ts.add("class");

        System.out.println("TreeSet: " +ts);
        ts.add("Java");
        //No duplicates allowed
        System.out.println("TreeSet: " + ts);


        ArrayList<String> array = new ArrayList<>(Arrays.asList("a", "b", "a"));
        HashSet<String> mySet2 = new HashSet<>(array);
        System.out.println(mySet2);


    }
}
