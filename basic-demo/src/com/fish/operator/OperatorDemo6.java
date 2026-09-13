package com.fish.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        /*
        实现一个字母的大小写转换，将大写字母转换为小写字母
        A -> a
         */

        //由于ascII表中大写字母A为65，小写字母a为97,

        char c = 'A';
        char cc = (char) (c + 32);
        System.out.println(cc);


    }
}
