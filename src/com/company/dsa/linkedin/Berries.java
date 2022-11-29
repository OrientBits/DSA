package com.company.dsa.linkedin;

public class Berries {
    String berry = "blue";

    public static void main(String[] args) {
        new Berries().juicy("straw");
    }

    void juicy(String berry){
        this.berry = "resp";
        System.out.println(berry+"berry");
    }

}
