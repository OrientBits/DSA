package com.company.dsa.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;


// order is preserved -----------/
// not indexed
// duplicates are not allowed


public class LinkedHashMapExample {
    public static void main(String[] args) {
        System.out.println("-----LinkedHashMap-----");

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Ramshek","Banha");
        linkedHashMap.put("Abhishek","Antpara");
        linkedHashMap.put("Motu","Kolkata");
        linkedHashMap.put("Mithun","Kolkata");
        linkedHashMap.put("Mithun","Haz");
        linkedHashMap.put("Chhotan","Mayurhand");


        for (Map.Entry<String,String> map:linkedHashMap.entrySet()){
            System.out.println(map.getKey() +" : "+ map.getValue());
        }


    }
}
