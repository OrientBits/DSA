package com.company.dsa.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(454);
        list.add(43);
        list.add(2);
        list.add(54);
        list.add(43);
        list.add(65);
        list.add(3);

        // return list of all even no which is greater than 4


        List<Integer> collect = list.stream().filter(integer -> (integer % 2 == 0 && integer > 5)).collect(Collectors.toList());

        System.out.println(collect);

    }
}
