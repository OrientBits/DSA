package com.company.dsa.linkedin;

import java.util.function.Function;

public class StaticFunction {

    public static void main(String[] args) {
        Function<Integer,Integer> myFunction = StaticFunction::myFunction;

        System.out.println(myFunction);
    }

    private static Integer myFunction(Integer integer) {
        return 10;
    }
}
