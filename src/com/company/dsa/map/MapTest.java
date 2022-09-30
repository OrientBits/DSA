package com.company.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 20, 5, 20, 5, 30};

        countFrequency(arr);

    }

    public static void countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

    }
}
