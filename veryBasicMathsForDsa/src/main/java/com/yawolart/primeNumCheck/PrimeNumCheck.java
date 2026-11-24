package com.yawolart.primeNumCheck;


//time complexity: O(N-2), N in the input num in worse case

public class PrimeNumCheck {
    public static void main(String[] args) {
        int num = 23;
        int count = 2;

        while(count<num){
            if(num%count == 0){
                System.out.println(num + " is not a prime number. " +
                        "(Found after " +(count-2) + " check)");
                return;
            }
            count++;
        }

        System.out.println(num + " is a prime number. " +
                "(Found after " +(count-2) + " check)");
    }
}
