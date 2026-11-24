package com.yawolart.sumOfNum;

//time complexity: O(N), where N is the total count of digit in the num

public class SumOfNum {
    public static void main(String[] args) {
        int num = 12345;
        int tempNum = num;
        int sum = 0;
        while(tempNum>0){
            sum += tempNum%10;
            tempNum /= 10;
        }
        System.out.println("Sum of all digits of " + num + " is " + sum);
    }
}
