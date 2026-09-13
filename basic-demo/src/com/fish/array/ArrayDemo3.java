package com.fish.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
        数组的遍历：
        格式：
        for(int i=0;i<数组长度;i++){
            循环体
        }
         */
        //利用静态初始化定义一个数组
        int[] age = {18, 19, 20};
        //遍历数组
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }
    }
}
