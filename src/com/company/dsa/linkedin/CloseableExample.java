package com.company.dsa.linkedin;

public class CloseableExample implements AutoCloseable {

    public static void main(String[] args) {

        try {

        } catch (Exception e) {

        }


    }

    @Override
    public void close() throws Exception {
        System.out.println("close method");
    }

}
