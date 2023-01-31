package com.company.dsa.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


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

        Set<String> stringSet = linkedHashMap.keySet();

        Iterator it = stringSet.iterator();

        System.out.println(stringSet);

        System.out.println();

        for (Map.Entry<String,String> map:linkedHashMap.entrySet()){
            System.out.println(map.getKey() +" : "+ map.getValue());
        }


    }
}
