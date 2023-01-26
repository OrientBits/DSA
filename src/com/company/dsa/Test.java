package com.company.dsa;

import java.util.Date;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {

        String randomId = UUID.randomUUID().toString();
        String name = "Hello.jpeg";

        System.out.println(randomId.concat(name.substring(name.lastIndexOf("."))));


    }


}
