package com.fish.looploop;

public class Test4 {
    public static void main(String[] args) {
        /*
        打印空心菱形
               *
              * *
             *   *
              * *
               *
         */
        for (int i = 1; i <= 5; i++) {
            if (i <= 3) {
                for (int j = i; j <= 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i > 1) {
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

            } else {
                for (int j = 4; j <= i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if (i < 5) {
                    for (int j = 4; j <= i; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }


            }

            System.out.println();
        }
    }
}