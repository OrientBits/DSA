package com.company.dsa.digital;

public class CardSum {

    public static void main(String[] args) {

        int input1 = 5;
        int []input2 = new int[]{-1, 2,3,4,-5};

        int total = 0, cSum=0,mSum=0;

        for (int i = 0; i < input1; i++) {

            total = total + input2[i];

            if (input2[i]<0){
                cSum = cSum - input2[i];
            }else {
             cSum = 0;
            }

            if (mSum < cSum){
                mSum = cSum;
            }

        }

        System.out.println("Total "+(total+mSum));
        System.out.println("Total after "+(total+mSum+mSum));



    }

}
