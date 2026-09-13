package com.fish.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        /*
        数组的常见问题：
        索引越界异常
         */
        //利用静态初始化定义一个数组
        int[] age = {18, 19, 20};
        //访问数组的第4个元素
        //System.out.println(age[3]);
        int index = 10;
        //添加一个判断
        if(index>=0&&index<age.length){
            System.out.println(age[index]);
        }else{
            System.out.println("索引越界");
        }
    }
}
