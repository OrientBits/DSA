package com.company.dsa.oops;


// Covariant return type =  It allows to narrow down return type
class SuperClass {
    SuperClass get() {
        System.out.println("SuperClass");
        return this;
    }
}

class SubClass extends SuperClass {
    SubClass get() {
        System.out.println("SubClass");
        return this;
    }
}

public class Tester  {
    public static void main(String[] args) {
        SuperClass subClass = new SubClass();
        subClass.get();
    }
}