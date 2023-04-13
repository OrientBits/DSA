package com.company.dsa.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Problem {

    public static void main(String[] args) {

        String a = "anagram";
        String b = "margana";

        Map m1 = match(a);
        Map m2 = match(b);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m1.equals(m2));

    }


    public static Map match(String a){
        Map<Character, Integer> m1 = new HashMap<>();

        int i = 0;
        while (i < a.length()) {
            System.out.println("String....: "+a);
            String a1 = a;
            char c = a1.charAt(0);
            int count = 0;

            while (a1.contains(""+c)){
                a1 = a1.substring(a1.indexOf(""+c)+1);
                count++;
            }

            m1.put(c,count);

            a = a.replaceAll(c+"","");

            i= 0;

        }

        return m1;
    }




}
