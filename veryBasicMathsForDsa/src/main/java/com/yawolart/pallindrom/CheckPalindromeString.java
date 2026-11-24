package com.yawolart.pallindrom;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        StringBuilder reverseName = new StringBuilder(name.length());

        for(int i = 0; i<name.length(); i++){
            reverseName.append(name.charAt(name.length()-1-i));
        }

        String reverseNameStr = new String(reverseName);
        if(name.equals(reverseNameStr)){
            System.out.println(name + " is palindrome");
            return;
        }
        System.out.println(name+ " is not palindrome");
    }
}
