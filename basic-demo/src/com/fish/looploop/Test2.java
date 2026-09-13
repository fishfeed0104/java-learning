package com.fish.looploop;

public class Test2 {
    public static void main(String[] args) {
        /*
        利用循环打印平行四边形*
            *****
           *****
          *****

          方法二
         */
        //外层循环控制行数
        for (int i = 1; i <= 3; i++) {
            //内层循环控制每一行多少个*
           for(int j = i; j <= 2; j++){
                System.out.print(" ");
            }
           for(int j = 1; j <= i; j++){
                System.out.print("*");
           }
           for(int j = 1; j <=2; j++){
                System.out.print("*");
           }
           for(int j = i; j <=2; j++){
                System.out.print("*");
           }

            System.out.println();
        }

    }
}
