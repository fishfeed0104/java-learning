package com.fish.looploop;

public class Test3 {
    public static void main(String[] args) {
        /*
        打印菱形
              *
             ***
            *****
           *******
            *****
             ***
              *
         */
        for (int i = 1; i <= 7; i++) {
            if (i <= 4) {
                for (int j = i; j <= 3; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 5; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 15 - 2 * i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}