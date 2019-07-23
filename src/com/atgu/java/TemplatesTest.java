package com.atgu.java;


import com.atgu.bean.com.atgu.bean.Customer;

import java.util.ArrayList;

/**
 * @author zhangben
 *需要熟悉什么模板去这里面看
 * 1,代码模板所处的位置 setting-Editor-live Templates / Postfix Comletetion
 *2,常用的模板有多少
 * @create 2019-07-22 18:24
 */
public class TemplatesTest {

    //模板六:prsf
    private static final Customer CUST = new Customer();

    //变形
    public static final  int NUM = 1;
    //变形psfi
    public static final int NUM2=2;
    //变形 psfs
    public static final String  TEACHER = "AS";

    //模板1 psvm  ,字的缩写
    public static void main(String[] args) {


        System.out.println("helle");
        //变形： soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        System.out.println("args = " + args);
        int i = 11;
        System.out.println("i = " + i);
        int num1 = 10;
        int num2 = 2;
        System.out.println("num2 = " + num2);
        System.out.println(num1);//num1.sout
        
        
        //模板三： fori
        String[] arr = new String[]{"Tom","Jerry","hanmeimei","Lilei"};
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);//arr[j].sout
        }
        //变形：iter 生成的是增强for循环//只能遍历数组和实现了Iterable接口的集合
        for (String s : arr) {
            System.out.println(s);//s.sout

        }
        //变形itar  回车   都是模板
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }

        //模板四：list.for
//        new ArrayList();//alt + enter 输出一个我们的变量
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(33);
        list.add(353);

        for (Object o : list) {//因为没写泛型 默认是Object
            
        }
        //变形:list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {
            
        }
        //变形：list.forr
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {//倒序遍历，模板不用我们一点一点敲了
            
        }
    }
    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(33);
        list.add(353);
        //模板五:ifn

        if (list == null) {
            
        }
        //变形：inn  if not null
        if (list != null) {
            
        }
        //变形：xxx.nn //xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }


}
