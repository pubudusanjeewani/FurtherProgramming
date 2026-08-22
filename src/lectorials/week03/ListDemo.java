package lectorials.week03;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //ArrayList Demo
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(new String("One"));
        arrayList.add(new String("Three"));
        arrayList.add(new String("Five"));
        arrayList.add(new String("Four"));
        System.out.println(arrayList);
        arrayList.add(1,new String("Two"));
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.add(4,"Five");
        System.out.println("Displaying array list");
        System.out.println(arrayList);

        //LinkedHashSet Demo - Question 7
        Set<String> set = new LinkedHashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        //TreeSet Demo
        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);

        //Question 8
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));

        //Question 9
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("A");
        list2.addFirst("B");
        list2.addLast("C");
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        ListIterator<String> listIterator = list2.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

    }
}
