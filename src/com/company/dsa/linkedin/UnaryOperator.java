package com.company.dsa.linkedin;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperator {

    public static void main(String[] args) {

        List<String> dates = new ArrayList<>();

        dates.add("12/01/2022");
        dates.add("13/07/2022");
        dates.add("14/06/2022");
        dates.add("15/06/2021");
        dates.add("16/05/2020");
        dates.add("17/03/2022");
        System.out.println(dates);

        java.util.function.UnaryOperator<String> replaceSlashes = date -> date.replace("/","-");

        System.out.println(replaceSlashes.apply(dates.get(1)));


    }
}
