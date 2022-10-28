package com.company.dsa.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String args[]) {

        List<Integer> number = Arrays.asList(2, 7, 4, 5,2);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        List<Integer> show2 = number.stream().sorted().collect(Collectors.toList());
        System.out.println(show2);

        System.out.println("-----------------------------------adv----------------------------------------");

        advStream();
    }



    public static void advStream(){
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 4);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        numbers.stream().map(x -> x * x).forEach(y -> System.out.print(" "+y));

        System.out.println("----");

        // demonstration of reduce method
        int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (sum, i) -> sum + i);
        System.out.println(even);
    }


}