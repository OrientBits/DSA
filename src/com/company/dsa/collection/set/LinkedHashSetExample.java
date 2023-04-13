package com.company.dsa.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

// order is preserved ------------/
// not indexed
// duplicates are not allowed

public class LinkedHashSetExample {
    public static void main(String[] args) {

        System.out.println("-----LinkedHashSet------");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Ramshek");
        linkedHashSet.add("Mangal");
        linkedHashSet.add("Motu");
        linkedHashSet.add("Chhotan");
        linkedHashSet.add("Abhishek");
        linkedHashSet.add(null);


        //second way foreach
        for (String name : linkedHashSet) {
            System.out.println("Name: " + name);
        }



    }
}
