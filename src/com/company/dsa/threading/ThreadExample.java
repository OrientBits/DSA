package com.company.dsa.threading;

public class ThreadExample extends Thread {

    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        ThreadExample t1=new ThreadExample();
        ThreadExample t2=new ThreadExample();
        t1.start();
        t2.start();


        if(t1.getState()!=Thread.State.TERMINATED){
            System.out.println("Terminated");
        }else {
            System.out.println("Not terminated");
        }


    }
}
