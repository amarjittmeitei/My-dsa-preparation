package com.yawolart.pallindrom;

import java.util.Scanner;

public class CheckPalindromeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int reverse = 0;

        while(tempNum>0){
            reverse = (reverse*10)+(tempNum%10);
            tempNum /= 10;
        }
        if (num == reverse){
            System.out.println("The number is palindrome");
            return;
        }
        System.out.println("The number is not palindrome");
    }
}
