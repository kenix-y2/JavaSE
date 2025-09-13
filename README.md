# Java-Intern-21Days

## Day01

### 1.使用循环语句for打印九九乘法表
熟练for循环语句的使用

### 2.打印三角形
加强对for循环等其他循环语句的理解
### 3.简单计算器：支持四则运算
初步学习方法，方法的调用

***
## Day02
### Java初学实战：使用数组实现学生管理系统
1.项目介绍：基于Java数组实现的简易学生管理系统主要功能包扩：
- 添加学生信息
- 按学号查询学生
- 修改学生成绩
- 删除学生记录
- 列出所有学生信息
- 退出系统

2.技术特点：
- 完全使用基本数据类型和数组
- 适合刚学习Java的初学者

3.核心代码
- 使用三个数组存储学生信息
```
//存储学号,上限100个
int[] ids = new int[100];
//存储名字
String[] names= new String[100];
//存储成绩
double[] scores = new double[100];
```
- 采用while循环和switch实现菜单功能
```
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
```
- 功能方法
```
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
```
<img width="909" height="1056" alt="屏幕截图 2025-09-13 145145" src="https://github.com/user-attachments/assets/488dd72b-4026-40a0-86f7-4dc77891f712" />
