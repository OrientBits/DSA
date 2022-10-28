package com.company.dsa.function;



class IntWrapper {
    public int n;
    public IntWrapper(int n){
        this.n = n;
    }
}

//java doesn't support call by reference --  As reference points to same address of object
public class CallByRef {

    public static void main(String[] args) {

        IntWrapper a = new IntWrapper(30);
        IntWrapper b = new IntWrapper(45);

        System.out.println("Before swapping, a = " + a.n + " and b = " + b.n);
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("After swapping, a = " + a.n + " and b is " + b.n);
    }

    public static void swapFunction(IntWrapper a, IntWrapper b) {
        System.out.println("Before swapping(Inside), a = " + a.n + " b = " + b.n);
        // Swap n1 with n2
        IntWrapper c = new IntWrapper(a.n);
        a.n = b.n;
        b.n = c.n;
        System.out.println("After swapping(Inside), a = " + a.n + " b = " + b.n);
    }


}


