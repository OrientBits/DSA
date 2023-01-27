package com.company.dsa.collection.map;

import java.util.*;

// order is not preserved
// not indexed
// duplicates key are not allowed

public class HashMapExample {
    public static void main(String[] args) {
        System.out.println("----HashMap----");

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Ramshek","Banha");
        hashMap.put("Abhishek","Antpara");
        hashMap.put("Motu","Kolkata");
        hashMap.put("Mithun","Kolkata");
        hashMap.put("Mithun","Haz");
        hashMap.put("Chhotan","Mayurhand");

        for (Map.Entry<String,String> mapElement : hashMap.entrySet()) {
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }

        System.out.println("\nusing forEach");

        hashMap.forEach((s, s2) -> {
            System.out.println(s+" : "+s2);
        });

        //sorted using tree map by key not value
        TreeMap<String, String> treeMap = new TreeMap<>(hashMap);

        treeMap.forEach((s, s2) -> {
            System.out.println(s+" : "+s2);
        });


        System.out.println("--------------------------------------------");


        System.out.println("KeySet: "+hashMap.keySet());
        System.out.println("EntrySet: "+hashMap.entrySet());

        List<String> list = new LinkedList<>(hashMap.keySet());
        list.sort(String::compareTo);
        Collections.sort(list);



    }
}
