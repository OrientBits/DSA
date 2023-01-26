package com.company.dsa.collection.map;

import java.util.HashMap;
import java.util.Map;

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


    }
}
