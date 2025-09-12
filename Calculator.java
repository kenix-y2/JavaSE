package com.guo.test;

import java.util.Scanner;

/*
       写一个计算器
       要求实现加减乘除功能
       并且能够循环接收新的数据
       通过用户交互实现

       思路推荐:
       写四个方法加减乘除
       利用循环+switch进行用户交互
       传递需要操作的两个数
       输出结果
         */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next="Yes";
        while (next.equals("Yes")){
            System.out.println("请输入你要选择的计算方法");
            String str=scanner.next();
            double sum=0;
            switch (str){
                case "+":
                    System.out.println("请输入两个数");
                    double a=scanner.nextDouble();
                    double b=scanner.nextDouble();
                    sum=add(a,b);
                    System.out.println(sum);
                    break;
                case "-":
                    System.out.println("请输入两个数");
                    double c=scanner.nextDouble();
                    double d=scanner.nextDouble();
                    sum=subtract(c,d);
                    System.out.println(sum);
                    break;
                case "*":
                    System.out.println("请输入两个数");
                    double e=scanner.nextDouble();
                    double f=scanner.nextDouble();
                    sum=multiply(e,f);
                    System.out.println(sum);
                    break;
                case "/":
                    System.out.println("请输入两个数");
                    double g=scanner.nextDouble();
                    double h=scanner.nextDouble();
                    sum=divide(g,h);
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("输入运算格式不正确");
            }

            System.out.println("是否继续计算，如果是请输入Yes，否则按任意键退出即可");
            next=scanner.next();

        }
        scanner.close();
    }

    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a/b;
    }
}
