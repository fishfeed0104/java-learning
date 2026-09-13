package com.fish.array;

public class Test7 {
    public static void main(String[] args) {
        /*
        给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引
        如果目标值不存在于数组中，打印应插入的位置
         */
        //定义一个数组
        int[] nums = {1,3,5,6};
        //定义一个目标值
        int target = 2;
        //遍历数组
        int result = nums.length; // 默认为数组长度（target 大于所有元素时的插入位置）
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
