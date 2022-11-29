package com.company.dsa.linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsEqual {
    public static void main(String[] args) {

        String[] array = new String[]{"A","B","C"};

        List<String> list1 = Arrays.asList(array);
        System.out.println(list1 +" Type: "+list1.getClass().getSimpleName());

        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"),"C"));
        System.out.println(list3);

        List<String> list4 = new ArrayList<>(list3);
        System.out.println(list4);


        System.out.println(list1.equals(list2));

        System.out.println(list1.equals(list3));


    }
}

interface abc{

    String Message = "Hello";
    static void print(){
        System.out.println("hell");
    }

     public void print2();
}
