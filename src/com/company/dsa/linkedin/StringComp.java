package com.company.dsa.linkedin;

public class StringComp {
    public static void main(String[] args) {
        String a = "bikini";
        String a2 = "bikini";



        String b = new String("Bikini");

        String c = new String("Bikini");

        System.out.println(a==b);
        System.out.println(b==c);

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

    }
}
