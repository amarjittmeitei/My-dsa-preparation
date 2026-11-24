package com.yawolart.digitalRootOfNum;

//time complexity: O(N), N is the total number of digits in the num

public class DigitalRootOfNum {
    public static void main(String[] args) {
        int num = 23856324;
        int tempNum = num;
        int digitalRoot = num;


        while(digitalRoot>=10){
            digitalRoot = 0;
            while(tempNum > 0){
                digitalRoot += tempNum%10;
                tempNum /= 10;
            }
            System.out.println("Intermediate digital root: "
                    + digitalRoot);
            tempNum = digitalRoot;
        }

        System.out.println("The final digital root of " + num+ " is "
                + digitalRoot);
    }
}
