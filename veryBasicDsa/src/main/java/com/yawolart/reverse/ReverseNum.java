package com.yawolart.reverse;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345;
        int tempNum = num;
        int reverse = 0;
        while(tempNum>0){
            reverse = (reverse*10) + tempNum%10;
            tempNum /= 10;
        }
        System.out.println("Reverse of " + num + " is " + reverse);
    }
}
