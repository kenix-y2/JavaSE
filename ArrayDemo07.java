package com.guo.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        //冒泡排序
        //1.比较数组中两个相邻数的大小，如果后面的数比前面小则交换位置，否则不交换
        //2.这一步就找出来数组中最大的数或者最小的数
        //3.下一轮就少一次排序
        //4.依次循环直达结束
        int[] arrays={13,54,66,2,3,90};
        sort(arrays);
        System.out.print(Arrays.toString(arrays));
    }
    public static int[] sort(int[] arrays){
        int temp=0;
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = 0; j < arrays.length-1-i; j++) {
                if (arrays[j]>arrays[j+1]){
                    temp=arrays[j+1];
                    arrays[j+1]=arrays[j];
                    arrays[j]=temp;
                }
            }
        }
        return arrays;
    }
}
