package com.company.dsa.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};

        System.out.println("Beforeeeee: " + Arrays.toString(arr));

        int len1 = removeElement(arr, 3);

        System.out.println("Len: "+len1);
        System.out.println("After :" + Arrays.toString(arr));

    }


    public static int removeElement(int[] arr, int val) {

        int a=0;
        for (int i = 0; i < arr.length -a; i++) {
            if (val == arr[i]) {
                for (int k = i; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                a++;
                i--;
            }
        }
        return (arr.length - a);
    }


}