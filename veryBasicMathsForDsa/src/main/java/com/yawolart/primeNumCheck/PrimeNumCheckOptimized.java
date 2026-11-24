package com.yawolart.primeNumCheck;

//time complexity: O(sqrt(N)), N is the number to check

public class PrimeNumCheckOptimized {
    public static void main(String[] args) {
        int num = 23;
        int count = 3;

        if(num <= 0 || (num%2) == 0){
            System.out.println(num + " is not prime");
        }

        //check till its sqrt only after that its factor start repeating
        //there while run for only 2 time when the unoptimized code run for 21 times
        while(count*count <= num){
            if(num%count == 0){
                System.out.println(num + " is not a prime number. " +
                        "(Found after " +(count -3) + " check)");
                return;
            }
            count++;
        }
        System.out.println(num + " is a prime number. " +
                "(Found after " +(count-3) + " check)");
    }
}
