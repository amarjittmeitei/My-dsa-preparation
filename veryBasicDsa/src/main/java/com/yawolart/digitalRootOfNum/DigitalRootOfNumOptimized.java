package com.yawolart.digitalRootOfNum;

//Time complexity: O(1)

public class DigitalRootOfNumOptimized {
    public static void main(String[] args) {
        int num = 23856324;
        int digitalRoot = num == 0?0:1+(num-1)%9;
        System.out.println("Digital root of " +num+ " is " + digitalRoot);
    }
}
