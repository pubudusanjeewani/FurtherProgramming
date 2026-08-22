package lectorials.week04;

import java.util.ArrayList;
import java.util.LinkedList;

public class Access {
    public static void main(String[] args) {
        int size = 1000000;
        //1. ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<size; i++){
            list.add(i);
        }

        long start = System.nanoTime();
        list.get(list.size()/2);
        long end = System.nanoTime();
        System.out.println("Time of access for ArrayList: " + (end - start));

        //2.LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i =0; i< size; i++){
            linkedList.add(i);
        }

        start = System.nanoTime();
        list.get(linkedList.size()/2);
        end = System.nanoTime();
        System.out.println("Time of access for LinkedList: " + (end - start));

    }
}
