package com.company.dsa.linkedin;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        int result = 0;

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            result += entry.getValue();
        }

        System.out.println(result); // output 6

    }
}
