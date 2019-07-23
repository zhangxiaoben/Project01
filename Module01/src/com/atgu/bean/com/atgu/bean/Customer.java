package com.atgu.bean.com.atgu.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class Customer{
    private static final int initial_size = 10;
    private static int num2;

    //这是单行注释
    public static void main(String[] args){


        //region Description
        System.out.println("HelloWorls1！");

        ArrayList list = new ArrayList();
        //endregion


        Date date = new Date(); //可以理解生成返回值和返回值类型

        list.add(0 ,123);
        list.add(0,"dd");
        printTest(list);

//        method1();
    }
    public static void printTest(ArrayList list) {
        System.out.println(list);
    }

    public static void method1(){
        num2 = 10;
            try {
                FileInputStream fis = new FileInputStream("hello.txt");//alt+ enter
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}
