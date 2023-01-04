package com.company.dsa.constructor;


public class Test
{
    static int i = 10;
    int j =10;
    public Test ()
    {
        System.out.println(this.i);
        System.out.println(Test.i);

        System.out.println(this.j);
       // System.out.println(Test.j);
    }
    public static void main (String[] args)
    {
        Test t = new Test();
    }
}