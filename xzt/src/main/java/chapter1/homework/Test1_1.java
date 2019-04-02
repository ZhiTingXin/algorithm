package chapter1.homework;

import java.util.Scanner;

public class Test1_1 {
    private static void test1(){
        System.out.println("第一题");
        System.out.println((0+15)/2);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true&&false||true&&true);

    }

    private static void test2(){
        System.out.println("第二题");
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1>=4.0);
        System.out.println(1+2+"3");

    }

    private static void test3(){
        System.out.println("第三题");
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i=0;i<3;i++){
            a[i] = scanner.nextInt();
        }
        if (a[0]==a[1]&&a[1]==a[2]){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }

    private static void test4(){
        System.out.println("第四题");
        int a = 0;
        int b =0;
        //java中不支持then语句
        // if(a>b)then c=0;
        //java中的条件应该用小括号括住
        //if a>b {a=0;}
        //三个成立
        //四个c=0之后应该有；

    }

    private static void test5(double x,double y){
        System.out.println("第五题");
        if (x<1.0&&x>0.0){
            if (y<1.0&&y>0){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");

    }

    private static void test6(){
        System.out.println("第六题");
        int f = 0;
        int g = 1;
        for (int i=0;i<=15;i++){
            System.out.println(f);
            f = f+g;
            g =f-g;
        }
    }
    public static void main(String [] args){
        test1();
        test2();
        test3();
        test4();
        test5(0.23,1.0);
        test6();

    }
}
