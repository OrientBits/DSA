package com.company.dsa.collection.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Stream;

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

        hashSet.forEach(System.out::println);

        System.out.println();

        // first way in ascending order
        Stream<String> sorted = hashSet.stream().sorted();
        sorted.forEach(System.out::println);

        System.out.println("\n reverse order using stream api");
        //second way
        hashSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();


    }
}
