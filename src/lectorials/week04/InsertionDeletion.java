package lectorials.week04;

import java.util.*;

public class InsertionDeletion {
    public static void main(String[] args) {
        // Number of elements to insert and delete
        for (int n = 1000; n < 1e6; n=n*10) {
            System.out.println("===Inserting and deleting " + n + " elements===");

            //1. ArrayList insertion and deletion benchmark
            long arrayListStartTime = System.nanoTime();
            ArrayList<Integer> arrayList= new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(i);
            }
            for (int i = 0; i < n; i++) {
                arrayList.remove(0);
            }
            long arrayListEndTime = System.nanoTime();
            long arrayListDuration = arrayListEndTime - arrayListStartTime;
            System.out.println("ArrayList insertion and deletion time: " + arrayListDuration + " nanoseconds");

            //2. LinkedList insertion and deletion benchmark
            long linkedListStartTime = System.nanoTime();
            LinkedList<Integer> linkedList= new LinkedList<>();
            for (int i = 0; i < n; i++) {
                linkedList.add(i);
            }
            for (int i = 0; i < n; i++) {
                linkedList.remove(0);
            }
            long linkedListEndTime = System.nanoTime();
            long linkedListDuration = linkedListEndTime - linkedListStartTime;
            System.out.println("LinkedList insertion and deletion time: " + linkedListDuration + " nanoseconds");

            //3. HashSet insertion and deletion benchmark
            long setStartTime = System.nanoTime();
            HashSet<Integer> set= new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(i);
            }
            for (int i = 0; i < n; i++) {
                set.remove(i);
            }
            long setEndTime = System.nanoTime();
            long setDuration = setEndTime - setStartTime;
            System.out.println("HashSet insertion and deletion time: " + setDuration + " nanoseconds");

            //4. HashMap insertion and deletion benchmark
            long mapStartTime = System.nanoTime();
            HashMap<Integer, String> map= new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, "");
            }
            for (int i = 0; i < n; i++) {
                map.remove(i);
            }
            long mapEndTime = System.nanoTime();
            long mapDuration = mapEndTime - mapStartTime;
            System.out.println("HashMap insertion and deletion time: " + mapDuration + " nanoseconds");
        }
    }
}