package com.yawolart.reverse;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        //String name = "Amarjit";
        StringBuilder reverseName = new StringBuilder(name.length());

        for (int i = 0; i<name.length(); i++){
            reverseName.append(name.charAt(name.length()-i-1));
        }

        System.out.println("Reverse of " + name + " is " + reverseName);
    }
}
