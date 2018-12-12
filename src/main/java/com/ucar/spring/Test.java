package com.ucar.spring;

/**
 * 版权声明：CopyRight (c) 2018 ucarinc. All Rights Reserved.
 *
 * @author : 张勇杰
 * @date : 2018/12/8 15:57
 * @Version : v1.0
 * @description
 **/
public class Test {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = new String("a");
        System.out.println(a==b);
        System.out.println(a.equals(c));
    }
}
