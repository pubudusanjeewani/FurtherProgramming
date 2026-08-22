package lectorials.week04;

import lectorials.week01.Account;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //1.HashMap
        HashMap<String, Account> hashMap = new HashMap<>();
        hashMap.put("Charles Theva", new Account("s123", "Charles", 130.0));
        hashMap.put("Bill Cooper", new Account("s124", "Bill", 90.0));
        hashMap.put( "Abraham Lincoln", new Account("s126", "Abraham", 220));
        // The old values will be overridden as the keys are the same
        hashMap.put("Bill Cooper", new Account("s124", "Bill", 120.0));
        hashMap.put("Alice Smith", new Account("s125", "Abraham", 0.0));
        //throws an error as an Integer value has been passed for the String
        //hashMap.put(1, new Account());

        System.out.println("Entries in HashMap:");
        displayMap(hashMap);

        //2.LinkedHashMap
        //Items will be ordered by insertion order.
        System.out.println("Entries in LinkedHashMap:");
        LinkedHashMap<String, Account> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Charles Theva", new Account("s123", "Charles", 130.0));
        linkedHashMap.put("Bill Cooper", new Account("s124", "Bill", 90.0));
        linkedHashMap.put( "Abraham Lincoln", new Account("s126", "Abraham", 220));
        linkedHashMap.put("Bill Cooper", new Account("s124", "Bill", 120.0));
        linkedHashMap.put("Alice Smith", new Account("s125", "Abraham", 0.0));
        displayMap(linkedHashMap);

        //3.TreeMap
        //Items will be ordered based on keys.
        System.out.println("Entries in TreeMap:");
        TreeMap<String, Account> treeMap = new TreeMap<>();
        treeMap.put("Charles Theva", new Account("s123", "Charles", 130.0));
        treeMap.put("Bill Cooper", new Account("s124", "Bill", 90.0));
        treeMap.put( "Abraham Lincoln", new Account("s126", "Abraham", 220));
        treeMap.put("Bill Cooper", new Account("s124", "Bill", 120.0));
        treeMap.put("Alice Smith", new Account("s125", "Abraham", 0.0));
        displayMap(treeMap);

    }


    // We can use the Map interface as the parameter type because HashMap and
    // TreeMap both implement the Map interface (polymorphism).
    // Print all elements of a Map
    public static void displayMap(Map<String, Account> map){
        //Method1: Retrieve the key first and then retrieve the values using those keys
        Set<String> allKeys = map.keySet();
        for(String key: allKeys){
            System.out.println(key + ": " + map.get(key));
        }

        /*
        //Method2: Retrieve entire key value pairs using Set<Map.Entry<K,V>> entrySet()
        //https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        map.entrySet();
        Set<Map.Entry<String, Account>> entrySet = map.entrySet();
        for(Map.Entry<String, Account> entry: entrySet){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

         */

    }
}
