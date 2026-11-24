package com.yawolart.factorial;

public class Factorial {
    public static void main(String[] args) {
        int num = 13;
        long factorial = 1;
        for(int i = 2; i<=num; i++)
            factorial *= i;
        System.out.println("Factorial of " +num+ " is " + factorial);
    }
}
