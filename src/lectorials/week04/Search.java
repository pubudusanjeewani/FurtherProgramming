package lectorials.week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Search {
    public static void main(String[] args) {
        int lowerBound = (int) 1e5;
        int upperBound = (int) 1e7;
        Integer target = -1;

        //1. ArrayList
        ArrayList<Integer> al= new ArrayList<>();
        for(int count= lowerBound; count <= upperBound; count = count*10) {
            for(int i=0; i<count; i++) {
                al.add(i);
            }
            long startTime = System.nanoTime();
            System.out.println(al.contains(target));
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("ArrayList of " + count + " elements" + " search time: " + duration + " nanoseconds");
        }
        System.out.println();


        //2. LinkedList
        LinkedList<Integer> ll= new LinkedList<>();
        for(int count= lowerBound; count <= upperBound; count = count*10) {
            for(int i=0; i<count; i++) {
                ll.add(i);
            }
            long startTime = System.nanoTime();
            System.out.println(ll.contains(target));
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("LinkedList of " + count + " elements" + " search time: " + duration + " nanoseconds");
        }
        System.out.println();

        //3. HashSet
        HashSet<Integer> hs= new HashSet<>();
        for(int count= lowerBound; count <= upperBound; count = count*10) {
            for(int i=0; i<count; i++) {
                hs.add(i);
            }
            long startTime = System.nanoTime();
            System.out.println(hs.contains(target));
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashSet of " + count + " elements" + " search time: " + duration + " nanoseconds");
        }
        System.out.println();

        //4. HashMap
        HashMap<Integer, String> hm= new HashMap<>();
        for(int count= lowerBound; count <= upperBound; count = count*10) {
            for(int i=0; i<count; i++) {
                hm.put(i, new String("X"));
            }
            long startTime = System.nanoTime();
            System.out.println(hm.containsKey(target));
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashMap of " + count + " elements" + " search time: " + duration + " nanoseconds");
        }
    }
}
