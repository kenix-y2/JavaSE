package com.guo.struct;

public class TestDemo01 {
    public static void main(String[] args) {
        //打印三角形 五行
        for (int i = 1; i <= 5; i++) {
            //一开始就要打五个空格由多变少所以j不断减小但是不能小于i
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            //*由少变多所以增加但是不能比i大
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            //*也由少变多但是比上面一个循环少一个*所以j<i而不用等于
            for (int j = 1; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
