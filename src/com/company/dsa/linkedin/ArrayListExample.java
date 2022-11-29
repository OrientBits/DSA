package com.company.dsa.linkedin;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    ArrayListExample() {
    }

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","hell", "boll"));

        for (String value : list) {
            if (value.equals("a")) {
                list.remove("hell");
            }
        }

        System.out.println(list + " : " + list.getClass().getSimpleName());


    }
}
