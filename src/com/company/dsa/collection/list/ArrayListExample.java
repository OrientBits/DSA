package com.company.dsa.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("-----ArrayList------");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ramshek");
        arrayList.add("Mangal");
        arrayList.add("Motu");
        arrayList.add("Mithun");
        arrayList.add("Chhotan");
        arrayList.add("Abhishek");



        System.out.println("Before sorting....");
        arrayList.forEach(System.out::println);


        //first way
        //Collections.sort(arrayList);

        System.out.println("\nusing comparator");
        arrayList.sort(Comparator.reverseOrder());
        arrayList.forEach(System.out::println);

        // second way
        arrayList.sort(String::compareTo);

        arrayList.sort(Comparator.reverseOrder());
        arrayList.sort(Collections.reverseOrder());

        //third way
        //Collections.sort(arrayList,Collections.reverseOrder());

        //forth way
        System.out.println("\nusing stream api");
        arrayList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println(arrayList.size());


    }
}
