package com.company.dsa.bufferReader;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("output: "+ findSmallestNo("24"));

    }




    public static int findSmallestNo(String s){
        if (!s.contains("1")){
            return -1;
        }

        int output = -1;
        StringBuilder sb = new StringBuilder(s.substring(s.indexOf("1")));
        boolean isDivided =false;

        List<Integer> dividedNo = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1')
                dividedNo.add(i+1);
        }

        output = dividedNo.size();

        while (true) {
            for (int i = 0; i < dividedNo.size(); i++) {
                if (output % dividedNo.get(i) == 0) {
                    isDivided = true;
                } else {
                    isDivided = false;
                    output++;
                    break;
                }
            }
            if (isDivided){
                System.out.println("Divided by all 1's");
                break;
            }
        }

        return output;
    }



}
