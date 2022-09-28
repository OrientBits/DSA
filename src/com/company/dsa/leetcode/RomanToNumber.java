package com.company.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {

        Solution obj = new Solution();
        obj.romanToInt("XXIX");
    }
}


class Solution {

    public void romanToInt(String s) {
        int pre = 0,curr = 0,sum = 0,add=0;

        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();

        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        for (int i = 0; i < s.length(); i++) {
            curr = map.get(""+s.charAt(i));

            if(pre <= curr){
                sum = sum + curr;
            }else{
                sum = sum - curr;
            }
            pre = curr;

        }//loop

        System.out.println("Roman to No: " + sum);
    }
}