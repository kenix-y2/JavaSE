package com.guo.test;

import java.util.Scanner;

//功能清单1.添加学生，2.按学号查询 3.修改成绩 4.删除学生 5.列出所有 6.退出
public class StudentManager {
    public static void main(String[] args) {
        //存储学号,上限100个
        int[] ids = new int[100];
        //存储名字
        String[] names= new String[100];
        //存储成绩
        double[] scores = new double[100];
        //记录当前学生数量
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请选择你想要进行的操作:1.添加学生，2.按学号查询 3.修改成绩 4.删除学生 5.列出所有 6.退出");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addStudent(ids,names,scores,count,scanner);
                    if(count<100) count++;
                    break;
                case 2:
                    searchStudent(ids,names,scores,count,scanner);
                    break;
                case 3:
                    modifyScore(ids,scores,count,scanner);
                    break;
                case 4:
                    count=deleteStudent(ids,names,scores,count,scanner);
                    break;
                case 5:
                    listAllStudents(ids,names,scores,count);
                    break;
                case 6:
                    exitStudent(scanner);
                    break;
                default:
                    System.out.println("无效的选择，请重新选择1-6");
            }
        }

    }
    //1.添加学生
    public static void addStudent(int[] ids,String[] names, double[] scores,int count,Scanner scanner){
        if(count>=100){
            System.out.println("学生已达上限，无法添加");
        }else {

            System.out.println("请输入学生学号");
            ids[count] = scanner.nextInt();
            System.out.println("请输入学生姓名");
            names[count] = scanner.next();
            System.out.println("请输入成绩");
            scores[count] = scanner.nextDouble();
            System.out.println("添加成功");

        }
    }
    //2.按学号查询
    public static void searchStudent(int[] ids,String[] names,double[] scores,int count,Scanner scanner){
        System.out.println("请输入你要查找的学号");
        int searchId= scanner.nextInt();
        boolean found=false;
        for (int i = 0; i <count ; i++) {
            if(searchId==ids[i]){
                System.out.println("学号+姓名+成绩:"+ids[i]+"+"+names[i]+"+"+scores[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("未找到该学号的学生");
        }
    }
    //3.修改成绩
    public static void modifyScore(int[] ids,double[] scores,int count,Scanner scanner){
        System.out.println("请输入要修改成绩学生的学号");
        int modifyId = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(ids[i]==modifyId){
                System.out.println("请输入学生新成绩");
                scores[i]=scanner.nextDouble();
                System.out.println("成绩修改成功");
                found=true;
            }
        }
        if (!found){
            System.out.println("未查找到该学生");
        }
    }
    //4.删除学生
    public static int deleteStudent(int[] ids,String[] names,double[] scores,int count,Scanner scanner){
        System.out.println("请输入你要删除学生的学号");
        int deleteId = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(ids[i]==deleteId){
                for (int j = i; j <count-1 ; j++) {
                    ids[j]=ids[j+1];
                    names[j]=names[j+1];
                    scores[j]=scores[j+1];
                }
                System.out.println("删除成功");
                found=true;
                return count-1;
            }
        }
        if (!found){
            System.out.println("没有该学号的学生");
        }
        return count;
    }

    //5.列出所有
    public static void listAllStudents(int[] ids,String[] names,double[] scores,int count){
        if (count==0){
            System.out.println("当前无学生");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(ids[i]+"\t"+names[i]+"\t"+scores[i]+"\t");
        }
    }
    //6.退出
    public static void exitStudent(Scanner scanner){
        System.out.println("感谢使用，再见");
        scanner.close();
        System.exit(0);
    }
}

