package com.company.dsa;


public class Test {

    public static void main(String[] args) {
        something(5,returnSome(6));
    }

    public static void something(int a, int b){
        System.out.println(a+b);
    }


    public static int returnSome(int a){
        return a;
    }


}
