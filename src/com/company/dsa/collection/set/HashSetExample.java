package com.company.dsa.collection.set;

import java.util.*;
import java.util.stream.Collectors;
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
        hashSet.add(null);

        hashSet.forEach(System.out::println);

//        System.out.println();
//
//        // first way in ascending order
//        Set<String> stringSet = new TreeSet<>(hashSet);
//
//        for (String s : stringSet) {
//            System.out.println("SET: " + s);
//        }

//        System.out.println("\n reverse order using stream api");
//        //second way to reverse the order
//        hashSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//
//        System.out.println();


    }
}
