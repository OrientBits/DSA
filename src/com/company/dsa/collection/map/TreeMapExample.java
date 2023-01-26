package com.company.dsa.collection.map;

import java.util.Map;
import java.util.TreeMap;

// sorted - order is not preserved
// not indexed
// duplicates key are not allowed


public class TreeMapExample {
    public static void main(String[] args) {
        System.out.println("------TreeMap--------");

        TreeMap<String,String> treeMap = new TreeMap<>();

        treeMap.put("Ramshek","Banha");
        treeMap.put("Abhishek","Antpara");
        treeMap.put("Motu","Kolkata");
        treeMap.put("Mithun","Kolkata");
        treeMap.put("Mithun","Haz");
        treeMap.put("Chhotan","Mayurhand");

        for (Map.Entry<String,String> map:treeMap.entrySet()){
            System.out.println(map.getKey() +" : "+ map.getValue());
        }



    }
}
