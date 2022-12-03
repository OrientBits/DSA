package com.company.dsa.oops;


class A{
    public int print(int a){
        System.out.println("printing from A");
        return a*a;
    }
}

class B extends A{

    public int print(int a){
        System.out.println("printing from B");
        return 5;
    }

}



public class overriding {

    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.print(5));
    }
}
