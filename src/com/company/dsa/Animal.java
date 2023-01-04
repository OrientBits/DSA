package com.company.dsa;

interface Dog{
    void bark();
}

class Cat implements Dog{
    public void bark(){
        System.out.println("meww");
    }
}

public class Animal
{

    public static void main (String[] args)
    {
        Dog dog = new Cat();
        dog.bark();
    }
}