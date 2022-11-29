package com.company.dsa.linkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        List<String> dates = new ArrayList<>();

        dates.add("12/01/2022");
        dates.add("13/07/2022");
        dates.add("14/06/2022");
        dates.add("15/06/2021");
        dates.add("16/05/2020");
        dates.add("17/03/2022");
        System.out.println(dates);

        UnaryOperator<String> replaceSlashes = date -> date.replace("/","-");

        dates.replaceAll(replaceSlashes);

        System.out.println(dates.get(0).replace("/","+"));


    }
}
