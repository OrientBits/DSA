package com.company.dsa.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\''+
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}



public class ComparableComparator {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(29,"Neha"));
        list.add(new Student(3,"Ramshek"));
        list.add(new Student(17,"Kaddu"));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }



}


