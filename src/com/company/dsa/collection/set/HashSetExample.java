package com.company.dsa.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// order is not preserved
// not indexed
// duplicates are not allowed

public class HashSetExample {
    public static void main(String[] args) {

        System.out.println("-----HashSet------");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Ramshek");
        hashSet.add("Mangal");
        hashSet.add("Motu");
        hashSet.add("Mithun");
        hashSet.add("Chhotan");
        hashSet.add("Abhishek");

        //first way
        hashSet.forEach(s -> System.out.println("Name: " + s));

        System.out.println();

        //second way foreach
        for (String name : hashSet) {
            System.out.println("Name: " + name);
        }

        System.out.println();

        // forth way
        for (Iterator<String> elements = hashSet.iterator(); elements.hasNext();){
            System.out.println("Name: "+elements.next());
        }

        // fifth way index is not preserved in set



    }
}
