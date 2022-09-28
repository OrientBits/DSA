package com.company.dsa.leetcode;

public class AddBinary {
    public static void main(String[] args) {

        System.out.println("\n" + addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {

        int carry = 0;
        int sum = 0;
        String output = "";

        int len = 0;
        if (a.length() > b.length()) {
            len = a.length();
            b = String.format("%0" + (len - b.length()) + "d%s", 0, b);
        } else {
            len = b.length();
            if (len != a.length())
                a = String.format("%0" + (len - a.length()) + "d%s", 0, a);
        }

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        for (int i = len - 1; i >= 0; i--) {
            sum = (a.charAt(i) - 48) + (b.charAt(i) - 48);

            if (carry == 1)
                sum = sum + carry;

            System.out.print(" " + sum);

            if (sum == 2) {
                carry = 1;
                output = 0 + output;
            } else if (sum == 1) {
                output = 1 + output;
                carry = 0;
            } else if (sum == 3) {
                carry = 1;
                output = 1 + output;
            } else {
                output = 0 + output;
                carry = 0;
            }
        }

        if (carry == 1) {
            output = 1 + output;
        }

        System.out.println("OutPUt: " + output);

        while (true && output.length() > 1) {
            if (output.charAt(0) == '0')
                output = output.substring(1);
            else break;
        }

        return output;
    }

}
