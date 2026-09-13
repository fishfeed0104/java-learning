package com.fish.array;

public class Test6 {
    public static void main(String[] args) {
        /*
        给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的那两个整数
        并输出他们的数组索引
         */
        //定义一个数组
        int[] nums = {2,7,11,15};
        //定义一个目标值
        int target = 9;

        //遍历数组
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
