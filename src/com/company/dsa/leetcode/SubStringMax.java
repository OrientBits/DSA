package com.company.dsa.leetcode;

import java.util.ArrayList;

public class SubStringMax {


    public static void main(String[] args) {

        String given = "abcabcbb";
        ArrayList<String> list = new ArrayList<>();

        String s;

        s = ""+given.charAt(0);

        for (int i = 1; i < given.length(); i++) {

            if (s.contains(""+given.charAt(i))){
                list.add(s);
                s = s.substring(s.indexOf(given.charAt(i))+1)+given.charAt(i);
                System.out.println("s "+s);
            }else {
                s = s + ""+given.charAt(i);
            }
        }

        list.add(s);

        System.out.println("String: "+s);

        System.out.println(list);

        int max=0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()){
                max = list.get(i).length();
            }
        }


        System.out.println(max);


    }

}
