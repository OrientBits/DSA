package com.company.dsa.linkedin;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReturnType {


    public static void main(String[] args) {

        List<String> songTitles = Arrays.asList("Munny","Darling","Wife");

        Function<String, String> capitalize = String::toUpperCase;

        songTitles.stream().map(capitalize).forEach(System.out::println);

    }

    String processFunction(Integer number, Function<Integer, String> lambda){
        return lambda.apply(number);
    }
    

}