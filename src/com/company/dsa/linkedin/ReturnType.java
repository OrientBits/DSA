package com.company.dsa.linkedin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReturnType {

    ReturnType(){

    }

    public static void main(String[] args) {

        List<String> songTitles = Arrays.asList("humbel","element","dna");

        Function<String, String> capitalize = str -> str.toUpperCase();

        songTitles.stream().map(capitalize).forEach(System.out::println);



    }


    static void findCharacter(String s){

        // mo5tu
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + 0);
        }

    }

}