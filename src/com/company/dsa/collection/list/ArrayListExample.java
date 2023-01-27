package com.company.dsa.collection.list;

import com.company.dsa.collection.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

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


        System.out.println("------------------------------------------------------------");

        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Ramshek",25));
        userArrayList.add(new User("zzzzzz",12));
        userArrayList.add(new User("Motu",24));
        userArrayList.add(new User("Abhishek",30));
        userArrayList.add(new User("Chhotan",50));
        userArrayList.add(new User("Baleshwer",70));

        //first way to sort
        //Collections.sort(userArrayList);

        userArrayList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        for (User user : userArrayList) {
            System.out.println(user.getName() +" : "+user.getAge());
        }

        System.out.println("-----------by age -----------");

        userArrayList.sort(Comparator.comparing(User::getAge));

        for (User user : userArrayList) {
            System.out.println(user.getName() +" : "+user.getAge());
        }

    }
}
