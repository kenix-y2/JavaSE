package com.guo.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
