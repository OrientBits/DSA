package com.company.dsa;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String s = "This is java from and orientbits";
        String w1 = "java";
        String w2 = "orientbits";

        String[] s1 = s.split(" ");
        System.out.println(s.contains("java"));

        for (int i = 0; i < s1.length; i++) {
            if (w1.equals(s1[i])){
                for (int j = 0; j < s1.length; j++) {
                    if (w2.equals(s1[j])){
                        System.out.println("J:"+j +"   i:"+i+" ==  "+(j-i-1));
                        break;
                    }
                }
            }
        }

        System.out.println();

    }

}
